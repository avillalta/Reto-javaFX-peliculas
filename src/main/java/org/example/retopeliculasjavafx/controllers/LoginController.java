package org.example.retopeliculasjavafx.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;


public class LoginController implements Initializable {


    @javafx.fxml.FXML
    private TextField txtUserName;
    @javafx.fxml.FXML
    private Button btnLogin;
    @javafx.fxml.FXML
    private Button btnExit;
    @javafx.fxml.FXML
    private PasswordField txtPassword;

    @javafx.fxml.FXML
    public void loginApp(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void closeApp(ActionEvent actionEvent) {
        System.exit(0);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
