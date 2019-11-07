package pro.controller;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

/**
 * 需求查改子页面
 */
public class FindAndFixController {

    @FXML
    private ComboBox<String> comboBox;

    /**
     *  下拉框使用的测试案例，其他下拉框参照此种方法进行编写
     */
    @FXML
    private void buttonTest(){
        //以下为ComboBox的具体操作方法
        //创建下拉框的列表
        ObservableList<String> strings = FXCollections.observableArrayList("option 1", "option 2", "option 3");
        //设置下拉框列表的值
        comboBox.setItems(strings);
        //使用索引值为0的对象作为初始选项，0 <= index < strings.size()
        comboBox.getSelectionModel().select(0);
        //添加一个元素
        comboBox.getItems().addAll("hahaha");

        //设置当前选项的值
//        comboBox.setValue("123");
    }
}
