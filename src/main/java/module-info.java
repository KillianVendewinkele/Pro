module com.example.pro {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.pro to javafx.fxml;
    exports com.example.pro;
}