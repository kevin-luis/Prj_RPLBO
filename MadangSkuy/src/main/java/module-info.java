module com.rplbo.madangskuy {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.rplbo.madangskuy to javafx.fxml;
    exports com.rplbo.madangskuy;
    exports com.rplbo.madangskuy.Controllers;
    exports com.rplbo.madangskuy.Controllers.Admin;
    exports com.rplbo.madangskuy.Controllers.Client;
    exports com.rplbo.madangskuy.Models;
    exports com.rplbo.madangskuy.Views;
}