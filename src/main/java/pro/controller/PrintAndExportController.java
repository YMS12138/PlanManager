package pro.controller;

/**
 * @Author: zz
 * @Date: 2019/11/8 10:56
 */

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import pro.entity.Orders;
import pro.logic.GoodsLogic;


import java.sql.Date;
import java.util.List;

/**
 * 加载打印和导出页面
 */
public class PrintAndExportController {

    ObservableList<Orders> orders = FXCollections.observableArrayList();

    @FXML
    private TableView<Orders> tableView;

    //物料分类编码
    @FXML
    private TableColumn materialTypeCode;

    //物料分类名称
    @FXML
    private TableColumn<Orders, String> materialTypeName;

    //物料编码
    @FXML
    private TableColumn<Orders, Long> materialCode;

    //物料名称
    @FXML
    private TableColumn<Orders, String> materialName;

    //物料规格
    @FXML
    private TableColumn<Orders, String> materialSpe;

    //物料型号
    @FXML
    private TableColumn<Orders, String> materialType;

    //物料单位
    @FXML
    private TableColumn<Orders, String> materialUnit;

    //物料数量
    @FXML
    private TableColumn<Orders, Integer> materialNum;

    //物料需求月份
    @FXML
    private TableColumn<Orders, Integer> materialDemandMoth;

    //物料需求日期
    @FXML
    private TableColumn<Orders, Date> materialDemandDate;

    //备注
    @FXML
    private TableColumn<Orders, String> remarks;

    @FXML
    public void initialize() {
        GoodsLogic goodsLogic = new GoodsLogic();
        List<Orders> order = goodsLogic.findAll();
        orders.addAll(order);

        tableView.setItems(orders);
        materialTypeCode.setCellValueFactory(new PropertyValueFactory("materialTypeCode"));
        materialTypeName.setCellValueFactory(new PropertyValueFactory<>("materialTypeName"));
        materialCode.setCellValueFactory(new PropertyValueFactory<>("materialCode"));
        materialName.setCellValueFactory(new PropertyValueFactory<>("materialName"));
        materialSpe.setCellValueFactory(new PropertyValueFactory<>("materialSpe"));
        materialType.setCellValueFactory(new PropertyValueFactory<>("materialType"));
        materialUnit.setCellValueFactory(new PropertyValueFactory<>("materialUnit"));
        materialNum.setCellValueFactory(new PropertyValueFactory<>("materialNum"));
        materialDemandMoth.setCellValueFactory(new PropertyValueFactory<>("materialDemandMoth"));
        materialDemandDate.setCellValueFactory(new PropertyValueFactory<>("materialDemandDate"));
        remarks.setCellValueFactory(new PropertyValueFactory<>("remarks"));
    }

    /**
     * 返回上一个页面
     */
    @FXML
    private void goBack() {

    }
}
