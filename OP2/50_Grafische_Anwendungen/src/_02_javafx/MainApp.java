package _02_javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApp extends Application
{
/*
 Folgende Zeile in die VM-Optionen der "Run Configuration" der aktuellen MainApp hinzufügen:
   --module-path \path\to\javafx-sdk-19\lib --add-modules=javafx.controls,javafx.fxml
 */

    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource("Main.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        //Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
        //Scene scene = new Scene(root);

        stage.setTitle("My First JavaFX Application");
        stage.setScene(scene);
        stage.show();

    }
}

