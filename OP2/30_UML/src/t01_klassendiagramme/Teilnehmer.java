package t01_klassendiagramme;

import java.time.LocalDate;
import java.util.List;

public class Teilnehmer extends Person {
  private LocalDate startDatum; // Startdatum der Ausbildung
  
  private List<Veranstaltung> veranstaltungen;
}
