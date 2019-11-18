package pro.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import pro.Application;
import pro.entity.User;
import pro.logic.UserLogic;

/**
 * 用户编辑弹窗
 */
public class UserEditController {

    User user = Application.ac.getBean("user", User.class);
    UserLogic userLogic = Application.ac.getBean("userLogic", UserLogic.class);


    @FXML
    private TextField id;
    @FXML
    private TextField userName;
    @FXML
    private TextField userPwd;
    @FXML
    private TextField userJob;
    @FXML
    private TextField department;

    /**
     * 初始化
     */
    @FXML
    private void initialize() {

    }

    /**
     * 保存
     */
    @FXML
    private void save() {
        user.setId(Long.valueOf(id.getText()));
        user.setUserName(userName.getText());
        user.setUserPwd(userPwd.getText());
        user.setUserJob(Integer.valueOf(userJob.getText()));
        user.setDepartment(department.getText());
        userLogic.insert(user);

    }

    /**
     * 取消
     */
    @FXML
    private void cancel() {

    }


    public User getUser() {
        user.setId(Long.valueOf(id.getText()));
        user.setUserName(userName.getText());
        user.setUserPwd(userPwd.getText());
        user.setUserJob(Integer.valueOf(userJob.getText()));
        user.setDepartment(department.getText());
        return user;
    }

    public void setUser(User user) {
        this.user = user;
        //渲染数据
        id.setText(String.valueOf(user.getId()));
        userName.setText(String.valueOf(user.getUserName()));
        userPwd.setText(String.valueOf(user.getUserPwd()));
        userJob.setText(String.valueOf(user.getUserJob()));
        department.setText(user.getDepartment());
    }
}
