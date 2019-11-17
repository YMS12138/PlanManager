package pro.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import pro.Application;

/**
 * 二级主页面
 */
public class RequirementController {

    public static Label title;
    public static Label userInfo;

    @FXML
    public Label user;

    @FXML
    private Label requirementName;


    @FXML
    private void initialize() {
        title = requirementName;
        userInfo = user;

        user.setText(Application.user.getUserName()+"("+ Application.user.getUserJob() + ")");
    }
}
