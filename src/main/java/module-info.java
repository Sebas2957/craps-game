module com.example.reto1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.reto1 to javafx.fxml;
    exports com.example.reto1;
}