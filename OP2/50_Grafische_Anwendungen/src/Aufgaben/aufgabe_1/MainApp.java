package Aufgaben.aufgabe_1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApp extends Application
{
    public static void main(String[] args)
    {
        launch(args);
        System.out.println("\n\nEnd of Main..");
    }

    @Override
    public void start(Stage stage) throws IOException
    {

        FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource("Main.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

//        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Main.fxml")));
//        Scene scene = new Scene(root);

        stage.setTitle("Arithmetische Operationen in einer Seite");
        stage.setScene(scene);
        stage.show();

    }
}

// --module-path "C:\Program Files (x86)\Java\javafx-sdk-11.0.2\lib" --add-modules=javafx.controls,javafx.fxml
