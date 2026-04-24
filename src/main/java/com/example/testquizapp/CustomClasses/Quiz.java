package com.example.testquizapp.CustomClasses;

import java.util.ArrayList;

public class Quiz {
    public String quizName;
    public ArrayList<Question> questions;

    public Quiz(String quizName, ArrayList<Question> questions) {
        this.quizName = quizName;
        this.questions = questions;
    }
}
