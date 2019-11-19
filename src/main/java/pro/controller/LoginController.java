package pro.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import pro.Application;
import pro.logic.UserLogic;

import java.io.IOException;


/**
 * 登录页面
 */
public class LoginController {

    UserLogic u = new UserLogic();

    /**
     * 用户名文本框
     */
    @FXML
    private TextField username;

    /**
     * 用户密码文本框
     */
    @FXML
    private TextField password;

    /**
     * 初始化
     */
    @FXML
    private void initialize() {

    }

    /**
     * 登陆方法 登陆成功根据不同身份切换不同页面（需要判断身份）
     */
    @FXML
    public void login() {
        String name = username.getText();
        String pwd = password.getText();
        System.out.println(name);
        System.out.println(pwd);
        u.UserLogin(name, pwd);

        if (Application.user == null) {
            return;
        }

        //跳转页面
        if (Application.user.getUserJob() == 1) {
            //管理员进审批页面
            try {
                Application.application.requirement();
                RequirementController.title.setText("需求计划-需求审核");
                Application.application.showApproval();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            //其他用户进新建需求页面
            try {
                Application.application.requirement();
                RequirementController.title.setText("需求计划-需求审核");
                Application.application.showYears();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
