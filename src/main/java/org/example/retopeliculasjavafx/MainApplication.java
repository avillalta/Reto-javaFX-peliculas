package org.example.retopeliculasjavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application {

    private static Stage ventana;

    @Override
    public void start(Stage stage) throws IOException {
        ventana = stage;
        loadFXML("views/login-view.fxml", "Peliculas");
        stage.show();
    }

    public static void loadFXML(String view, String title) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource(view));
        Scene scene = null;
        try{
            scene = new Scene(fxmlLoader.load(), 320, 240);
        }catch (IOException e){
            throw new RuntimeException(e);
        }

        ventana.setTitle("Hello!");
        ventana.setScene(scene);
    }

    public static void main(String[] args) {
        launch();
    }
}