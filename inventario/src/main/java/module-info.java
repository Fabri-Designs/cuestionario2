module edu.ec.inventario {
    requires javafx.controls;
    requires javafx.fxml;

    opens edu.ec.inventario to javafx.fxml;
    opens edu.ec.inventario.entity to javafx.fxml;
    exports edu.ec.inventario;
    exports edu.ec.inventario.entity;
}
