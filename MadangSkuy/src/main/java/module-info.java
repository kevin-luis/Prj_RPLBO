module com.rplbo.madangskuy {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.rplbo.madangskuy to javafx.fxml;
    exports com.rplbo.madangskuy;
}