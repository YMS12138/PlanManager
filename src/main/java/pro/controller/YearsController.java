package pro.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import org.springframework.context.ApplicationContext;
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
 * 加载年度计划页面
 */
public class YearsController {
    ApplicationContext ac = Application.ac;

    /**
     * 所有基本信息
     */
    List<InfoController> orders = new ArrayList<>();
    List<Orders> ordersList = new ArrayList<>();
    @FXML
    private VBox vBox;
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

    private Integer index;

    public YearsController() {

    }

    @FXML
    private void initialize() {

        /**
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

        demandPlanCode.setText(String.valueOf(Math.abs(new Random().nextLong()%100000000)));
        demandPlanType.setText("年度计划");
        demandState.setText("未提交");
        approval.setText("未审核");
    }

    /**
     * 增，创建一个年度计划表
     */
    @FXML
    //获取计划表信息
    //...id,type,...
    public void save() throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Demand demand = Application.ac.getBean("demand", Demand.class);
        GoodsLogic goodsLogic = Application.ac.getBean("goodsLogic", GoodsLogic.class);
        Orders order = Application.ac.getBean("orders", Orders.class);
        //获取计划
        demand.setDemandPlanCode((long) (Math.random() * 100086));
        //年度的计划类型为0 月度1 紧急2
        demand.setDemandPlanType("年度计划");
        demand.setDemandPlanName(demandPlanName.getText());
        demand.setDemandRemarks(demandRemarks.getText());
        demand.setDemandDepartment(demandDepartment.getText());
        demand.setDemandPerson(demandPerson.getText());
        //默认未审批为0 审批中1 审批完2
        demand.setDemandState(demandState.getText());
        demand.setApproval(approval.getText());
        //获取订单信息
        for(int i =0;i<orders.size();i++){
            ordersList.add(orders.get(i).getOrder(demand.getDemandPlanCode()));
            System.out.println(ordersList.get(i));
        }
        goodsLogic.createDemand(demand,ordersList);

        //调底层逻辑
        //...GoodsLogic logic =  Factory.getBean("");
        //goodsLogic.create(...);
    }

    /**
     * 复制，复制年度计划表
     */
    @FXML
    public void copy() {

        /*
         * 如果未点击保存
         * 提示不能复制
         * 且不能执行以下代码
         * */
    }

    /**
     * 提交，提交年度计划表
     */
    public void commit() {

        GoodsLogic goodsLogic = ac.getBean("goodsLogic", GoodsLogic.class);
        goodsLogic.updateState(Long.parseLong(demandPlanCode.getText()));
    }

    /**
     * 打印及导出，打印及导出年度计划表
     */
    public void printAndExport() {
        /*
         * 跳转打印界面及导出
         * */
    }

    /**
     * 删除，删除年度计划表
     */
    public void delete() {

        GoodsLogic goodsLogic = ac.getBean("goodsLogic", GoodsLogic.class);
        goodsLogic.deleteDemand(Long.parseLong(demandPlanCode.getText()));
    }

    /**
     * 退出，退出年度计划表
     */
    public void exit() {
        /*
         * 点击退出实现退出整个界面
         * */
    }

    /**
     * 为需求计划添加订单（基本信息）
     *
     * @throws IOException
     */
    @FXML
    private void addPane() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Application.class.getClassLoader().getResource("pro/view/info.fxml"));
        GridPane info = loader.load();

        InfoController controller = loader.getController();
        orders.add(controller);

        vBox.getChildren().addAll(info);
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
