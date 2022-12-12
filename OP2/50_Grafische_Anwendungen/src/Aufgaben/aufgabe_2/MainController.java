package Aufgaben.aufgabe_2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private TextField celcius_text_tf;

    @FXML
    private TextField fahrenheit_text_tf;

    double celcius;
    double fahrenheit;

    private void zahlAuslesen_celcius()
    {
        celcius = Double.parseDouble(celcius_text_tf.getText());
    }

    private void zahlAuslesen_fahrenheit()
    {
        fahrenheit = Double.parseDouble(fahrenheit_text_tf.getText());
    }


    @FXML
    void celcius_to_fahrenheit_tf(ActionEvent event) {

        zahlAuslesen_celcius();

        fahrenheit_text_tf.setText(rechnerFahrenheit());
    }

    @FXML
    void fahrenheit_to_celcius_tf(ActionEvent event) {

        zahlAuslesen_fahrenheit();

        celcius_text_tf.setText(rechnerCelcius());

    }

    String rechnerCelcius()
    {
        celcius = (fahrenheit-32) * 5/9;
        return celcius + "";
    }

    String rechnerFahrenheit()
    {
        fahrenheit = celcius * 1.8 + 32;
        return fahrenheit + "";
    }

}
