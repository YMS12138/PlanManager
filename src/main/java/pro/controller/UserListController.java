package pro.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import pro.Application;
import pro.entity.User;
import pro.logic.UserLogic;

import java.io.IOException;
import java.util.List;


/**
 * 用户信息界面
 */
public class UserListController {

    static UserLogic userLogic;
    static ObservableList<User> user = FXCollections.observableArrayList();
    @FXML
    private TableView<User> personTable;

    @FXML
    private TableColumn firstNameColumn;
    @FXML
    private TableColumn lastNameColumn;


    @FXML
    private Label userName;
    @FXML
    private Label userPassword;
    @FXML
    private Label userJob;
    @FXML
    private Label department;


    /**
     * 初始化
     */
    public void initialize() {
        userLogic = Application.ac.getBean("userLogic", UserLogic.class);
        List<User> users = null;
        personTable.setItems(user);

        users = userLogic.findAll();
        firstNameColumn.setCellValueFactory(new PropertyValueFactory<>("userName"));
        lastNameColumn.setCellValueFactory(new PropertyValueFactory<>("department"));
        user.setAll(users);
        showDetail(null);

        personTable.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> showDetail(newValue));
    }

    /**
     * 与TableView表格数据关联
     *
     * @param user
     */
    private void showDetail(User user) {
        if (user != null) {
            userName.setText(user.getUserName());
            userPassword.setText(user.getUserPwd());
            userJob.setText(user.getUserJob() == 1 ? "普通用户" : "管理员");
            department.setText(user.getDepartment());
        } else {
            userName.setText("");
            userPassword.setText("");
            userJob.setText("");
            department.setText("");
        }
    }

    /**
     * 新建一个用户账号
     */
    @FXML
    private void create() {
        //打开编辑面板
        try {
            Application.application.showUserEdit();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 修改当前选中的用户账号
     */
    @FXML
    private void update() {
        //获取当前选中用户
        User selectedItem = personTable.getSelectionModel().getSelectedItem();

        if (selectedItem == null) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("未选中");
            alert.showAndWait();
            return;
        }

        //打开编辑面板
        try {
            Application.application.showUserEdit(selectedItem);
            User user = Application.ac.getBean("user", User.class);
            UserLogic userLogic = Application.ac.getBean("userLogic", UserLogic.class);
            user.setId(Long.valueOf(selectedItem.getId()));
            user.setUserName(selectedItem.getUserName());
            user.setUserPwd(selectedItem.getUserPwd());
            user.setUserJob(Integer.valueOf(selectedItem.getUserJob()));
            user.setDepartment(selectedItem.getDepartment());
//            userLogic.update(user, selectedItem.getId());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 删除当前选中的用户账号
     */
    @FXML
    private void delete() {
        //获取当前选中的用户
        User selectedItem = personTable.getSelectionModel().getSelectedItem();

        if (selectedItem == null) {
            //张三（此管理员不可以删除）
            if (selectedItem.getId() == 2) {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setContentText("此管理员不可以删除！");
                alert.showAndWait();
                return;
            }
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("未选中");
            alert.showAndWait();
            return;
        } else {
            UserLogic userLogic = Application.ac.getBean("userLogic", UserLogic.class);
            userLogic.delete(selectedItem.getId());
        }

        updateUsers();
    }

    /**
     * 更新tableView
     */
    public static void updateUsers() {
        UserListController.user.setAll(userLogic.findAll());
    }
}
