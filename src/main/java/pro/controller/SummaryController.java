package pro.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import pro.Application;
import pro.entity.Orders;
import pro.mapper.IOrder;

import java.io.IOException;
import java.util.List;

/**
 * 加载汇总页面
 */
public class SummaryController {

    @FXML
    public VBox infoPane;

    @FXML
    private Label materialName;
    @FXML
    private Label materialTypeCode;
    @FXML
    private Label materialTypeName;
    @FXML
    private Label materialCode;
    @FXML
    private Label materialSpe;
    @FXML
    private Label materialType;
    @FXML
    private Label materialUnit;
    @FXML
    private Label materialNum;
    @FXML
    private Label materialDemandMoth;
    @FXML
    private Label materialDemandDate;
    @FXML
    private Label sourceSure;
    @FXML
    private Label expectedSup;
    @FXML
    private Label fixedSup;
    @FXML
    private Label remarks;
    @FXML
    private Label materialTrackCode;
    @FXML
    private Label demandPlanCode;

    /**
     * 初始化
     */
    @FXML
    private void initialize() {
        /**
         * UI 布局控制
         */
        Pane pane = new Pane();
        pane.setPrefWidth(960);
        pane.setPrefHeight(20);
        infoPane.getChildren().addAll(pane);

        //...

        //测试,加载3条数据
        infoPane.getChildren().addAll(loadGridPane());
        infoPane.getChildren().addAll(loadGridPane());
        infoPane.getChildren().addAll(loadGridPane());
    }

    /**
     * 渲染数据
     */
    public void showInfo(List<Orders> orders) {

    }

    /**
     * 表格，每条order（orders?）对应一个表格
     */
    public AnchorPane loadGridPane() {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Application.class.getClassLoader().getResource("pro/view/infoAll.fxml"));
        AnchorPane anchorPane = null;
        try {
            anchorPane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        /**
         * 取得数据
         */
//        IOrder iOrder = new IOrder();
//        showInfo(...);

        return anchorPane;
    }
}
