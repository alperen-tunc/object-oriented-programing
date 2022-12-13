package Aufgaben.aufgabe_3;

        import javafx.collections.ObservableList;
        import javafx.event.ActionEvent;
        import javafx.fxml.FXML;
        import javafx.scene.control.ListView;
        import javafx.scene.control.TextField;

public class MainController
{
    Buch buch;

    private BookService bookservice = new BookService();
    @FXML
    private ListView<Buch> myListView = new ListView<>();

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

    }

    @FXML
    void neuAnlegen_tf(ActionEvent event)
    {
        String titel = titel_tf.getText();
        String verlag = verlag_tf.getText();
        String isbn = isbn_tf.getText();
        String author = author_tf.getText();
        String datum = datum_tf.getText();
        buch = new Buch(titel,author,isbn,verlag,datum);

        bookservice.save(buch);

        ObservableList<Buch> bookItems = myListView.getItems();
        bookItems.add(buch);



    }

    @FXML
    void zurücksetzen_tf(ActionEvent event)
    {

    }

    @FXML
    void zwei_tf(ActionEvent event)
    {

    }
}
