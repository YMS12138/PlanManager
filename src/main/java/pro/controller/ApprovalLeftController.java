package pro.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

/**
 * 审批界面左侧的分类表格
 */
public class ApprovalLeftController {
    @FXML
    private Button approval;
    @FXML
    private Button notApproval;

    @FXML
    private void test1(){
        approval.setStyle("-fx-background-color: lightgray");
        notApproval.setStyle("-fx-background-color: none");
    }

    @FXML
    private void test2(){
        approval.setStyle("-fx-background-color: none");
        notApproval.setStyle("-fx-background-color: lightgray");
    }
}
