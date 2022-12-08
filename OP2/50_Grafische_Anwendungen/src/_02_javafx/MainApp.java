package _02_javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApp extends Application
{
    static _02_javafx.MainController controller = new MainController();

    public static void main(String[] args)
    {
        launch(args);
        controller.personErfassen();

        System.out.println("\n\nEnd of Main..");
    }
    @Override
    public void start( Stage stage ) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource("Main.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Fenster-Titel");
        stage.setScene(scene);
        stage.show();

    }
}
