package vorlesung;

import java.util.ArrayList;

// Eine Klasse muss abstrakt sein, wenn sie mindestens eine abstrakte Methode hat.
public abstract class Krokodil
{
    // Abstrakte Klassen werden als Generalisierungsklasse betrachtet, die in der Regel dazu da sind, Subklassen in einer gemeinsamen Superklasse zusammenzufassen.
    // Von diesen klassen sollen daher keine Instanzen gebildet werden können.

    // Diese Klassen können dann, zum Beispiel, zur Bildung von Listen verwendet werden, in die dann Subklassen-Objekte zur Iteration gespeichert werden können.
    public static final ArrayList<Krokodil> krokodilListe = new ArrayList<>(); // Statische Member sind erlaubt.

    private String farbe; // Attribute sind erlaubt.

    public String getFarbe() // nicht-abstrakte Methode.
    {
        return farbe;
    }

    // Abstrakte Klassen haben in der Regel einen 'protected' Konstruktor.
    // Da von abstrakten Klassen keine Objekte erzeugt werden können, wird dies über 'protected' Konstruktoren verdeutlicht.
    protected Krokodil(String farbe)
    {
        this.farbe = farbe;
        krokodilListe.add(this);
    }

    public void schwimmen() // nicht-abstrakte Methode.
    {
        System.out.println("Ich schwimme im Wasser.");
    }

    // Abstrakte Methode:
    /**
     * Diese Methode gibt Informationen zum Lebensraum des Krokodils aus.
     */
    public abstract void zeigeInfoZumLebensraum(); // abstrakte Methoden haben keinen Funktionskörper, sondern nur: Rückgabetyp / Name / Parameterliste

    //private abstract void methode(); // Fehler -> private abstrakte Methoden sind nicht erlaubt!
}