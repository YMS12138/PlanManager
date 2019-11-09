package pro.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pro.Application;
import pro.entity.Demand;
import pro.entity.Order;
import pro.logic.GoodsLogic;


/**
 * 加载月度计划页面
 */
public class MonthController {

    /**
     * 需求计划编码
     */
    @FXML
    private TextField demandPlanCode;
    /**
     * 需求计划类型
     */
    @FXML
    private TextField demandPlanType;
    /**
     * 需求计划名称
     */
    @FXML
    private TextField demandPlanName;
    /**
     * 备注
     */
    @FXML
    private TextField demandRemarks;
    /**
     * 需求部门
     */
    @FXML
    private TextField demandDepartment;
    /**
     * 需求人员
     */
    @FXML
    private TextField demandPerson;
    /**
     * 需求状态
     */
    @FXML
    private TextField demandState;
    /**
     * 审批状态
     */
    @FXML
    private TextField approval;


    @FXML
    public void createMonth(){

    }
    @FXML
    public void updateMonth(){

    }
    @FXML
    public void delete(){
    }
    @FXML
    public void test(){
        Demand demand = Application.ac.getBean("demand",Demand.class);
        GoodsLogic goodsLogic =Application.ac.getBean("goodsLogic",GoodsLogic.class);
        Order order = Application.ac.getBean("order",Order.class);
        demand.setDemandPlanCode(Long.parseLong(demandPlanCode.getText()));
        //年度的计划类型为0 月度1 紧急2
        demand.setDemandPlanType(1);
        demand.setDemandPlanName(demandPlanName.getText());
        demand.setDemandRemarks(demandRemarks.getText());
        demand.setDemandDepartment(demandDepartment.getText());
        demand.setDemandPerson(demandPerson.getText());
        //默认未审批为0 审批中1 审批完2
        demand.setDemandState(0);
        String approva = approval.getText();
        /**
         * 传入订单 和 计划信息 调用Logic里面的东西
         */
        goodsLogic.createMonth(demand,order);
        System.out.println(demand);


}
}
