package Aufgaben;
/*
 * Erstellen Sie eine Klasse 'Fahrzeug' zur Verwaltung Ihres Fuhrparks.
 * Ein Fahrzeug wird gespeichert mit den Attributen 'kennzeichen', 'lackierung', 'marke' und 'fahrzeugTyp'. Mögliche Fahrzeug-Typen sind 'MOTORRAD', 'PKW' und 'LKW'. Diese werden als Enum erstellt.
 * Alle Fahrzeuge werden in einer statischen Liste gespeichert. Ein Konstruktor initialisiert alle Attribute und fügt das gerade erstellte Fahrzeug-Objekt der Liste hinzu.
 * In der Main erstellen Sie drei Fahrzeuge, für jeden Typ eins, und geben alle Attribute in einer Schleife aus.
 */

import java.util.ArrayList;
import java.util.Objects;

class Fahrzeug
{
    private String kennzeichen;
    private String lackierung;
    private String marke;
    private Fahrzeug_Typen fahrzeugTyp;

    public static ArrayList<Fahrzeug> fahrzeugList = new ArrayList<>();

    public String getKennzeichen()
    {
        return kennzeichen;
    }

    public String getLackierung()
    {
        return lackierung;
    }

    public String getMarke()
    {
        return marke;
    }

    public Fahrzeug_Typen getFahrzeugTyp()
    {
        return fahrzeugTyp;
    }

    public static ArrayList<Fahrzeug> getFahrzeugList()
    {
        return fahrzeugList;
    }

    public Fahrzeug(String kennzeichen, String marke, String lackierung, Fahrzeug_Typen fahrzeugTyp)
    {
        this.fahrzeugTyp = fahrzeugTyp;
        this.kennzeichen = kennzeichen;
        this.marke = marke;
        this.lackierung = lackierung;

        fahrzeugList.add(this);

    }

    public void ausgabe()
    {
        for (Fahrzeug f : fahrzeugList)
        {
            System.out.println(f.getMarke() + f.getLackierung() + f.getFahrzeugTyp() +  f.getKennzeichen());
        }

        /*
        System.out.println(getFahrzeugTyp());
        System.out.println(getLackierung());
        System.out.println(getKennzeichen());
        System.out.println(getMarke());

         */
    }
}

enum Fahrzeug_Typen
{
    MOTORRAD,
    PKW,
    LKW;
}

public class aufgabe_2
{
    public static void main(String[] args)
    {
        Fahrzeug fahrzeug = new Fahrzeug("w abc 123", "mazda", "grau", Fahrzeug_Typen.LKW);



        Fahrzeug fahrzeug1 = new Fahrzeug("w asd 123", "BMW", "Blau", Fahrzeug_Typen.PKW);

        fahrzeug1.ausgabe();

    }
}
