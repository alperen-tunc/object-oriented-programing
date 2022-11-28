package t01_klassendiagramme;

import java.time.LocalDate;
import java.util.List;

public class Veranstaltung {
  private String bezeichnung;
  private LocalDate startDatum;
  private LocalDate endDatum;
  private List<Teilnehmer> teilnehmerListe;
}
