package Aufgaben;

import java.util.ArrayList;

/* Schreiben Sie ein Programm, das
* - die Klassen Computer, Desktop, Notebook und Server einführt.
* - Jeder Computer hat einen Zustand (Ein/Aus)
* - Einen Hersteller, der nur ein mal über den Konstruktor gesetzt werden darf
* - Eine Statische Liste, die die aktuelle Instanz speichert
* (die Klasse Computer besitzt eine Liste vom Typ Computer, in die im Konstruktor das Objekt hinzugefügt wird)
* - Und eine Methode zum Ein- und Ausschalten (Eine Methode, die beides erledigt)
* (Diese Methode gibt den Typ des Computers und den neuen Zustand aus, siehe Screenshot)
* (Versuchen Sie diese Ausgabe abhängig vom Zustand in nur einer Zeile zu implementieren)
* - Überlegen Sie sich eine geeignete Vererbungsstruktur, von der Basisklasse soll kein Objekt erzeugt werden können
* - Verwenden Sie in den Subklassen die Konstruktor-Verkettung zur Initialisierung des Herstellers in der Basisklasse
* - Geben Sie im Main für jeden Computer in der Liste den Hersteller aus und rufen Sie die Methode zum Ein- und Ausschalten auf*
* Beachten Sie, dass der Zustand nur über die Methode zum Ein- und Ausschalten geändert werden darf!
*
* Erweitern Sie anschließend das Programm durch die Klasse Büro
* - Jedes Büro hat eine Nummer, die nur ein mal durch den Konstruktor gesetzt werden darf
* - eine Liste mit den sich im Büro befindenden Computern
* - und eine Statische Liste mit allen Büros
* - Erweitern Sie die Main so, dass nun anstatt der Computerliste die Büroliste durchlaufen wird
* (erzeugen Sie dazu zwei Büros mit je zwei Computern)
* - und rufen Sie für jedes Büro die Nummer und für jeden Computer in jedem Büro den Hersteller und die Methode zum Ein- und Ausschalten auf
*/
class Computer
{
    private final String hersteller;
    public static ArrayList<Computer> computers = new ArrayList<>();
    private boolean istEingeschaltet;

    public String getHersteller()
    {
        return hersteller;
    }

    public ArrayList<Computer> getComputers()
    {
        return computers;
    }

    public void zustand()
    {
        if (istEingeschaltet)
        {
            System.out.println(hersteller + ": Computer Wurde eingeschaltet.");
        }
        else
        {
            System.out.println(hersteller + ": Computer wurde ausgeschaltet.");
        }
    }

    public Computer(String hersteller)
    {
        this.hersteller = hersteller;
        istEingeschaltet = false;
        computers.add(this);
    }

    public void einUndAus()
    {
        istEingeschaltet = !istEingeschaltet;
    }
}
class Desktop extends Computer
{
    public Desktop(String hersteller)
    {
        super(hersteller);
    }

}
class Notebook extends Computer
{
    public Notebook(String hersteller)
    {
        super(hersteller);
    }

}
class Server extends Computer
{
    public Server(String hersteller)
    {
        super(hersteller);
    }

}

class Büro
{
    private ArrayList<Computer> computerInBüro = new ArrayList<>();
    private final int id;
    public static ArrayList<Büro> büros = new ArrayList<>();

    public int getId()
    {
        return id;
    }

    public ArrayList<Computer> getComputerInBüro()
    {
        return computerInBüro;
    }

    public void addComputerInBüro(Computer computer)
    {
        computerInBüro.add(computer);
    }

    public Büro(int id)
    {
        this.id = id;
        büros.add(this);
    }
}
public class aufgabe_5
{
    public static void main(String[] args)
    {
        Computer c1 = new Computer("Apple");
        Server s1 = new Server("IBM");
        Notebook n1 = new Notebook("Dell");
        Desktop d1 = new Desktop("Acer");

        Büro b1 = new Büro(101);
        b1.addComputerInBüro(s1);
        b1.addComputerInBüro(d1);

        Büro b2 = new Büro(102);
        b2.addComputerInBüro(c1);
        b2.addComputerInBüro(n1);

        for (Computer c : Computer.computers)
        {
            c.einUndAus();
            c.zustand();
            c.einUndAus();
            c.zustand();
        }

        System.out.println();
        for (Büro b : Büro.büros)
        {
            System.out.println("Büro: " + b.getId());
            for (Computer c : b.getComputerInBüro())
            {
                c.einUndAus();
                c.zustand();
                c.einUndAus();
                c.zustand();
            }
            System.out.println();
        }

    }
}
