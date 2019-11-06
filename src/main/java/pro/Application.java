package pro;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import pro.controller.ApplicationController;
import pro.entity.User;

import java.io.IOException;

/**
 * 程序主窗口
 */
public class Application extends javafx.application.Application {

    private Stage page;
    private BorderPane root;
    private User user;

    /**
     * 窗口框架
     *
     * @param primaryStage
     * @throws Exception
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Application.class.getClassLoader().getResource("pro/view/application.fxml"));
        root = loader.load();

        page = primaryStage;

        page.setResizable(false);

        page.setTitle("智能制造协同共享平台");
        page.setScene(new Scene(root));

        requirement();

        showLogin();

        ApplicationController controller = loader.getController();
        controller.setApplication(this);

        page.show();
    }

    /**
     * 主体框架（需求计划与采购计划一致）
     *
     * @throws IOException
     */
    public void requirement() throws IOException {
        //创建加载器
        FXMLLoader loader = new FXMLLoader();
        //设置加载器所加载的文件
        loader.setLocation(Application.class.getClassLoader().getResource("pro/view/requirement.fxml"));
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
    public void showYears() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Application.class.getClassLoader().getResource("pro/view/years.fxml"));
        AnchorPane info = loader.load();

        GridPane center = (GridPane) root.getCenter();
        center.add(info, 1, 2);
    }

    /**
     * 加载月度计划子页面
     *
     * @throws IOException
     */
    public void showMonth() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Application.class.getClassLoader().getResource("pro/view/month.fxml"));
        AnchorPane info = loader.load();

        GridPane center = (GridPane) root.getCenter();
        center.add(info, 1, 2);
    }

    /**
     * 加载紧急计划子页面
     *
     * @throws IOException
     */
    public void showUrgent() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Application.class.getClassLoader().getResource("pro/view/urgent.fxml"));
        AnchorPane info = loader.load();

        GridPane center = (GridPane) root.getCenter();
        center.add(info, 1, 2);
    }

    /**
     * 加载登录页面
     */
    public void showLogin() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Application.class.getClassLoader().getResource("pro/view/login.fxml"));
        Pane login = loader.load();

        root.setCenter(login);
    }

    /**
     * 加载用户列表页面
     */
    public void showUserList() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Application.class.getClassLoader().getResource("pro/view/userList.fxml"));
        Pane login = loader.load();

        root.setCenter(login);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
