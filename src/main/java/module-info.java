module com.example.testquizapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;


    opens com.example.testquizapp to javafx.fxml, com.google.gson;
    opens com.example.testquizapp.CustomClasses to com.google.gson;
    exports com.example.testquizapp;
}