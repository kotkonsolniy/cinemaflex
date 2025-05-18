module org.example.cinemaflex {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.cinemaflex to javafx.fxml;
    exports org.example.cinemaflex;
}