package pro.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;


/**
 * 登录页面
 */
public class LoginController {

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
        username.setText(password.getText());
    }

    /**
     * 登陆方法 登陆成功根据不同身份切换不同页面（需要判断身份）
     */
    @FXML
    public void login(){

    }

    /**
     * 退出方法
     */
    @FXML
    public void exit(){
    }

    /**
     * 切换用户 点击切换用户按钮将也换切换到登录页面
     */
    @FXML
    public void switchUser(){

    }

}
