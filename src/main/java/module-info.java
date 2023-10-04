module com.example.martocalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.martocalculator to javafx.fxml;
    exports com.example.martocalculator;
}