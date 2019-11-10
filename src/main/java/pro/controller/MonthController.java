package pro.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;

import javafx.scene.control.TextField;




import pro.Application;
import pro.entity.Demand;
import pro.entity.Orders;
import pro.logic.GoodsLogic;

import java.text.ParseException;
import java.text.SimpleDateFormat;



/**
 * 加载月度计划页面
 */
public class MonthController {
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

    //物料分类编码
    @FXML
    private ComboBox materialTypeCode;
    //物料分类名称
    @FXML
    private TextField materialTypeName;
    //物料编码
    @FXML
    private ComboBox materialCode;
    //物料名称
    @FXML
    private TextField materialName;
    //物料规格
    @FXML
    private TextField materialSpe;
    //物料型号
    @FXML
    private TextField materialType;
    //物料单位
    @FXML
    private ComboBox materialUnit;
    //物料数量
    @FXML
    private TextField materialNum;
    //物料需求月份
    @FXML
    private ComboBox materialDemandMoth;
    //物料需求日期
    @FXML
    private DatePicker materialDemandDate;
    //货源是否确定
    @FXML
    private ComboBox sourceSure;
    //期待供应商
    @FXML
    private ComboBox expectedSup;
    //固定供应商
    @FXML
    private ComboBox fixedSup;
    //备注
    @FXML
    private TextField remarks;
    //物料追踪码
    @FXML
    private TextField materialTrackCode;


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
    public void test() throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat( "yyyy-MM-dd");
        Demand demand = Application.ac.getBean("demand",Demand.class);
        GoodsLogic goodsLogic =Application.ac.getBean("goodsLogic",GoodsLogic.class);
        Orders order = Application.ac.getBean("orders",Orders.class);
        //获取计划
//        demand.setDemandPlanCode(1111111);
//        //年度的计划类型为0 月度1 紧急2
//        demand.setDemandPlanType(1);
//        demand.setDemandPlanName(demandPlanName.getText());
//        demand.setDemandRemarks(demandRemarks.getText());
//        demand.setDemandDepartment(demandDepartment.getText());
//        demand.setDemandPerson(demandPerson.getText());
//        //默认未审批为0 审批中1 审批完2
//        demand.setDemandState(0);
//








       // String approva = approval.getText();
//     获取订单信息
        order.setMaterialTypeCode(Integer.parseInt((String) materialTypeCode.getValue()));
        order.setMaterialTypeName(materialTypeName.getText());
        order.setMaterialCode(Long.parseLong((String) materialCode.getValue()));
        order.setMaterialName(materialName.getText());
        order.setMaterialSpe(materialSpe.getText());
        order.setMaterialType(materialType.getText());
        order.setMaterialUnit((String) materialUnit.getValue());
        order.setMaterialNum(Integer.parseInt(materialNum.getText()));
        order.setMaterialDemandMoth(Integer.parseInt((String) materialDemandMoth.getValue()));
        order.setMaterialDemandDate(formatter.parse(String.valueOf(materialDemandDate.getValue())));
        order.setExpectedSup((String) expectedSup.getValue());
        order.setFixedSup((String) fixedSup.getValue());
        order.setRemarks(remarks.getText());
        order.setMaterialTrackCode(Long.parseLong(materialTrackCode.getText()));
        order.setDemandPlanCode(demand.getDemandPlanCode());
        System.out.println(order);
      goodsLogic.createMonth(demand,order);
        //System.out.println(demand);
    }
    @FXML
    private void initialize(){
        ObservableList<String> monthes = FXCollections.observableArrayList("1", "2", "3","4","5","6","7","8","9","10","11","12");
        //设置月份下拉框列表的值

        ObservableList<String> codes = FXCollections.observableArrayList("1","2");
        demandMonth.setItems(monthes);
        materialCode.setItems(monthes);
        materialUnit.setItems(monthes);
        expectedSup.setItems(monthes);
        fixedSup.setItems(monthes);
        materialDemandMoth.setItems(monthes);
        sourceSure.setItems(codes);
        materialTypeCode.setItems(monthes);
    }

}
