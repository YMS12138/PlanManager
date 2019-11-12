package pro.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pro.Application;
import pro.entity.Demand;
import pro.entity.Orders;
import pro.logic.GoodsLogic;


import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * 加载年度计划页面
 */
public class YearsController {
    @FXML
    private VBox vBox;
    ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
    //demand表
    @FXML
    private TextField DemandDepartment;
    @FXML
    private TextField DemandRemarks;
    @FXML
    private TextField DemandPlanName;
    @FXML
    private TextField DemandPerson;
    @FXML
    private TextField DemandPlanCode;
    @FXML
    private TextField DemandPlanType;
    @FXML
    private TextField DemandState;
    @FXML
    private TextField Approval;
    @FXML
    private TextField DemandMonth;
    @FXML
    private TextField OrderCode;
    //order表
    @FXML
    private TextField MaterialTypeCode;
    @FXML
    private TextField MaterialTypeName;
    @FXML
    private TextField MaterialCode;
    @FXML
    private TextField MaterialName;
    @FXML
    private TextField MaterialSpe;
    @FXML
    private TextField MaterialType;
    @FXML
    private TextField MaterialUnit;
    @FXML
    private TextField MaterialNum;
    @FXML
    private TextField MaterialDemandMoth;
    @FXML
    private TextField MaterialDemandDate;
    @FXML
    private TextField SourceSure;
    @FXML
    private TextField ExpectedSup;
    @FXML
    private TextField FixedSup;
    @FXML
    private TextField Remarks;
    @FXML
    private TextField MaterialTrackCode;

    /**
     * 流程信息表
     */
    @FXML
    private VBox processVBox;

    private Integer index;

    public YearsController() {

    }

    @FXML
    private void initialize(){
        index = new Integer(1);

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
    }

    /**
     * 增，创建一个年度计划表
     */
    @FXML
    //获取计划表信息
    //...id,type,...
    public void save() throws ParseException {
        Demand demand = ac.getBean("demand", Demand.class);
        demand.setDemandDepartment(DemandDepartment.getText());
        demand.setDemandRemarks(DemandRemarks.getText());
        demand.setDemandPlanName(DemandPlanName.getText());
        demand.setDemandPerson(DemandPerson.getText());
        //需求计划编码
        demand.setDemandPlanCode(1001);
        //默认
        demand.setDemandState(0);
        //默认未审批为0 审批中1 审批完2
        demand.setApproval(0);
        demand.setDemandMonth(Integer.parseInt(DemandMonth.getText()));
        //年度的计划类型为年度0 月度1 紧急2
        demand.setDemandPlanType(0);
        demand.setOrderCode(Long.parseLong(OrderCode.getText()));

        Orders order = ac.getBean("order", Orders.class);
        order.setMaterialTypeCode(Integer.parseInt(MaterialTypeCode.getText()));
        order.setDemandPlanCode(Long.parseLong(DemandPlanCode.getText()));
        order.setExpectedSup(ExpectedSup.getText());
        order.setMaterialTypeName(MaterialTypeName.getText());
        order.setMaterialCode(Long.parseLong(MaterialCode.getText()));
        order.setMaterialName(MaterialName.getText());
        order.setMaterialSpe(MaterialSpe.getText());
        order.setMaterialType(MaterialType.getText());
        order.setMaterialUnit(MaterialUnit.getText());
        order.setMaterialNum(Integer.parseInt(MaterialNum.getText()));
        order.setMaterialDemandMoth(Integer.parseInt(MaterialDemandMoth.getText()));
        order.setMaterialDemandDate(new SimpleDateFormat("yyyy-MM-dd").parse(MaterialDemandDate.getText()));
        order.setSourceSure(Boolean.parseBoolean(SourceSure.getText()));
        order.setFixedSup(FixedSup.getText());
        order.setRemarks(Remarks.getText());
        order.setMaterialTrackCode(Long.parseLong(MaterialTrackCode.getText()));

        GoodsLogic goodsLogic = ac.getBean("goodsLogic", GoodsLogic.class);
        goodsLogic.createYear(demand, order);

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
        goodsLogic.updateYear(Long.parseLong(DemandPlanCode.getText()));
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
        goodsLogic.deleteYear(Long.parseLong(DemandPlanCode.getText()));
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
