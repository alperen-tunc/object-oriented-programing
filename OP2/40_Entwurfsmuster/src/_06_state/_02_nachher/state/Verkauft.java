package _06_state._02_nachher.state;

import _06_state._02_nachher.KaugummiAutomat;

public class Verkauft implements Zustand
{
    private KaugummiAutomat kaugummiAutomat;

    public Verkauft( KaugummiAutomat kaugummiAutomat ) {
        this.kaugummiAutomat = kaugummiAutomat;
    }

    public void münzeEinwerfen() { // Fehlermeldung
        System.out.println("Bitte warten Sie, wir geben Ihnen bereits einen Kaugummi");
    }

    public void münzeAuswerfen() { // Fehlermeldung
        System.out.println("Tut mir leid, Sie haben schon an der Kurbel gedreht.");
    }

    public void hebelDrehen() { // Fehlermeldung
        System.out.println("Zweimaliges Drehen bringt dir keinen weiteren Kaugummi!");
    }

    public void ausgeben() {
        // da hier kein Zugriff auf Anzahl besteht => Anzahl wird im kaugummiAutomat dekrementiert
        kaugummiAutomat.kaugummiHerauswerfen(); // Anzahl dekrementieren
        if (kaugummiAutomat.getAnzahl() > 0) {
            kaugummiAutomat.setState( kaugummiAutomat.getKeineMünzeState() );
        } else {
            System.out.println("Ups, keine Kaugummis mehr da!");
            kaugummiAutomat.setState( kaugummiAutomat.getLeerState() );
        }
    }

    public void nachfüllen( ) {
    }

    public String toString() {
        return "Kaugummi wird ausgeben ...";
    }
}
