module com.example.testquizapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.testquizapp to javafx.fxml;
    exports com.example.testquizapp;
}