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
        password.setText(username.getText());
    }
}
