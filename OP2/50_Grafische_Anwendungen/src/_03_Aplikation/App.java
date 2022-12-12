package _03_Aplikation;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class App extends Application
{
    public static void main(String[] args)
    {
        launch(args);
        System.out.println("\n\nEnd of Main..");
    }

    @Override
    public void start(Stage stage) throws IOException
    {

        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("Main.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

//        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Main.fxml")));
//        Scene scene = new Scene(root);

        stage.setTitle("Arithmetische Operationen");
        stage.setScene(scene);
        stage.show();

    }
}
