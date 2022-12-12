package Aufgaben.aufgabe_3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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


//        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Main.fxml")));
//        Scene scene = new Scene(root);

        /*BorderPane pane = new BorderPane();
        ListView<String> tiere = new ListView<>();
        tiere.getItems().add("Katze");
        tiere.getItems().add("Hund");
        pane.setCenter(tiere);*/


        Scene scene = new Scene(fxmlLoader.load());

        // Scene scene = new Scene(pane);



        stage.setTitle("Bücherladen");
        stage.setScene(scene);
        stage.show();

    }
}
