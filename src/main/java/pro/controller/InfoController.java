package pro.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import pro.entity.Orders;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

/**
 * @Author: zz
 * @Date: 2019/11/11 17:12
 */
public class InfoController {
    //物料分类编码
    @FXML
    private ComboBox materialTypeCode;
    //物料分类名称
    @FXML
    private TextField materialTypeName;
    //物料编码
    @FXML
    private ComboBox materialCode;
    //物料名称
    @FXML
    private TextField materialName;
    //物料规格
    @FXML
    private TextField materialSpe;
    //物料型号
    @FXML
    private TextField materialType;
    //物料单位
    @FXML
    private ComboBox materialUnit;
    //物料数量
    @FXML
    private TextField materialNum;
    //物料需求月份
    @FXML
    private ComboBox materialDemandMoth;
    //物料需求日期
    @FXML
    private DatePicker materialDemandDate;
    //货源是否确定
    @FXML
    private ComboBox sourceSure;
    //期待供应商
    @FXML
    private ComboBox expectedSup;
    //固定供应商
    @FXML
    private ComboBox fixedSup;
    //备注
    @FXML
    private TextField remarks;
    //物料追踪码
    @FXML
    private TextField materialTrackCode;

    VBox father;

    GridPane me;

    /**
     * 给下拉框赋值
     */
    @FXML
    private void initialize() {
        ObservableList<String> strings = FXCollections.observableArrayList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12");
        //设置月份下拉框列表的值
        ObservableList<String> codes = FXCollections.observableArrayList("1", "2");
        materialCode.setItems(strings);
        materialUnit.setItems(strings);
        expectedSup.setItems(strings);
        fixedSup.setItems(strings);
        materialDemandMoth.setItems(strings);
        sourceSure.setItems(codes);
        materialTypeCode.setItems(strings);
    }

    public Orders getOrder(Long planCode) throws ParseException {
        Orders orders = new Orders();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        orders.setDemandPlanCode(planCode);
        orders.setExpectedSup(expectedSup.getValue().toString());
        orders.setFixedSup(fixedSup.getValue().toString());
        orders.setMaterialCode(Long.valueOf(materialCode.getValue().toString()));
        orders.setMaterialDemandDate(formatter.parse(String.valueOf(materialDemandDate.getValue())));
        orders.setMaterialDemandMoth(Integer.parseInt(materialDemandMoth.getValue().toString()));
        orders.setMaterialNum(Integer.parseInt(materialNum.getText()));
        orders.setMaterialSpe(materialSpe.getText());
        orders.setMaterialTrackCode(Long.valueOf(materialTrackCode.getText()));
        orders.setMaterialName(materialName.getText());
        orders.setMaterialType(materialType.getText());
        orders.setMaterialTypeName(materialTypeName.getText());
        orders.setMaterialUnit(materialUnit.getValue().toString());
        orders.setRemarks(remarks.getText());
        orders.setSourceSure(Boolean.valueOf(sourceSure.getValue().toString()));
        orders.setMaterialTypeCode(Integer.parseInt(materialTypeCode.getValue().toString()));

        return orders;
    }

    /**
     * 设置父级
     */
    public void init(GridPane gridPane, VBox page) {
        me = gridPane;
        father = page;
    }

    /**
     * 删除一条订单（orders）
     */
    @FXML
    private void deleteOrders() {
        father.getChildren().remove(me);

        //待填
    }
}
