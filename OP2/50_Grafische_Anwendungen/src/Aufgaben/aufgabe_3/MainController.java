package Aufgaben.aufgabe_3;

        import javafx.beans.value.ChangeListener;
        import javafx.beans.value.ObservableValue;
        import javafx.event.ActionEvent;
        import javafx.fxml.FXML;
        import javafx.fxml.Initializable;
        import javafx.scene.control.ListView;
        import javafx.scene.control.TextField;
        import javafx.scene.layout.BorderPane;

        import java.net.URL;
        import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.List;
        import java.util.ResourceBundle;

public class MainController implements Initializable
{
    List<String> bücherList = new ArrayList<>();

    @FXML
    private ListView<String> myListView = new ListView<>();
    @Override
    public void initialize(URL arg0, ResourceBundle arg1)
    {
        myListView.getItems().addAll(bücherList);
    }

    @FXML
    private TextField titel_tf;

    @FXML
    private TextField verlag_tf;

    @FXML
    private TextField isbn_tf;

    @FXML
    private TextField author_tf;

    @FXML
    private TextField datum_tf;

    String titel;
    String author;

    String textAuslesen()
    {
        titel = titel_tf.getText();
        author = author_tf.getText();

        return titel + " " + author;
    }

    @FXML
    void aktualisieren_tf(ActionEvent event)
    {


    }

    @FXML
    void drei_tf(ActionEvent event)
    {

    }

    @FXML
    void eins_tf(ActionEvent event)
    {

    }

    @FXML
    void löschen_tf(ActionEvent event)
    {
        bücherList.remove(bücherList.size()-1);

    }

    @FXML
    void neuAnlegen_tf(ActionEvent event)
    {

        bücherList.add(textAuslesen());

    }

    @FXML
    void zrücksetzen_tf(ActionEvent event)
    {

    }

    @FXML
    void zwei_tf(ActionEvent event)
    {

    }
}
