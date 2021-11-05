module it.giulio.rustia.ispw.justit {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens it.giulio.rustia.ispw.justit to javafx.fxml;
    exports it.giulio.rustia.ispw.justit;
}