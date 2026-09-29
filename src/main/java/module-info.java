module com.senai.javafx.javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.senai.javafx.javafx to javafx.fxml;
    exports com.senai.javafx.javafx;
}