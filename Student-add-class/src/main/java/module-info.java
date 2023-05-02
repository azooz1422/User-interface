module com.example.lab7adv {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lab7adv to javafx.fxml;
    exports com.example.lab7adv;
}