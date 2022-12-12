package _03_Applikation;

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

    double zahl1, zahl2;

    private void zahlenAuslesen()
    {
        zahl1 = Double.parseDouble(zahl1_tf.getText());
        zahl2 = Double.parseDouble(zahl2_tf.getText());
    }

    @FXML
    void addition(ActionEvent event)
    {
        zahlenAuslesen();
        ergebnis_tf.setText((zahl1 + zahl2) + "");
    }

    @FXML
    void division(ActionEvent event)
    {
        zahlenAuslesen();
        ergebnis_tf.setText((zahl1 / zahl2) + "");
    }

    @FXML
    void modulo(ActionEvent event)
    {
        zahlenAuslesen();
        ergebnis_tf.setText((zahl1 % zahl2) + "");
    }

    @FXML
    void multiplikation(ActionEvent event)
    {
        zahlenAuslesen();
        ergebnis_tf.setText((zahl1 * zahl2) + "");
    }

    @FXML
    void subtraktion(ActionEvent event)
    {
        zahlenAuslesen();
        ergebnis_tf.setText((zahl1 - zahl2) + "");
    }

}
