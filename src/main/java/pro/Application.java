package pro;

import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pro.controller.ApplicationController;
import pro.controller.UserEditController;
import pro.entity.User;

import java.io.IOException;
import java.util.concurrent.*;

/**
 * 程序主窗口
 */
public class Application extends javafx.application.Application {
    public static ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
    //程序主窗口
    private Stage page;
    private BorderPane root;
    //当前登录用户
    public static User user;
    //本程序
    public static Application application;
    //需求新建页面的控制器
    public static Object controller;

    /**
     * 线程池
     */
    public static ExecutorService executorService = new ThreadPoolExecutor(10, 20,
            0, TimeUnit.SECONDS,
            new ArrayBlockingQueue<>(512),
            new ThreadPoolExecutor.DiscardPolicy());


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
        application = this;

        page.setResizable(false);
        //设置退出事件
        page.setOnCloseRequest(event -> {
            ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
            try {
                //退出系统（主线程）
                System.exit(0);
                //中断所有线程
                threadGroup.interrupt();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        page.setTitle("智能制造协同共享平台");
        page.setScene(new Scene(root));

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

        controller = loader.getController();
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

        controller = loader.getController();
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

        controller = loader.getController();
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

    /**
     * 加载需求计划查询页面
     */
    public void showFindPage() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Application.class.getClassLoader().getResource("pro/view/findAndFix.fxml"));
        AnchorPane info = loader.load();

        GridPane center = (GridPane) root.getCenter();
        center.add(info, 1, 2);
    }

    /**
     * 加载需求计划查询结果页面
     */
    public void showQueryResult() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Application.class.getClassLoader().getResource("pro/view/queryResult.fxml"));
        AnchorPane info = loader.load();

        GridPane center = (GridPane) root.getCenter();
        center.add(info, 1, 2);
    }

    /**
     * 加载需求计划审批页面
     */
    public void showApproval() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Application.class.getClassLoader().getResource("pro/view/approval.fxml"));
        AnchorPane info = loader.load();

        GridPane center = (GridPane) root.getCenter();
        center.add(info, 1, 2);

        FXMLLoader loader1 = new FXMLLoader();
        loader1.setLocation(Application.class.getClassLoader().getResource("pro/view/approvalLeft.fxml"));
        AnchorPane left = loader1.load();

        center.add(left, 0, 2);
    }

    /**
     * 加载打印预览及导出页面
     */
    public void showExport() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Application.class.getClassLoader().getResource("pro/view/printAndExport.fxml"));
        GridPane need = loader.load();

        root.setCenter(need);
    }

    /**
     * 汇总页面
     *
     * @throws IOException
     */
    public void showSummary() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Application.class.getClassLoader().getResource("pro/view/summary.fxml"));
        AnchorPane info = loader.load();

        GridPane center = (GridPane) root.getCenter();
        center.add(info, 1, 2);

        FXMLLoader loader1 = new FXMLLoader();
        loader1.setLocation(Application.class.getClassLoader().getResource("pro/view/summaryLeft.fxml"));
        AnchorPane left = loader1.load();

        center.add(left, 0, 2);
    }

    /**
     * 打开用户账号编辑面板
     */
    public void showUserEdit(User... users) throws IOException {
        Stage editor = new Stage();

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Application.class.getClassLoader().getResource("pro/view/UserEditDialog.fxml"));
        AnchorPane load = loader.load();

        UserEditController controller = loader.getController();
        if (users.length != 0) {
            controller.setUser(users[0]);
        }
        controller.init(editor);

        Scene scene = new Scene(load);
        editor.setScene(scene);
        editor.initOwner(page);
        editor.initModality(Modality.WINDOW_MODAL);
        editor.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
