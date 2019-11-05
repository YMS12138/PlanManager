package pro;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import pro.controller.RequirementController;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Main extends Application {

    private Stage page;
    private BorderPane root;

    /**
     * 窗口框架
     *
     * @param primaryStage
     * @throws Exception
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getClassLoader().getResource("pro/view/main.fxml"));
        root = loader.load();

        page = primaryStage;

        page.setResizable(false);

        page.setTitle("智能制造协同共享平台");
        page.setScene(new Scene(root));

        requirement();

        showYears();

        page.show();
    }

    /**
     * 主体框架（需求计划与采购计划一致）
     *
     * @throws IOException
     */
    private void requirement() throws IOException {
        //创建加载器
        FXMLLoader loader = new FXMLLoader();
        //设置加载器所加载的文件
        loader.setLocation(Main.class.getClassLoader().getResource("pro/view/requirement.fxml"));
        //将加载的子页面文件返回
        GridPane requirement = loader.load();

        //设置子页面为父节点（BorderPane）的中心
        root.setCenter(requirement);

        //若需要得到页面的控制器
        //请使用以下代码
//        RequirementController controller = loader.getController();
    }

    /**
     * 加载年度计划子页面
     *
     * @throws IOException
     */
    private void showYears() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getClassLoader().getResource("pro/view/years.fxml"));
        AnchorPane info = loader.load();

        GridPane center = (GridPane) root.getCenter();
        center.add(info, 1, 2);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
