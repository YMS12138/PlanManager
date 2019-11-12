package pro.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import pro.Application;
import pro.entity.User;
import pro.logic.UserLogic;
import pro.mapper.IUser;

import java.util.List;


/**
 * 加载用户信息界面
 */
public class UserListController {

    ObservableList<User> user = FXCollections.observableArrayList();
    @FXML
    private TableView<User> personTable;

    @FXML
    private TableColumn firstNameColumn;

    @FXML
    private TableColumn lastNameColumn;


    public void initialize() {
        UserLogic userLogic = Application.ac.getBean("userLogic", UserLogic.class);
        List<User> users = null;
        personTable.setItems(user);

        users = userLogic.findAll();
        firstNameColumn.setCellValueFactory(new PropertyValueFactory<>("userName"));
        lastNameColumn.setCellValueFactory(new PropertyValueFactory<>("department"));
        user.addAll(users);
    }
}
