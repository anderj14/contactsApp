module sample.contactsapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens sample.contactsapp to javafx.fxml;
    exports sample.contactsapp;
}