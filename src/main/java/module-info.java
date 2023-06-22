module sample.contactsapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml;


    opens datamodel;
    opens sample.contactsapp to javafx.fxml;
    exports sample.contactsapp;
}