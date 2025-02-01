package edu.ec.inventario;

import edu.ec.inventario.entity.Persona;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class InventarioController {

    @FXML
    private Button idAdd;

    @FXML
    private TextField idCantidad;

    private ObservableList<Persona> cantidadList = FXCollections.observableArrayList();

    @FXML
    private TextField idCodigo;

    @FXML
    private TextField idDescripcion;

    @FXML
    private Button idLimpiar;

    @FXML
    private TableColumn<Persona, String> tbCantidad;

    @FXML
    private TableColumn<Persona, String> tbCodigo;

    @FXML
    private TableColumn<Persona, String> tbDescripcion;

    @FXML
    private TableView<Persona> idTable;
    
    @FXML
    void initialize(){
        tbCodigo.setCellValueFactory(new PropertyValueFactory<>("codigo"));
        tbDescripcion.setCellValueFactory(new PropertyValueFactory<>("descripcion"));
        tbCantidad.setCellValueFactory(new PropertyValueFactory<>("cantidad"));

        idTable.setItems(cantidadList);

    }

    @FXML
    void ingresar(ActionEvent event) {
        String newCode = idCodigo.getText();
        String newDescription = idDescripcion.getText();
        String newAmount = idCantidad.getText();

        if (newCode.isEmpty()){
            alertasGenerales("Ingrese el código del producto");
            return;
    }
        if (newDescription.isEmpty()){
            alertasGenerales("Ingrese la descripción del producto");
            return;
    }
        if (newAmount.isEmpty()) {
            alertasGenerales("Ingrese la cantidad del producto");
            return;
    }

        Persona objPersona = new Persona();
        objPersona.setCodigo(newCode);
        objPersona.setDescripcion(newDescription);
        objPersona.setCantidad(newAmount);

        cantidadList.add(objPersona);
        idTable.refresh();
        
        limpiarCampos();


    }

    @FXML
    void limpiar(ActionEvent event) {
        idCodigo.setText("");
        idDescripcion.setText("");
        idCantidad.setText("");

    }
    
// crear método de alertas (refactorizaciòn de còdigo)
    void alertasGenerales (String mensaje){
            Alert alert = new Alert (Alert.AlertType.WARNING);
            alert.setHeaderText("Ingrese valores");
            alert.setTitle("Información");
            alert.setContentText(mensaje);
            alert.showAndWait();

    }
    
    @FXML
    void clearWindows(ActionEvent event) {
        limpiarCampos();
    }

    private void limpiarCampos() {
        idCodigo.clear();
        idDescripcion.clear();
        idCantidad.clear();

    }


}
