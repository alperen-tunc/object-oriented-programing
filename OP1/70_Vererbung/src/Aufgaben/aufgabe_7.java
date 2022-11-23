package Aufgaben;

import java.util.ArrayList;

/*
Führen Sie bitte die beiden folgenden Klassen ein:
Klasse Stadt
    Attribute: einwohnerzahl, name (alle private)
    Methoden: Get und Set für einwohnerzahl, Get für Name, istGroßstadt[String](Rückgabe: "Stimmt!", FALLS einwohnerzahl >= 100000, SONST "Nein!")
    Konstruktor:
        Übergabewerte: int e, String n
        Funktion:      setzt:
                       - einwohnerzahl=e
                       - name=n

Klasse Landeshauptstadt (SUBKLASSE von Stadt!)
    Attribute: adresse (des Landtages)
    Getter und Setter für adresse
    Konstruktor:
        Übergabewerte: String a UND die Attribute des Basis-Klassen-Konstruktors
        Funktion:      setzt adresse=a UND übergibt die entsprechenden Attribute an den Basis-Klassen-Konstruktor

Testen Sie bitte die obigen Definitionen an folgendem Programm im Main:
- Instanziierung der Städte Dinslaken(70000) und Wuppertal(350000)
- Instanziierung der Landeshauptstadt Düsseldorf(620000 / Platz des Landtags 1, 40221 Düsseldorf)
- Für alle drei Städte: Ausgabe von Name und Eigenschaft(Großstadt "Stimmt!" oder "Nein!")
- Für die Landeshauptstadt: Ausgabe der Adresse (des Landtages)
*/
class Stadt
{
    public static ArrayList<Stadt> stadts = new ArrayList<>();
    private int einwohnerzahl;
    private String name;

    public boolean istGroßstadt()
    {
        if (einwohnerzahl>=100000)
            return true;
        return false;
    }

    public String getName()
    {
        return name;
    }

    public int getEinwohnerzahl()
    {
        return einwohnerzahl;
    }

    public void setEinwohnerzahl(int einwohnerzahl)
    {
        this.einwohnerzahl = einwohnerzahl;
    }

    public Stadt(int einwohnerzahl, String name)
    {
        this.einwohnerzahl = einwohnerzahl;
        this.name = name;
        stadts.add(this);
    }
}

class Landeshauptstadt extends Stadt
{
    private String adresse;

    public String getAdresse()
    {
        return adresse;
    }

    public void setAdresse(String adresse)
    {
        this.adresse = adresse;
    }

    public Landeshauptstadt(int einwohnerzahl, String name, String adresse)
    {
        super(einwohnerzahl, name);
        this.adresse = adresse;
    }
}
public class aufgabe_7
{
    public static void main(String[] args)
    {
        new Stadt(70000, "Dinslaken");
        new Stadt(350000, "Wuppertal");
        new Landeshauptstadt(620000, "Düsseldorf", "620000 / Platz des Landtags 1, 40221 Düsseldorf");

        for (Stadt s : Stadt.stadts)
        {
            if (s.istGroßstadt())
            {
                System.out.println(s.getName() + " ist eine große Stadt");
            }
            else
            {
                System.out.println(s.getName() + " ist eine kleine Stadt.");
            }
            if (s.getClass().equals(Landeshauptstadt.class))
            {
                System.out.println(((Landeshauptstadt) s).getAdresse());
            }
        }


    }
}
