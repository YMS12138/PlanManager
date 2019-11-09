package pro.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import pro.entity.Demand;

/**
 * 需求计划查询结果页面
 */
public class QueryResultController {

    /**
     * 表格内的元素，在demands更改时，tableView表格会同时更改
     */
    ObservableList<Demand> demands = FXCollections.observableArrayList();

    @FXML
    private TableView<Demand> tableView;

    @FXML
    private TableColumn<ObservableList, Integer> id;
    @FXML
    private TableColumn<Demand, Long> planCode;
    @FXML
    private TableColumn<Demand, Integer> planType;
    @FXML
    private TableColumn<Demand, Integer> approval;
    @FXML
    private TableColumn<Demand, Integer> demandState;
    @FXML
    private TableColumn<Demand, String> department;
    @FXML
    private TableColumn<Demand, Integer> month;


    @FXML
    private void initialize() {
        //设置表格中的内容（填充）
        tableView.setItems(demands);

        //为每一列绑定属性，即 将这一列绑定上对象（Demand）的一个属性,对应字段名
        planCode.setCellValueFactory(new PropertyValueFactory<>("demandPlanCode"));
        planType.setCellValueFactory(new PropertyValueFactory<>("demandPlanType"));
        approval.setCellValueFactory(new PropertyValueFactory<>("approval"));
        demandState.setCellValueFactory(new PropertyValueFactory<>("demandState"));
        department.setCellValueFactory(new PropertyValueFactory<>("demandDepartment"));
        month.setCellValueFactory(new PropertyValueFactory<>("demandMonth"));
    }

    /**
     * 测试，每点击一次可以增加一个需求
     */
    @FXML
    private void test() {
        //更新demands的值
        Demand test = new Demand();
        test.setDemandPlanCode((int) Math.floor(Math.random() * 10086) + 1);
        test.setApproval(0);
        test.setDemandDepartment("公安部");
        test.setDemandPerson("yms");
        test.setDemandState(1);
        test.setDemandMonth((int) Math.floor(Math.random() * 12) + 1);

        demands.addAll(test);
    }

    /**
     * 根据提供Code查询
     */
    @FXML
    public void selectByCode(){

    }
    @FXML
    public void updateBy(){

    }
}
