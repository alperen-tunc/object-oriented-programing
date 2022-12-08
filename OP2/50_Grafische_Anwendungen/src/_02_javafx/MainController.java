package _02_javafx;

import _01_mvc.model.Person;
import _01_mvc.model.PersonService;

public class MainController
{
    private PersonService personService = new PersonService();

    // Controller-Methode unter Einsatz von MVC
    public void personErfassen() {
        // Bemerkung: Methodenaufrufe zwischen Klassen
        // sollen möglichst komplette(s) Objekt(e) oder id(s) übergeben
        // methode(person) methode(personList) oder methode(idList)
        // ===============================================================
        // 1. Person-Daten auslesen (vom Formular, vom Web-Anfrage, ...)
        String vorname = "Peter";
        String nachname = "Schmidt";
        //    Daten konvertieren: String -> LocalDate (Java Type)
        //    Daten validieren  : Geburtsdatum darf nicht in Zukunft sein
        //    Passende Objekte erstellen
        Person person = new Person(vorname, nachname);
        // ===============================================================
        // 2. Modell aufrufen
        //personService.save(vorname, nachname); // Nicht erwünscht (siehe Bemerkung)
        personService.save(person);
        // ===============================================================
        // 3. View aktualisieren (bei Web-App zum Client senden)
        String message = "Person [" + person + "] wurde erfolgreich angelegt!";
        // ==========================
        // Web-App: eine HTML-Seite rendern und zum Client senden
        // ==========================
        // Desktop-App (JavaFX): Formular aktualisieren
        // status_label.setText(message);
        // ==========================
        // Konsolenanwendung
        System.out.println(message);
        // ===============================================================
    }
}
