package com.example.testquizapp;

import com.example.testquizapp.CustomClasses.Quiz;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

public class HelloController {
    public TextField quizNameField;
    public TextField questionNameField;
    public RadioButton radioTypeVar;
    public ToggleGroup answerType;
    public RadioButton radioTypeExact;
    public VBox VBoxVars;
    public ScrollPane scrollVars;
    public ToggleGroup rightAnswer1;
    public VBox VBoxExact;
    public TextField answerExactField;
    private Quiz endQuiz;


    public void addVariant(ActionEvent event) {
    }

    public void deleteVariant(ActionEvent event) {
    }

    public void deleteQuestion(ActionEvent event) {
        endQuiz.questions.remove(endQuiz.questions.size()-1);
    }

    public void addQuestion(ActionEvent event) {
        if (radioTypeExact.isSelected()){

        }
    }

    public void exportToJSON(ActionEvent event) {
    }
    public void initialize(){
        VBoxVars.setDisable(false);
        VBoxVars.setVisible(true);
        VBoxExact.setVisible(false);
        VBoxExact.setDisable(true);
        radioTypeExact.setOnAction(x ->{
            VBoxVars.setDisable(true);
            VBoxVars.setVisible(false);
            VBoxExact.setVisible(true);
            VBoxExact.setDisable(false);
        });
        radioTypeVar.setOnAction(x ->{
            VBoxVars.setDisable(false);
            VBoxVars.setVisible(true);
            VBoxExact.setVisible(false);
            VBoxExact.setDisable(true);
        });
    }
}