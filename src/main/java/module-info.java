module com.example.extraclase1calculadora {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.extraclase1calculadora to javafx.fxml;
    exports com.example.extraclase1calculadora;
}