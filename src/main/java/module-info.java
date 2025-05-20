module org.example.cinemaflex {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    opens org.example.cinemaflex to javafx.fxml;
    exports org.example.cinemaflex;
}