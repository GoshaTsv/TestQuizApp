package com.example.testquizapp.CustomClasses;

import java.util.ArrayList;

public class Quiz {
    public String quizName;
    public ArrayList<Question> questions;

    public Quiz(String quizName, ArrayList<Question> questions) {
        this.quizName = quizName;
        this.questions = questions;
    }

    public Quiz() {
        this.questions = new ArrayList<>();
    }

    public String getQuizName() {
        return quizName;
    }

    public void setQuizName(String quizName) {
        this.quizName = quizName;
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }
}
