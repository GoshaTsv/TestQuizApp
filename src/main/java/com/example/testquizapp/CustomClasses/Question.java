package com.example.testquizapp.CustomClasses;

import java.util.HashMap;

public class Question {
    public String questionName;
    public HashMap<String, Boolean> variants;

    public Question(String questionName, HashMap<String, Boolean> variants) {
        this.questionName = questionName;
        this.variants = variants;
    }
}
