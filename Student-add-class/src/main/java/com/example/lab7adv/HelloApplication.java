package com.example.lab7adv;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import java.io.IOException;


public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(5);
        pane.setVgap(5);
        pane.setPadding(new Insets(10, 10, 10, 10));
        HBox hBox = new HBox();


        Label lbn = new Label("Name :");
        pane.add(lbn,0,0);
        TextField textFieldn = new TextField();
        pane.add(textFieldn,1,0);
        Label lbp = new Label("Password :");
        pane.add(lbp,0,1);
        TextField textFieldP = new TextField();
        pane.add(textFieldP,1,1);
        Label lbG = new Label("Gender :");
        pane.add(lbG,0,2);
        ToggleGroup tg = new ToggleGroup();
        RadioButton rb1 = new RadioButton("Male");
        rb1.setToggleGroup(tg);
        rb1.setSelected(false);
        RadioButton rb2 = new RadioButton("Female");
        rb2.setToggleGroup(tg);
        hBox.getChildren().add(rb1);
        hBox.getChildren().add(rb2);
        pane.add(hBox,1,2);

        Label lbL = new Label("Languge :");

        pane.add(lbL,0,3);

        CheckBox c1 = new CheckBox("Arabic");
        CheckBox c2 = new CheckBox("English");
        CheckBox c3 = new CheckBox("France");
        HBox hBox1 = new HBox();
        hBox1.getChildren().add(c1);
        hBox1.getChildren().add(c2);
        hBox1.getChildren().add(c3);
        pane.add(hBox1,1,3);
        Label lbC = new Label("Availbale courses :");
        pane.add(lbC,0,4);
        ListView listView = new ListView();
        listView.getItems().add("Oprating System ");
        listView.getItems().add("Adv Porograming ");
        listView.getItems().add("Networking ");
        hBox.setSpacing(10);
        hBox1.setSpacing(10);
        pane.add(listView,1,4);


        Scene scene = new Scene(pane, 400, 275);
        stage.setTitle("Add new student");
        stage.setScene(scene);
        stage.show();

       stage.setScene(scene);
        stage.show();


    }

    public static void main(String[] args) {
        launch();
    }
}