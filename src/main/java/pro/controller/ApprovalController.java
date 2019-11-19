package pro.controller;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import pro.Application;
import pro.entity.Demand;
import pro.logic.GoodsLogic;

import java.util.ArrayList;
import java.util.List;

/**
 * 需求审批页面
 */
public class ApprovalController {

    public static ObservableList<Demand> demands = FXCollections.observableArrayList();

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
    @FXML
    private Label approvalNum;

    /**
     * 初始化
     */
    @FXML
    public void initialize() {
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
        id.setCellFactory((col) -> {
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

        //添加选择监听
        Application.executorService.execute(() -> {
            while (true) {
                if (tableView.getScene() == null){
                    return;
                }

                //已选择数
                int size = tableView.getSelectionModel().getSelectedItems().size();
                if (size != Integer.valueOf(approvalNum.getText())) {
                    Platform.runLater(() -> {
                        approvalNum.setText(String.valueOf(size));
                    });
                }

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
    }



    public static void setDemands(List<Demand> demands) {
        ApprovalController.demands.setAll(demands);
    }

    @FXML
    public void approvalPass() {
        Application.executorService.execute(() -> {
            List<Long> Codes = new ArrayList<>();
            ObservableList<Demand> selectedItems = tableView.getSelectionModel().getSelectedItems();
            for (Demand demand : selectedItems) {
                if (demand.getApproval().equals("已审核")) {
                    System.out.println("已审核无法再次审核");
                    break;
                } else {
                    System.out.println(demand.getApproval());
                    Codes.add(demand.getDemandPlanCode());
                }
            }
            GoodsLogic goodsLogic = Application.ac.getBean("goodsLogic", GoodsLogic.class);
            goodsLogic.approvalPass(Codes);
            demands.setAll(goodsLogic.findalldemand());
            tableView.setItems(demands);
        });
    }

    @FXML
    public void approvalUnPass(){
        Application.executorService.execute(() -> {
            List<Long> Codes = new ArrayList<>();
            ObservableList<Demand> selectedItems = tableView.getSelectionModel().getSelectedItems();
            for (Demand demand : selectedItems) {
                if (demand.getApproval().equals("未审核")) {
                    System.out.println("未审核");
                    break;
                } else {
                    System.out.println(demand.getApproval());
                    Codes.add(demand.getDemandPlanCode());
                }
            }
            GoodsLogic goodsLogic = Application.ac.getBean("goodsLogic", GoodsLogic.class);
            goodsLogic.approvalUnPass(Codes);
            demands.setAll(goodsLogic.findalldemand());
            tableView.setItems(demands);
        });
    }

}
