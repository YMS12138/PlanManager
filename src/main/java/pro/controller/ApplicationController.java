package pro.controller;

import javafx.fxml.FXML;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import org.springframework.stereotype.Controller;
import pro.Application;

import java.io.IOException;
import java.util.concurrent.ThreadPoolExecutor;

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
     *
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
        Thread authrity = new Thread(() -> {
            while (true) {
                if (Application.user == null && !menuBar.isDisable()) {
                    //未登录
                    menuBar.setDisable(true);
                } else {
                    //已登录
                    menuBar.setDisable(false);
                    if (RequirementController.userInfo != null) {
                        RequirementController.userInfo.setText(Application.user.getUserName()
                                + "(" + (Application.user.getUserJob() == 1 ? "管理员" : "普通用户") + ")");
                    }

                    if (Application.user != null) {
                        //管理员
                        if (Application.user.getUserJob() == 2) {
                            userManager.setDisable(false);
                            approvalItem.setDisable(false);
                        } else {
                            //普通用户
                            userManager.setDisable(true);
                            approvalItem.setDisable(true);
                        }
                    }
                }

                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        authrity.setName("authrityThread");
        authrity.start();
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

    @FXML
    private void exit() {
        System.exit(0);
    }
}
