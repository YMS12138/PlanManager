package pro.controller;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import org.springframework.stereotype.Controller;
import pro.Application;

import java.io.IOException;
import java.util.concurrent.*;

/**
 * 主窗口
 */
@Controller
public class ApplicationController {
    /**
     * 程序窗口对象
     */
    private Application application;


    /**
     * 菜单栏
     */
    @FXML
    private MenuBar menuBar;

    /**
     * 管理员操作
     */
    @FXML
    private MenuItem userManager;
    @FXML
    private MenuItem approvalItem;

    @FXML
    private void initialize() {

        userManager.setDisable(true);
        approvalItem.setDisable(true);

        //权限管理线程
        Application.executorService.execute(() -> {
            while (true) {
                if (Application.user == null) {
                    //未登录
                    if (!menuBar.isDisable()) {
                        menuBar.setDisable(true);
                    }
                } else {
                    //已登录
                    if (menuBar.isDisable()) {
                        //如果是隐藏的，才设置为不隐藏
                        menuBar.setDisable(false);
                    }
                    if (RequirementController.userInfo != null) {
                        //Platform.runLater : 子线程不能直接对FX线程的信息更新，需要以这种方法解决
                        Platform.runLater(() -> {
                            RequirementController.userInfo.setText(Application.user.getUserName()
                                    + "(" + (Application.user.getUserJob() == 2 ? "管理员" : "普通用户") + ")");
                        });
                    }

                    //管理员
                    if (Application.user.getUserJob() == 2) {
                        if (userManager.isDisable()) {
                            userManager.setDisable(false);
                        }
                        if (approvalItem.isDisable()) {
                            approvalItem.setDisable(false);
                        }
                    } else if (!userManager.isDisable()) {
                        //普通用户
                        if (!userManager.isDisable()) {
                            userManager.setDisable(false);
                        }
                        if (!approvalItem.isDisable()) {
                            approvalItem.setDisable(false);
                        }
                    }

                }

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void setApplication(Application application) {
        this.application = application;
    }


    /**
     * 加载年度计划子页面
     */
    @FXML
    private void showYears() {
        try {
            application.requirement();
            RequirementController.title.setText("需求计划-年度计划");
            application.showYears();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 加载月度计划子页面
     */
    @FXML
    private void showMonth() {
        try {
            application.requirement();
            RequirementController.title.setText("需求计划-月度计划");
            application.showMonth();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 加载紧急计划子页面
     */
    @FXML
    private void showUrgent() {
        try {
            application.requirement();
            RequirementController.title.setText("需求计划-紧急计划");
            application.showUrgent();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 加载登录子页面
     */
    @FXML
    private void showLogin() {
        try {
            application.showLogin();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 加载用户列表子页面
     */
    @FXML
    private void showUserList() {
        try {
            application.showUserList();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 加载需求计划查询子页面
     */
    @FXML
    private void showFindPage() {
        try {
            application.requirement();
            RequirementController.title.setText("需求计划-需求查询");
            application.showFindPage();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 加载需求计划审批子页面
     */
    @FXML
    private void showApproval() {
        try {
            application.requirement();
            RequirementController.title.setText("需求计划-需求审核");
            application.showApproval();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
