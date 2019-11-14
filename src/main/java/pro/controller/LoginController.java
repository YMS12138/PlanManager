package pro.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import pro.logic.UserLogic;


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
     * 测试获取页面控件属性
     */
    @FXML
    private void test() {
        String ss = username.getText();

        System.out.println(ss);
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

    }

    /**
     * 退出方法
     */
    @FXML
    public void exit() {

    }

    /**
     * 切换用户 点击切换用户按钮将也换切换到登录页面
     */
    @FXML
    public void switchUser() {

    }

}
