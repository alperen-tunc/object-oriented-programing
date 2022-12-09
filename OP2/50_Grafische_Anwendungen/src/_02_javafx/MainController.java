package _02_javafx;

import _01_mvc.model.Person;
import _01_mvc.model.PersonService;
import javafx.fxml.FXML;

import java.awt.event.ActionEvent;

public class MainController
{
    @FXML
    public void onButtonClick( ActionEvent actionEvent)
    {
        System.out.println("Button Click!");
    }
}
