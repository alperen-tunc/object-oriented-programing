package Aufgaben.aufgabe_1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private TextField zahl1_tf;

    @FXML
    private TextField zahl2_tf;

    @FXML
    private TextField summe_tf;

    @FXML
    private TextField differenz_tf;

    @FXML
    private TextField produkt_tf;

    @FXML
    private TextField modulo_tf;

    @FXML
    private TextField teilung_tf;

    double zahl1;
    double zahl2;

    private void zahlenAuslesen()
    {
        zahl1 = Double.parseDouble(zahl1_tf.getText());
        zahl2 = Double.parseDouble(zahl2_tf.getText());
    }

    @FXML
    void onButton_tf(ActionEvent event) {

        zahlenAuslesen();
        summe_tf.setText((zahl1 + zahl2) + "");
        differenz_tf.setText((zahl1 - zahl2) + "");
        produkt_tf.setText((zahl1 * zahl2) + "");
        modulo_tf.setText((zahl1 % zahl2) + "");
        teilung_tf.setText((zahl1 / zahl2) + "");

    }

}
