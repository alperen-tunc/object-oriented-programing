package _03_Aplikation;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class AppController {

    @FXML
    private TextField zahl1_tf;

    @FXML
    private TextField zahl2_tf;

    @FXML
    private TextField ergebnis_tf;

    @FXML
    void addition(ActionEvent event)
    {
        double zahl1 = Double.parseDouble(zahl1_tf.getText());
        double zahl2 = Double.parseDouble(zahl2_tf.getText());
        ergebnis_tf.setText((zahl1 + zahl2) + "");

    }

    @FXML
    void division(ActionEvent event)
    {

    }

    @FXML
    void modulo(ActionEvent event)
    {

    }

    @FXML
    void multiplikation(ActionEvent event)
    {

    }

    @FXML
    void subtraktion(ActionEvent event)
    {

    }

}
