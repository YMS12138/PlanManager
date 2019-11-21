package pro.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import org.springframework.context.ApplicationContext;
import pro.Application;
import pro.entity.Demand;
import pro.entity.Orders;
import pro.logic.GoodsLogic;
import pro.logic.UserLogic;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 需求计划查询结果页面
 */
public class QueryResultController {
    ApplicationContext ac = Application.ac;
    /**
     * 表格内的元素，在demands更改时，tableView表格会同时更改
     */
    ObservableList<Demand> demands = FXCollections.observableArrayList();

    @FXML
    private TableView<Demand> tableView;

    @FXML
    private TableColumn<Demand, String> id;
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
        GoodsLogic goodsLogic = new GoodsLogic();
        List<Demand> demand = goodsLogic.findalldemand();
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

        //设置行号（动态值）
        id.setCellFactory(param -> {
            TableCell<Demand, String> cell = new TableCell<Demand, String>() {
                @Override
                public void updateItem(String item, boolean empty) {
                    super.updateItem(item, empty);
                    this.setText(null);
                    this.setGraphic(null);

                    if (!empty) {
                        int rowIndex = this.getIndex() + 1;
                        this.setText(String.valueOf(rowIndex));
                    }
                }
            };
            return cell;
        });
        //此列不可以被拖动
        id.impl_setReorderable(false);

        tableView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    }
    //需求计划查询结果里面的关闭/退出按钮
    @FXML
    public void exit(){
        try {
            Application.application.requirement();
            RequirementController.title.setText("需求计划-需求查询");
            Application.application.showFindPage();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    public void delete(){
        List<Long> Codes = new ArrayList<>();
        ObservableList<Demand> selectedItems = tableView.getSelectionModel().getSelectedItems();
        for(Demand demand : selectedItems){
            System.out.println(demand.getDemandPlanCode());
            Codes.add(demand.getDemandPlanCode());
        }
        GoodsLogic goodsLogic = ac.getBean("goodsLogic",GoodsLogic.class);

        goodsLogic.deletedemands(Codes);
        demands.setAll(goodsLogic.findalldemand()) ;
        tableView.setItems(demands);
        System.out.println("删除成功");
    }

    /**
     * 查询需求计划具体信息
     */
    @FXML
    private void query(){
        if (tableView.getSelectionModel().getSelectedItems().size()>1){
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setHeaderText("查询错误");
            alert.setContentText("无法同时查询多个需求！");
            alert.showAndWait();
            return;
        }
        Demand selectedItem = tableView.getSelectionModel().getSelectedItem();
        System.out.println(selectedItem.getDemandPlanName());

        if (selectedItem == null){
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setHeaderText("查询错误");
            alert.setContentText("未选中需求计划！");
            alert.showAndWait();
            return;
        }

        //根据demand查出所有的orders,test
        List<Orders> orders = new GoodsLogic().selectOrderByCode(selectedItem.getDemandPlanCode());
        System.out.println(orders.size());
        for (Orders order : orders) {
            System.out.println("1111");
            System.out.println(order);
        }

        selectedItem.setOrdersList(orders);
        //跳转
        if ("年度计划".equals(selectedItem.getDemandPlanType())){
            try {
                Application.application.requirement();
                RequirementController.title.setText("需求计划-年度计划");
                Application.application.showYears();

                YearsController.me.queryRes(selectedItem);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if ("月度计划".equals(selectedItem.getDemandPlanType())){
            try {
                Application.application.requirement();
                RequirementController.title.setText("需求计划-月度计划");
                Application.application.showMonth();

                MonthController.me.queryRes(selectedItem);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if ("紧急计划".equals(selectedItem.getDemandPlanType())){
            try {
                Application.application.requirement();
                RequirementController.title.setText("需求计划-紧急计划");
                Application.application.showUrgent();

                UrgentController.me.queryRes(selectedItem);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
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
            RequirementController.title.setText("需求计划-需求计划汇总");
            Application.application.showSummary();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
