package pro.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.Date;

/**
 * 新建需求计划页面的子模块
 * --流程信息表
 */
public class ProcessInfoController {

    /**
     * 行号
     */
    @FXML
    private Label id;
    /**
     * 审批人
     */
    @FXML
    private Label person;
    /**
     * 审批时间
     */
    @FXML
    private Label time;
    /**
     * 审批意见
     */
    @FXML
    private Label suggestion;
    /**
     * 说明
     */
    @FXML
    private Label remark;

    /**
     * 渲染（填数据）
     */
    public void model(String... values) {
        /**
         * 将需要的数据传进来，赋值给各个Label
         */
    }
}
