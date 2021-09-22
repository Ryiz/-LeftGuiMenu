module com.example.leftguimenu {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.leftguimenu to javafx.fxml;
    exports com.example.leftguimenu;
}