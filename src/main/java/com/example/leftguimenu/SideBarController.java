package com.example.leftguimenu;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SideBarController implements Initializable {
    @FXML
    private BorderPane borderpane;


    public void clear(){
        borderpane.setCenter(null);
    }

    public void ui1(){
        LoadUI("ui1");
    }

    public void ui2(){
        LoadUI("ui2");
    }

    public void ui3(){
        borderpane.getScene().getWindow();
        Stage stage = (Stage) borderpane.getScene().getWindow();
        stage.close();
    }

    private void LoadUI(String ui){
        Parent root = null;
        try {
           root = FXMLLoader.load(getClass().getResource(ui+".fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        borderpane.setCenter(root);
    }



    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}