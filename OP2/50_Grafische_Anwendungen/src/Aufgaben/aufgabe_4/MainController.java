package Aufgaben.aufgabe_4;

import Aufgaben.aufgabe_3.BookService;
import com.sun.javafx.collections.ImmutableObservableList;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.Chronology;
import java.util.List;
import java.util.Locale;

public class MainController
{
    private PersonService personService = new PersonService();

    @FXML
    private ListView<Person> personListView = new ListView<>();

    @FXML
    private TextField vorname_tf;

    @FXML
    private TextField nachname_tf;

    @FXML
    private DatePicker datePicher_f;

    @FXML
    private TextField strassenname_tf;

    @FXML
    private TextField hausnummer_tf;

    @FXML
    private TextField plz_tf;

    @FXML
    private TextField ort_tf;

    @FXML
    private RadioButton gesetzlich_rb;

    @FXML
    private RadioButton privat_rb;

    @FXML
    private RadioButton ledig_rb;

    @FXML
    private RadioButton verheiratet_rb;

    @FXML
    private RadioButton geschieden_rb;

    @FXML
    private RadioButton getrentlebend_rb;

    @FXML
    private CheckBox java_cb;

    @FXML
    private CheckBox cSharp_cb;

    @FXML
    private CheckBox cPlusPlus_cb;

    @FXML
    private CheckBox php_cb;

    @FXML
    private CheckBox andere_cb;
    @FXML
    private Label statusInfo;

    @FXML
    void initialize()
    {
        Locale.setDefault(Locale.GERMANY);
        List<Person> personList = personService.getPersonList();
        ObservableList<Person> items = personListView.getItems();
        items.addAll(personList);
        System.out.println("Applikation wird gestartet.");
    }

    @FXML
    void neuAnlegen(ActionEvent event)
    {
        Person person = getPersonFromGui();

        if(person.getVorname().trim().isEmpty())
        {
            System.err.println("Bitte geben Sie Ihren Vornamen ein.");
            return;
        }

        personService.save(person);

        //personListView.getItems().add(person);

        ObservableList<Person> personObservableList = personListView.getItems();
        personObservableList.add(person);

        personListView.getSelectionModel().select(person);

        statusInfo.setText(person + " wurde erfolgreich angelegt.");

    }

    @FXML
    void aktualisieren(ActionEvent event) {

    }

    @FXML
    void getDate(ActionEvent event) {

    }

    @FXML
    void löschen(ActionEvent event) {

    }

    @FXML
    void person1(ActionEvent event) {

    }

    @FXML
    void person2(ActionEvent event) {

    }

    @FXML
    void person3(ActionEvent event) {

    }

    @FXML
    void zurücksetzen(ActionEvent event) {

    }

    private Person getPersonFromGui()
    {
        String vorname = vorname_tf.getText();
        String nachname = nachname_tf.getText();
        LocalDate geburtsdatum = datePicher_f.getValue();
        String strasse = strassenname_tf.getText();
        String hausnummer = hausnummer_tf.getText();
        String plz = plz_tf.getText();
        String ort = ort_tf.getText();

        Person person = new Person(vorname, nachname, geburtsdatum, strasse, hausnummer, plz, ort);
        return person;
    }

}
