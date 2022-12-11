package _02_javafx;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class MainController
{
    @FXML
    public void onButtonClick( ActionEvent actionEvent)
    {
        System.out.println("Es wird gespeichert...");
    }

    public void klick(ActionEvent actionEvent)
    {
        System.out.println("Ich habe es gebaut.");
    }
}
