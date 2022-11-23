package aufgaben;

/*
Schreiben Sie bitte ein Java-Programm, in dem ...
- eine Klasse 'Kurs' definiert wird.
  + folgende Member besitzt diese Klasse:
    - privater Integer "kursnummer"
    - privater statischer Instanzen-Zähler "zähler"
    - private statische Variable maxWert (maximale Anzahl der zulässigen Instanzen vom Typ Kurs)
        + im Setter darf maxWert nur gesetzt werden, wenn der Wert vorher noch nicht gesetzt ist.
    - privates statischen Array vom Typ Kurs.
    - öffentlicher Konstruktor 'Kurs(x)'
      Übergabewert: eine Kursnummer x
        Funktion: speichert x in kursnummer ab ...
                    FALLS diese Kursnummer nicht bereits bei zuvor instanziierten Objekten vergeben wurde.
                    SONST wird kursnummer=-1 gesetzt und es erscheint ein Warnhinweis.
				  Der Kurs wird im Array abgelegt
        Rückgabewert: Keiner.
    - öffentliche statische Methode 'ausgabe()'
        Übergabewerte: Keine
        Funktion: Gibt alle Kursnummern der instanziierten Objekte vom Typ Kurs auf der Konsole aus
                  (Falls Kursnummer==-1 erscheint eine Fehlermeldung)
        Rückgabewert: Keiner
- im Main eine for-Schleife gestartet wird (Anzahl der Durchläufe: maxWert)
  + pro Durchlauf wird ein neues Objekt vom Typ Kurs instanziiert (Übergabewert ist eine Zufallszahl zwischen 1 und maxWert)
- im Main abschließend zur Kontrolle die Funktion zeigeAlle() aufgerufen wird
*/


import java.util.Random;

public class aufgabe_3
{
    public static void main(String[] args)
    {
        Kurs.setMaxKursAnzahl(10);
        Random zuf = new Random();
        System.out.println("Folgende Kursnummern wurden ausgelost:");
        for (int i = 0; i < Kurs.getMaxKursAnzahl(); i++)
        {
            new Kurs(zuf.nextInt(11) + 1);
        }

        System.out.println();

        Kurs.ausgabe();
    }

}


class Kurs
{
    private static int zähler = 0;
    private static int maxKursAnzahl = 0;
    private static Kurs[] kursArray;
    private int kursnummer;

    public static void setMaxKursAnzahl(int max)
    {
        if (maxKursAnzahl == 0)
            maxKursAnzahl = max;
    }

    public static int getMaxKursAnzahl()
    {
        return maxKursAnzahl;
    }

    /**
     * Gibt alle Kurse im Array aus.
     */
    public static void ausgabe()
    {
        System.out.println("Folgende Kursnummern wurden vergeben:");
        for (int i = 0; i < zähler; i++)
        {
            if (kursArray[i].kursnummer != -1)
                System.out.println("Kurs " + (i + 1) + ": " + kursArray[i].kursnummer);
            else
                System.out.println("Kurs " + (i + 1) + ": Kursnummer konnte noch nicht vergeben werden");
        }
    }

    public Kurs(int kursnummer)
    {
        // Wenn das kursArray noch nicht erzeugt wurde und maxKursAnzahl einen Wert größer 0 hat,
        if (kursArray == null && maxKursAnzahl > 0)
            kursArray = new Kurs[maxKursAnzahl]; // dann müssen wir das Array erzeugen.

        else if (kursArray == null) // Sonst, wenn das Array noch nicht erzeugt wurde, dann wurde noch keine gültige maxKursAnzahl festgelegt.
        {
            System.out.println("Es wurde keine gültige Kurs Anzahl festgelegt!");
            return;
        }

        kursArray[zähler] = this; // Der aktuell erzeugte Kurs wird im Array gespeichert
        zähler++; // dann wird der Zähler um 1 erhöht.

        System.out.println("Aktuell übergebene Kursnummer: " + kursnummer);
        for (int i = 0; i < zähler - 1; i++) // Es wird geprüft, ob die Kursnummer bereits vergeben wurde
        {
            if (kursArray[i].kursnummer == kursnummer)
            {
                System.out.println(" (ACHTUNG: Wurde bereits vergeben!)");
                this.kursnummer = -1; // wenn ja, wird sie auf -1 festgelegt.
                break;
            }
        }

        // Wenn hier die Kursnummer nicht -1 ist, dann gab es sie noch nicht im Array und wir können die richtige Kursnummer abspeichern.
        if (this.kursnummer != -1)
            this.kursnummer = kursnummer;

        System.out.println();
    }
}





