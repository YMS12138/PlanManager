package pro;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * 基于 C/S 架构的智能制造协同共享管理平台
 * 采用JavaFX技术
 *
 * @author YMS
 */
public class Main extends Application {

    private Stage page;
    private BorderPane root;

    @Override
    public void start(Stage primaryStage) throws Exception {
        root = FXMLLoader.load(getClass().getResource("view/main.fxml"));

        page = primaryStage;

        page.setResizable(false);

        page.setTitle("智能制造协同共享平台");
        page.setScene(new Scene(root));

        requirement();

        showYears();

        page.show();
    }

    /**
     * 需求计划创建页面
     *
     * @throws IOException
     * @date 2019/11/4
     */
    private void requirement() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("view/requirement.fxml"));
        GridPane requirement = loader.load();

        root.setCenter(requirement);
    }

    /**
     * 年度计划页面(与紧急页面相同)
     *
     * @throws IOException
     * @date 2019/11/4
     */
    private void showYears() throws IOException {
        //新建一个加载器
        FXMLLoader loader = new FXMLLoader();
        //设置加载文件
        loader.setLocation(Main.class.getResource("view/years.fxml"));
        //加载文件至 info
        AnchorPane info = loader.load();

        //将 info 内嵌进父节点
        GridPane center = (GridPane) root.getCenter();
        center.add(info, 1, 2);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
