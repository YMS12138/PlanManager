package pro.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import pro.Application;
import pro.entity.Demand;
import pro.logic.ApprovalLogic;
import pro.mapper.Approval;

import java.io.IOException;
import java.util.List;

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


    /**
     * 在控制器（此类）被构/造时，自动调用initialize()
     */
    @FXML
    private void initialize() {
        ApprovalLogic app = new ApprovalLogic();
        List<Demand> demand = app.findAll();
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

    /**
     * 加载打印预览及导出页面
     */
    @FXML
    private void showExport() {
        try {
            Application.application.showExport();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void showSummary() {
        try {
            Application.application.requirement();
            Application.application.showSummary();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
