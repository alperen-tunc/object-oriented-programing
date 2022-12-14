package Aufgaben.aufgabe_3;

        import javafx.collections.ObservableList;
        import javafx.event.ActionEvent;
        import javafx.fxml.FXML;
        import javafx.scene.control.*;
        import javafx.scene.input.InputEvent;
        import javafx.scene.paint.Color;

        import java.util.List;
        import java.util.Locale;
        import java.util.Optional;

public class MainController
{
    Book book;

    private BookService bookService = new BookService();
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
        Locale.setDefault(Locale.GERMANY); // Falls, die Default-Region eine andere ist.
        List<Book> bookList = bookService.getBookList();
        ObservableList<Book> items = bookListView.getItems();
        items.addAll(bookList);
        setInfoMessage("Applikation gestartet :-)");
    }

    @FXML
    void neuAnlegen(ActionEvent event)
    {
        // =================================================================================
        // 1. Benutzereingabe auslesen, konvertieren, validieren und passende Objekte bilden.
        // =================================================================================
        Book book = getBookFromGUI();
        if (book.getTitel().trim().isEmpty()) { // Kein Titel wurde eingegeben
            setErrorMessage("Sie müssen mindestens einen Titel eingeben!");
            return;
        }
        // =================================================================================
        // 2. Modell aufrufen
        // =================================================================================
        bookService.save(book); // Datenbestand aktualisiert
        // =================================================================================
        // 3. View aktualisieren
        // =================================================================================
        // 3a: BookList View aktualisieren
        ObservableList<Book> bookItems = bookListView.getItems();
        bookItems.add(book);
        // Das gerade erstellte Buch in der Liste auswählen
        bookListView.getSelectionModel().select(book);
        // 3b: Statusmeldung anzeigen
        setInfoMessage("Buch [" + book.getTitel() + "] wurde erfolgreich angelegt!");
    }

    @FXML // Weder MouseEvent noch KeyEvent benutzen, sondern die Superklasse InputEvent
    void buchAuswahl( InputEvent event ) {
        // 1. Benutzereingabe auslesen, konvertieren, validieren und passende Objekte bilden.
        Book book = getSelectedBook(); // Ausgewähltes Buch oder null
        // 2. Modell aufrufen: Nichts zu tun
        // 3. View aktualisieren: Daten des ausgewählten Buchs werden ins Formular geschrieben
        String message;
        if (book == null) { // kein Buch ausgewählt
            book = getEmptyBook();
            message = "Kein Buch ausgewählt.";
        } else {
            message = "Buch [" + book.getTitel() + "] ausgewählt.";
        }
        setGUIFromBook(book);
        setInfoMessage(message);
    }

    private Book getEmptyBook() {
        return new Book("", "", "", "", "");
    }


    @FXML
    void aktualisieren(ActionEvent event)
    {
        // =============================================================================
        // 1. Benutzereingabe auslesen, konvertieren, validieren und passende Objekte bilden.
        Book selectedBook = getSelectedBook();
        int id = selectedBook.getId(); // id ist im ListView-Eintrag gespeichert
        Book bookFromGUI = getBookFromGUI();
        bookFromGUI.setId(id);
        // =============================================================================
        // 2. Modell aufrufen
        // =============================================================================
        bookService.update(bookFromGUI);
        // =============================================================================
        // 3. View aktualisieren
        // =============================================================================
        // ListView aktualisieren
        ObservableList<Book> bookItems = bookListView.getItems();
        int index = bookListView.getSelectionModel().getSelectedIndex();
        bookItems.set(index, bookFromGUI);
        // Statusmeldung aktualisieren
        setInfoMessage("Buch [" + bookFromGUI.getTitel() + "] wurde aktualisiert!");
    }

    private void setInfoMessage(String message) { // in grün
        status_label.setTextFill(Color.GREEN);
        status_label.setText(message);
    }

    private void setErrorMessage(String message) { // in rot
        status_label.setTextFill(Color.RED);
        status_label.setText(message);
    }
    @FXML
    void löschen(ActionEvent event)
    {
        if ( noBookSelection() ) {
            setErrorMessage("Sie müssen vorher ein Buch auswählen!");
            return;
        }
        // =============================================================================
        // Bestätigung abfragen
        if ( ! getConfirmation("Buch löschen", "Sind Sie sicher, dass Sie das Buch löschen wollen") )
            return;
        // =============================================================================
        // 1. Benutzereingabe auslesen, konvertieren, validieren und passende Objekte bilden.
        Book book = getSelectedBook();
        // =============================================================================
        // 2. Modell aufrufen
        // =============================================================================
        bookService.delete(book.getId());
        // =============================================================================
        // 3. View aktualisieren
        // =============================================================================
        bookListView.getItems().remove(book); // Buch aus der View entfernen
        bookListView.getSelectionModel().clearSelection(); // Auswahl entfernen
        setInfoMessage("Buch [" + book.getTitel() + "] wurde gelöscht!");
    }

    private static boolean getConfirmation( String title, String message ) {
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

    private boolean noBookSelection() {
        return getSelectedBook() == null;
    }

    private Book getSelectedBook() {
        return bookListView.getSelectionModel().getSelectedItem();
    }

    @FXML
    void zurücksetzen(ActionEvent event)
    {
        Book empty = new Book("", "", "", "", "");
        setGUIFromBook(empty);
    }
    @FXML
    void book1( ActionEvent event ) {
        Book book = bookService.getSampleBook(1);
        setGUIFromBook(book);
    }

    @FXML
    void book2( ActionEvent event ) {
        Book book = bookService.getSampleBook(2);
        setGUIFromBook(book);
    }

    @FXML
    void book3( ActionEvent event ) {
        Book book = bookService.getSampleBook(3);
        setGUIFromBook(book);
    }

    private Book getBookFromGUI() {
        String titel = titel_tf.getText();
        String verlag = verlag_tf.getText();
        String isbn = isbn_tf.getText();
        String autor = author_tf.getText();
        String datum = datum_tf.getText();
        Book book = new Book(titel, verlag, isbn, autor, datum);
        return book;
    }

    private void setGUIFromBook( Book book ) {
        titel_tf.setText(book.getTitel());
        verlag_tf.setText(book.getVerlag());
        isbn_tf.setText(book.getISBN());
        author_tf.setText(book.getAuthor());
        datum_tf.setText(book.getDatum());
    }
}
