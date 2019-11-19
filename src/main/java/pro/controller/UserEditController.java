package pro.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import pro.Application;
import pro.entity.User;
import pro.logic.UserLogic;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Random;

/**
 * 用户编辑弹窗
 */
public class UserEditController {
    Stage me;

    User user = Application.ac.getBean("user", User.class);
    UserLogic userLogic = Application.ac.getBean("userLogic", UserLogic.class);


    @FXML
    private TextField id;
    @FXML
    private TextField userName;
    @FXML
    private TextField userPwd;
    @FXML
    private ComboBox<String> userJob;
    @FXML
    private TextField department;

    /**
     * 初始化
     */
    @FXML
    private void initialize() {

        /**
         * id 生成
         * 共11位, 由当前时间生成(年4, 月2, 日2, 毫秒3)
         */
        Date date = new Date(System.currentTimeMillis());
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMddSSS");
        String format1 = format.format(date);
        id.setText(format1);

        //身份管理
        ObservableList<String> jobs = FXCollections.observableArrayList("管理员", "普通用户");
        userJob.setItems(jobs);
    }

    /**
     * 保存
     */
    @FXML
    private void save() {
        //检查数据合法性
        if (!check()) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setContentText("您的输入有误！");
            alert.showAndWait();
            return;
        }

        user.setId(Long.valueOf(id.getText()));
        user.setUserName(userName.getText());
        user.setUserPwd(userPwd.getText());
        user.setUserJob(userJob.getValue().equals("管理员") ? 2 : 1);
        user.setDepartment(department.getText());


        //数据库数据更新
        userLogic.delete(user.getId());
        userLogic.insert(user);

        //UI视图数据更新
        UserListController.updateUsers();

        //关闭编辑框（当前窗口）
        me.close();
    }

    /**
     * 取消
     */
    @FXML
    private void cancel() {
        me.close();
    }

    public void init(Stage page) {
        me = page;
    }

    /**
     * 校验输入框内的信息是否正确
     *
     * @return
     */
    private boolean check() {
        String userName = this.userName.getText().replace(" ", "");
        String userPwd = this.userPwd.getText().replace(" ", "");
        String department = this.department.getText().replace(" ", "");

        if ("".equals(userName)) {
            this.userName.setText(userName);
            return false;
        } else if ("".equals(userPwd)) {
            this.userPwd.setText(userPwd);
            return false;
        } else if ("".equals(department)) {
            this.department.setText(department);
            return false;
        }

        return true;
    }


    public User getUser() {
        user.setId(Long.valueOf(id.getText()));
        user.setUserName(userName.getText());
        user.setUserPwd(userPwd.getText());
        user.setUserJob(Integer.valueOf(userJob.getValue()));
        user.setDepartment(department.getText());
        return user;
    }

    public void setUser(User user) {
        this.user = user;
        //渲染数据
        id.setText(String.valueOf(user.getId()));
        userName.setText(String.valueOf(user.getUserName()));
        userPwd.setText(String.valueOf(user.getUserPwd()));
        userJob.setValue(user.getUserJob() == 1 ? "普通用户" : "管理员");
        department.setText(user.getDepartment());
    }
}
