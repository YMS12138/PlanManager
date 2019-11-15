package pro.controller;

import javafx.fxml.FXML;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import pro.Application;

import java.io.IOException;

/**
 * 主窗口
 */
@Controller
public class ApplicationController {
    /**
     * 程序窗口对象
     */
    private Application application;

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
