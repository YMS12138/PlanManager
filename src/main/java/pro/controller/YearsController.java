package pro.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import pro.Application;

import java.awt.*;
import java.io.IOException;

/**
 * 加载年度计划页面
 */
public class YearsController {
    @FXML
    private VBox vBox;
    @FXML
    private TextField id;

    /**
     * 增，创建一个年度计划表
     */
    @FXML
    public void save() {
        //获取计划表信息
        //...id,type,...

        //调底层逻辑
        //...GoodsLogic logic =  Factory.getBean("");
        //goodsLogic.create(...);
    }

    @FXML
    public void test() {
    }

    @FXML
    private void addPane() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Application.class.getClassLoader().getResource("pro/view/info.fxml"));
        GridPane info = loader.load();

        vBox.getChildren().addAll(info);
    }

}
