package pro.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import pro.Application;

/**
 * 二级主页面
 */
public class RequirementController {

    public static Label title;

    @FXML
    private Label requirementName;


    @FXML
    private void initialize() {
        title = requirementName;
    }
}
