package pro.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import pro.Application;
import pro.logic.GoodsLogic;

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
        GoodsLogic goodsLogic = Application.ac.getBean("goodsLogic", GoodsLogic.class);
        ApprovalController.setDemands(goodsLogic.findByStatus1());

    }

    //未审核
    @FXML
    private void test2() {
        approval.setStyle("-fx-background-color: none");
        notApproval.setStyle("-fx-background-color: lightgray");
        GoodsLogic goodsLogic = Application.ac.getBean("goodsLogic", GoodsLogic.class);
        ApprovalController.setDemands(goodsLogic.findByStatus2());
    }
}
