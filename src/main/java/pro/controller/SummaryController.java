package pro.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import pro.Application;
import pro.entity.Orders;

import java.io.IOException;
import java.util.List;

/**
 * 汇总页面
 */
public class SummaryController {

    @FXML
    public VBox infoPane;

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
        infoPane.getChildren().addAll(loadGridPane(new Orders()));
        infoPane.getChildren().addAll(loadGridPane(new Orders()));
        infoPane.getChildren().addAll(loadGridPane(new Orders()));
    }

    /**
     * 表格，每条order（orders?）对应一个表格
     */
    public AnchorPane loadGridPane(Orders orders) {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Application.class.getClassLoader().getResource("pro/view/infoAll.fxml"));
        AnchorPane anchorPane = null;
        InfoAllController controller = null;
        try {
            anchorPane = loader.load();
            controller = loader.getController();
        } catch (IOException e) {
            e.printStackTrace();
        }
        controller.init(orders);

        return anchorPane;
    }
}
