package edu.ec.inventario;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {

    @FXML
    private Button btnClean;

    @FXML
    private Button btnLogin;

    @FXML
    private PasswordField txtPasword;

    @FXML
    private TextField txtUser;

    @FXML
    void entrar(ActionEvent event) {

        String usuario = txtUser.getText();
        String password = txtPasword.getText();

        if (usuario.equals("root") && password.equals("12345")) {
            abrirPantallaInventario();
        } else {
            mostrarAlerta("Error", "Los datos ingresados son incorrectos", "Vuelva a ingresar su usuario y contraseña.");
        }
        
    }

    private void abrirPantallaInventario() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("inventario.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Gestión de Inventario");
            stage.show();

            // Cerrar la ventana de login
            Stage loginStage = (Stage) btnLogin.getScene().getWindow();
            loginStage.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void mostrarAlerta(String titulo, String header, String contenido) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(titulo);
        alert.setHeaderText(header);
        alert.setContentText(contenido);
        alert.showAndWait();
    }

    @FXML
    void limpiar(ActionEvent event) {
        txtUser.clear();
        txtPasword.clear();
    }

}
