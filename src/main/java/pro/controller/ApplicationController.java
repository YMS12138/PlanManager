package pro.controller;

import javafx.fxml.FXML;
import pro.Application;

import java.io.IOException;

/**
 * 主窗口
 */
public class ApplicationController {
    private Application application;

    public void setApplication(Application application) {
        this.application = application;
    }

    @FXML
    private void init() {

    }

    @FXML
    private void showYears() {
        try {
            application.requirement();
            application.showYears();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void showMonth() {
        try {
            application.requirement();
            application.showMonth();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void showUrgent() {
        try {
            application.requirement();
            application.showUrgent();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void showLogin() {

        try {
            application.showLogin();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
