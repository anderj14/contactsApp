module sample.contactsapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml;


    opens sample.contactsapp to javafx.fxml;
    exports sample.contactsapp;
}