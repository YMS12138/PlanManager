package pro.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import pro.Application;

import java.io.IOException;

/**
 * 紧急计划页面控制器
 */
public class UrgentController {
    public VBox vBox;

    /**
     * 增加表格
     *
     * @throws IOException
     */
    @FXML
    public void addPane() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Application.class.getClassLoader().getResource("pro/view/info.fxml"));
        GridPane info = loader.load();

        vBox.getChildren().addAll(info);
    }

    /**
     * 插入紧急计划表
     */
    @FXML
    public void insertUrgent() {

    }

    @FXML
    public void deleteUrgent() {

    }

}
