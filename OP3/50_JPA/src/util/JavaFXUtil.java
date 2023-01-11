package util;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

import java.util.Optional;

public class JavaFXUtil {
  
  public static boolean isConfirmed( String title, String message ) {
    // Bestätigung einbauen
    // ======================================================================
    Alert alert = new Alert(Alert.AlertType.CONFIRMATION); //     NONE, INFORMATION,WARNING,CONFIRMATION, ERROR;
    // ======================================================================
    //Alert alert = new Alert(Alert.AlertType.CONFIRMATION, message, YES, NO );
    // ======================================================================
    alert.setTitle(title);
    //alert.setHeaderText("Bestätigung");
    alert.setContentText(message);
    Optional<ButtonType> userChoice = alert.showAndWait();
    return userChoice.get() == ButtonType.OK;
  }
  
}
