package pro.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;

/**
 * 汇总左侧
 */
public class SummaryLeftController {

    @FXML
    ComboBox<String> year;
    @FXML
    ComboBox<String> month;


    @FXML
    private void initialize() {
        ObservableList<String> yearList = FXCollections.observableArrayList("无限制","2018", "2019", "2020");
        ObservableList<String> monthList = FXCollections.observableArrayList("无限制");
        for (int i = 0; i < 12; i++) {
            monthList.addAll(String.valueOf(i + 1));
        }

        year.setItems(yearList);
        month.setItems(monthList);
    }
}
