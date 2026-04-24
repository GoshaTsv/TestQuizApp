package com.example.testquizapp;

import com.example.testquizapp.CustomClasses.Question;
import com.example.testquizapp.CustomClasses.Quiz;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Window;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

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
    private final Quiz endQuiz = new Quiz();
    public static FileChooser fileChooser = new FileChooser();


    public void addVariant(ActionEvent event) {
    }

    public void deleteVariant(ActionEvent event) {
    }

    public void deleteQuestion(ActionEvent event) {
        endQuiz.questions.remove(endQuiz.questions.size()-1);
    }

    public void addQuestion(ActionEvent event) {
        if (radioTypeExact.isSelected()){
            String answer = answerExactField.getText();
            String questionName = questionNameField.getText();
            HashMap<String, Boolean> variants = new HashMap<>();
            variants.put(answer, true);
            Question question = new Question(questionName, variants);
            endQuiz.questions.add(question);
            answerExactField.clear();
            questionNameField.clear();
        }
    }

    public void exportToJSON(ActionEvent event) throws IOException {
        endQuiz.quizName = quizNameField.getText();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String JSON = gson.toJson(endQuiz);
        System.out.println(JSON);
        Window stage = quizNameField.getScene().getWindow();
        fileChooser.setTitle("Сохранить Тест");
        fileChooser.setInitialFileName("quiz.json");
        fileChooser.getExtensionFilters().clear();
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("json файлы", "*.json"));
        File file = fileChooser.showSaveDialog(stage);
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(JSON);
        fileWriter.close();
    }
    public void initialize(){
        fileChooser.setInitialDirectory(new File(System.getProperty("user.home")));
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
    public void showAlert(String t, String c, Alert.AlertType type){
        Alert alert = new Alert(type);
        alert.setTitle(t);
        alert.setContentText(c);
        alert.show();
    }
}