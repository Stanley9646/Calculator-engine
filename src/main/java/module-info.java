module com.calcengine.calc {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.calcengine.calc to javafx.fxml;
    exports com.calcengine.calc;
}