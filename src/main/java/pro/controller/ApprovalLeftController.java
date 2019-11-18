package pro.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import pro.Application;
import pro.logic.ApprovalLogic;
import pro.mapper.Approval;

/**
 * 审批界面左侧的分类表格
 */
public class ApprovalLeftController {
    @FXML
    private Button approval;
    @FXML
    private Button notApproval;

    //已审核
    @FXML
    private void test1() {
        approval.setStyle("-fx-background-color: lightgray");
        notApproval.setStyle("-fx-background-color: none");
        ApprovalLogic approvalLogic = Application.ac.getBean("approvalLogic", ApprovalLogic.class);
        approvalLogic.findByStatus1();
        System.out.println(approvalLogic.findByStatus1());
    }

    //未审核
    @FXML
    private void test2() {
        approval.setStyle("-fx-background-color: none");
        notApproval.setStyle("-fx-background-color: lightgray");
        ApprovalLogic approvalLogic = Application.ac.getBean("approvalLogic", ApprovalLogic.class);
        approvalLogic.findByStatus2();
        System.out.println(approvalLogic.findByStatus2());
    }
}
