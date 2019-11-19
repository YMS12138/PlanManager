package pro.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ComboBox;

import javafx.scene.control.TextField;


import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import pro.Application;
import pro.entity.Demand;
import pro.entity.Orders;
import pro.logic.GoodsLogic;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


/**
 * 加载月度计划页面
 */
public class MonthController {
    List<InfoController> orders = new ArrayList<>();
    List<Orders> ordersList = new ArrayList<>();
    @FXML
    public VBox baseInfo;

    @FXML
    private ComboBox<String> demandMonth;
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

    /**
     * 流程信息表
     */
    @FXML
    private VBox processVBox;

    @FXML
    public void createMonth() {

    }

    @FXML
    public void updateMonth() {

    }

    @FXML
    public void delete() {
    }


    @FXML
    public void test() throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Demand demand = Application.ac.getBean("demand", Demand.class);
        GoodsLogic goodsLogic = Application.ac.getBean("goodsLogic", GoodsLogic.class);
        Orders order = Application.ac.getBean("orders", Orders.class);
        //获取计划
        demand.setDemandPlanCode(Long.parseLong(demandPlanCode.getText()));
        //年度的计划类型为0 月度1 紧急2
        demand.setDemandPlanType(demandPlanType.getText());
        demand.setDemandPlanName(demandPlanName.getText());
        demand.setDemandRemarks(demandRemarks.getText());
        demand.setDemandDepartment(demandDepartment.getText());
        demand.setDemandPerson(demandPerson.getText());
        demand.setDemandMonth(Integer.parseInt(demandMonth.getValue()));
        demand.setDemandState(demandState.getText());
        demand.setApproval(approval.getText());
        for (int i = 0; i < orders.size(); i++) {
            ordersList.add(orders.get(i).getOrder(demand.getDemandPlanCode()));
            System.out.println(ordersList.get(i));
        }
        goodsLogic.createDemand(demand, ordersList);

    }

    @FXML
    private void initialize() {

        /**
         * 初始化流程信息子模块
         */
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Application.class.getClassLoader().getResource("pro/view/processInfo.fxml"));
        GridPane processInfo = null;
        try {
            processInfo = loader.load();
        } catch (IOException e) {

        }
        processVBox.getChildren().addAll(processInfo);

        ObservableList<String> monthes = FXCollections.observableArrayList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12");
        //设置月份下拉框列表的值

        ObservableList<String> codes = FXCollections.observableArrayList("1", "2");
        demandMonth.setItems(monthes);

        demandPlanCode.setText(String.valueOf(Math.abs(new Random().nextLong() % 100000000)));
        demandPlanType.setText("月度计划");
        demandState.setText("未提交");
        approval.setText("未审核");
    }

    /**
     * 增加表格
     *
     * @throws IOException
     */
    @FXML
    public void addPane() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Application.class.getClassLoader().getResource("pro/view/info.fxml"));
        GridPane info = loader.load();

        InfoController controller = loader.getController();
        controller.init(info, baseInfo);
        orders.add(controller);

        baseInfo.getChildren().addAll(info);
    }

    /**
     * 为需求分析添加审批信息（流程信息）
     */
    @FXML
    private void addApprovalInfo() throws IOException {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Application.class.getClassLoader().getResource("pro/view/processInfo.fxml"));
        GridPane processInfo = loader.load();

        processVBox.getChildren().addAll(processInfo);
    }
}
