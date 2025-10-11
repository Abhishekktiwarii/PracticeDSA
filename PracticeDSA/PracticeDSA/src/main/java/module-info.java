module com.example.practicedsa {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.practicedsa to javafx.fxml;
    exports com.example.practicedsa;
    exports com.example.practicedsa.Recursion;
    opens com.example.practicedsa.Recursion to javafx.fxml;
}