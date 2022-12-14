package Aufgaben.aufgabe_3;

        import javafx.collections.ObservableList;
        import javafx.event.ActionEvent;
        import javafx.fxml.FXML;
        import javafx.scene.control.Label;
        import javafx.scene.control.ListView;
        import javafx.scene.control.TextField;
        import javafx.scene.input.InputEvent;

        import java.util.List;

public class MainController
{
    Book book;

    private BookService bookservice = new BookService();
    @FXML
    private ListView<Book> bookListView = new ListView<>();

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
    private Label status_label;
    @FXML
        // "initialize()" ===> Spezielle Methode, wird dem Konstruktor ausgeführt
    void initialize() {
        List<Book> bookList = bookservice.getBookList();
        ObservableList<Book> items = bookListView.getItems();
        items.addAll(bookList);
    }

    @FXML
    void neuAnlegen_tf(ActionEvent event)
    {
        String titel = titel_tf.getText();
        String verlag = verlag_tf.getText();
        String isbn = isbn_tf.getText();
        String author = author_tf.getText();
        String datum = datum_tf.getText();
        book = new Book(titel, author, isbn, verlag, datum);

        bookservice.save(book);

        ObservableList<Book> bookItems = bookListView.getItems();
        bookItems.add(book);


        bookListView.getSelectionModel()
                .select(book);


        status_label.setText("Buch [" + titel + "] wurde erfolgreich angelegt.");
    }

    @FXML // Weder MouseEvent noch KeyEvent benutzen, sondern die Superklasse InputEvent
    void buchAuswahl( InputEvent event ) {
        System.out.println("MainController.buchAuswahl() ... ");
        Book book = getSelectedBook(); // Ausgewähltes Buch oder null
        // Daten des ausgewählten Buchs werden ins Formular geschrieben
        if (book == null)
            book = new Book("", "", "", "", "");
        buchZuFormular(book);
    }

    @FXML
    void aktualisieren_tf(ActionEvent event)
    {

    }
    @FXML
    void löschen_tf(ActionEvent event)
    {
        Book book = getSelectedBook();

        bookservice.delete( book.getId() );

        bookListView.getItems().remove(book); 
        status_label.setText("Buch [" + book.getTitel() + "] wurde gelöscht!");
    }

    private Book getSelectedBook() {
        return bookListView.getSelectionModel()
                .getSelectedItem();
    }

    @FXML
    void zurücksetzen_tf(ActionEvent event)
    {
        Book empty = new Book("", "", "", "", "");
        buchZuFormular(empty);
    }
    @FXML
    void book1( ActionEvent event ) {
        Book book = bookservice.getSampleBook(1);
        buchZuFormular(book);
    }

    @FXML
    void book2( ActionEvent event ) {
        Book book = bookservice.getSampleBook(2);
        buchZuFormular(book);
    }

    @FXML
    void book3( ActionEvent event ) {
        Book book = bookservice.getSampleBook(3);
        buchZuFormular(book);
    }
    private void buchZuFormular( Book book ) {
        titel_tf.setText(book.getTitel());
        verlag_tf.setText(book.getVerlag());
        isbn_tf.setText(book.getISBN());
        author_tf.setText(book.getAuthor());
        datum_tf.setText(book.getDatum());
    }
}
