package Aufgaben;

import java.util.ArrayList;

/*
Führen Sie bitte die beiden folgenden 2 Klassen ein:

    Klasse Gebäude
        Member
            private String adresse
            private statische Liste vom Typ Gebäude
            öffentliche statische Methode
                Name: ZeigeGebäudeListe
                Übergabewerte: keine
                Funktion: Ausgabe der Überschrift "Liste aller Gebäude:"
                          Ausgabe der Adressen aller Gebäude
                Rückgabewert: keiner
            2 Konstruktoren
                a) Übergabewert: keiner
                   Funktion: Trägt die neue Instanz in die Liste aller Gebäude ein
                b) Übergabewert: 1 String s
                   Funktion: Trägt die neue Instanz in die Liste aller Gebäude ein
                             Initialisiert die Adresse mit s

    Klasse Villa (erbt von Gebäude)
        Member
            private Integer preis
            private statische Liste vom Typ Villa
            öffentliche statische Methode
                Name: ZeigeVillaListe
                Übergabewerte: keine
                Funktion: Ausgabe der Überschrift "Liste aller Villen:"
                          Ausgabe der Adressen und Preise aller Villen
                Rückgabewert: keiner
            3 Konstruktoren
                a) Übergabewert: keiner
                   Funktion: Trägt die neue Instanz in die Liste aller Villen ein
                b) Übergabewert: 1 String s
                   Funktion: Trägt die neue Instanz in die Liste aller Villen ein
                             Initialisiert die Adresse mit s
                c) Übergabewert: 1 String s und ein Integer p
                   Funktion: Trägt die neue Instanz in die Liste aller Villen ein
                             Initialisiert die Adresse mit s
                             Initialisiert den Preis mit p

Im Main
- Instanziierung und Initialisierung von 2 Gebäuden und 3 Villen
  (alle 5 Konstruktoren sollen verwendet werden)
- Aufruf der beiden Methoden
*/
class Gebäude
{
    private String adresse;

    public void setAdresse(String adresse)
    {
        this.adresse = adresse;
    }

    public String getAdresse()
    {
        return adresse;
    }

    public static ArrayList<Gebäude> gebäudes = new ArrayList<>();
    public static void ZeigeGebäudeListe()
    {
        System.out.println("Liste aller Gebäude:");
        for (Gebäude g : gebäudes)
        {
            System.out.println(g.getAdresse());
        }
    }

    public Gebäude(String adresse)
    {
        this.adresse = adresse;
        gebäudes.add(this);
    }

    public Gebäude()
    {
        gebäudes.add(this);
    }
}

class Villa extends Gebäude
{
    private int preis;
    private static ArrayList<Villa> villas = new ArrayList<>();

    public int getPreis()
    {
        return preis;
    }

    public void setPreis(int preis)
    {
        this.preis = preis;
    }

    public static void ZeigeVillaListe()
    {
        System.out.println("Liste aller Villen:");
        for (Villa v: Villa.villas)
        {
            System.out.println("Preis: " + v.getPreis() + "\nAdresse: " + v.getAdresse());
        }
    }

    public Villa(int preis)
    {
        this.preis = preis;
        villas.add(this);
    }

    public Villa(String adresse, int preis)
    {
        super(adresse);
        this.preis = preis;
        villas.add(this);
    }
    public Villa()
    {
        super();
        villas.add(this);
    }
    public Villa(String adresse)
    {
        super(adresse);
        villas.add(this);
    }
}

public class aufgabe_8
{
    public static void main(String[] args)
    {
        Villa v1 = new Villa();
        Villa v2 = new Villa("Heubruch 36");
        Villa v3 = new Villa("Heubruch 37",400000 );
        Gebäude g1 = new Gebäude();
        Gebäude g2 = new Gebäude("Heubruch 34");

        Villa.ZeigeVillaListe();
        System.out.println();
        Gebäude.ZeigeGebäudeListe();

    }
}
