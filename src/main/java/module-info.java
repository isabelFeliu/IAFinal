module com.example.iafinal {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.iafinal to javafx.fxml;
    exports com.example.iafinal;
}