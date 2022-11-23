package Aufgaben;
import java.util.ArrayList;
/*
    Erstellen Sie bitte zunächst die beiden folgenden Klassen 'Ritter' und 'Pferd' (Assoziation 1:1)

        Member
            Die Klasse Ritter besitzt die Attribute 'name', 'pferd' und eine statische Liste vom Typ Ritter
            Die Klasse Pferd besitzt die Attribute 'name', 'besitzer' und eine statische Liste vom Typ Pferd

            Die Klasse Ritter hat zwei Konstruktoren:
                a) Übergabewerte: Keine
                   Funktion: - Instanziiert ein neues Objekt p vom Typ Pferd
                             - Initialisiert Besitzer in p mit 'this' (also jenem Ritter, der gerade instanziiert wird)
                             - Initialisiert SeinPferd mit p
                             - this und p werden zu den entsprechenden Listen hinzugefügt
                b) Übergabewerte: 2 Strings (Name des Ritters und Name des Pferdes)
                   Funktion: - die gleichen Funktionen wie in a)
                             - Initialisierung des Ritter- und Pferde-Namens

            Die Klasse Pferd besitzt nur einen Standard-Konstruktor

        Im Main
            - Instanziieren Sie bitte zunächst einen Ritter (und sein Pferd) mithilfe des Parameter-LOSEN Konstruktors aus Ritter
              Initialisieren Sie bitte anschließend die Namen mit "Graf von Holzhausen" und "Lucy"
            - Instanziieren Sie daraufhin bitte einen weiteren Ritter (und sein Pferd) mithilfe des anderen Konstruktors
              Verwenden Sie als Übergabewerte bitte die Strings "Prinz von Doppelkeks" und "Schoko"
            - Geben Sie bitte anschließend alle Elemente der Ritterliste (und das jeweils zugehörigen Pferd) aus
            - Geben Sie zum Schluss auch alle Elemente der Pferdeliste (und den jeweils zugehörigen Besitzer) aus
*/
class Ritter
{
    private String name;
    private Pferd pferd;
    public static ArrayList<Ritter> ritters = new ArrayList<>();

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Pferd getPferd()
    {
        return pferd;
    }

    public void setPferd(Pferd pferd)
    {
        this.pferd = pferd;
    }

    public static ArrayList<Ritter> getRitters()
    {
        return ritters;
    }

    public static void setRitters(ArrayList<Ritter> ritters)
    {
        Ritter.ritters = ritters;
    }

    public Ritter()
    {
        Pferd p = new Pferd();
        p.setBesitzer(this);
        this.pferd = p;
        Pferd.pferds.add(pferd);
        ritters.add(this);
    }

    public Ritter(String name, String namePferd)
    {
        this();
        this.name = name;
        pferd.setName(namePferd);
    }
}

class Pferd
{
    private String name;
    private Ritter besitzer;
    public static final ArrayList<Pferd> pferds = new ArrayList<>();

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Ritter getBesitzer()
    {
        return besitzer;
    }

    public void setBesitzer(Ritter besitzer)
    {
        this.besitzer = besitzer;
    }

    public static ArrayList<Pferd> getPferds()
    {
        return pferds;
    }

}

public class aufgabe_4
{
    public static void main(String[] args)
    {
        Ritter r1 = new Ritter();
        Ritter r2 = new Ritter("Graf von Holzhausen", "Lucy");
        Ritter r3 = new Ritter("Prinz von Doppelkeks", "Schoko");

        r1.setName("Alperen");
        r1.getPferd().setName("Black");

        for (Ritter r : Ritter.ritters)
        {
            System.out.println("Name von Ritter: " + r.getName() + " Name von Pferd: " + r.getPferd().getName());
        }
        System.out.println();

        for (Pferd p: Pferd.pferds)
        {
            System.out.println(p.getName() + " " + p.getBesitzer().getName());
        }
    }
}
