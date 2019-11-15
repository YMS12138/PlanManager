package pro.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import pro.Application;



import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * 需求查改子页面
 */
public class FindAndFixController {


    @FXML
    private ComboBox<String> comboBox;

    /*
    *获取的查询条件
    * */
    @FXML
    private TextField t6; //

    @FXML
    private Label t1;  //需求计划编号
    @FXML
    private Label t2;  //需求计划类型
    @FXML
    private Label t3;  //计划年度
    @FXML
    private Label t4;  //需求部门
    @FXML
    private Label t5;  //计划月份


    /**
     *  下拉框使用的测试案例，其他下拉框参照此种方法进行编写
     */
    @FXML
    private void buttonTest(){
        //以下为ComboBox的具体操作方法
        //创建下拉框的列表
        ObservableList<String> strings = FXCollections.observableArrayList("option 1", "option 2", "option 3");
        //设置下拉框列表的值
        comboBox.setItems(strings);
        //使用索引值为0的对象作为初始选项，0 <= index < strings.size()
        comboBox.getSelectionModel().select(0);
        //添加一个元素
        comboBox.getItems().addAll("hahaha");

        //设置当前选项的值
//        comboBox.setValue("123");
    }



    /**
     * 加载需求计划查询结果子页面
     */
    @FXML
    private void showQueryResult() {
        try {
            Application.application.requirement();
            RequirementController.title.setText("需求计划-需求查询结果");
            Application.application.showQueryResult();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取查询/修改的页面信息
     */
    public void findByCondition(){
        //获取查询的值
        String demandPlanCode = t1.getAccessibleText();
        String demandPlanType = t2.getAccessibleText();
        String year = t3.getAccessibleText();
        String demandDepartment = t4.getAccessibleText();
        String demandMonth = t5.getAccessibleText();
        Map<String ,Object> map = new HashMap() ;
        map.put("demandPlanCode",demandPlanCode);
        map.put("demandPlanType",demandPlanType);
        map.put("year",year);
        map.put("demandDepartment",demandDepartment);
        map.put("demandMonth",demandMonth);
        //l.findBy(map);

    }
}
