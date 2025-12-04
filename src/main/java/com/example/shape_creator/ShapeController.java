package com.example.shape_creator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.Pane;

public class ShapeController {

    @FXML
    private Pane canvas;

    @FXML
    private ComboBox<String> shapeSelector;


    @FXML

    void initialize(){
        shapeSelector.getItems().setAll("Kreis","Rechteck");
    }


    @FXML
    void onShow(ActionEvent actionEvent) {
        String selected = shapeSelector.getValue();
        System.out.println(selected);

    }
}
