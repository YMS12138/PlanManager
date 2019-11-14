package pro.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import pro.Application;
import pro.entity.Demand;
import pro.logic.ApprovalLogic;
import pro.mapper.Approval;

import java.util.List;

/**
 * 需求审批页面
 */
public class ApprovalController {

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

    /**
     * 初始化
     */
    @FXML
    public void initialize() {
        List<Demand> demand = null;
        Approval app = Application.ac.getBean("approval", Approval.class);
        demand = app.findAll();
        demands.addAll(demand);
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
}
