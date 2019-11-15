package pro.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import pro.entity.Orders;

import java.util.Date;
import java.util.List;

/**
 * 汇总页面的信息表格
 */
public class InfoAllController {

    @FXML
    private Label materialName;
    @FXML
    private Label materialTypeCode;
    @FXML
    private Label materialTypeName;
    @FXML
    private Label materialCode;
    @FXML
    private Label materialSpe;
    @FXML
    private Label materialType;
    @FXML
    private Label materialUnit;
    @FXML
    private Label materialNum;
    @FXML
    private Label materialDemandMoth;
    @FXML
    private Label materialDemandDate;
    @FXML
    private Label sourceSure;
    @FXML
    private Label expectedSup;
    @FXML
    private Label fixedSup;
    @FXML
    private Label remarks;
    @FXML
    private Label materialTrackCode;
    @FXML
    private Label demandPlanCode;

    /**
     * 初始化
     */
    public void init(Orders orders) {
        //...

    }
}
