package Aufgaben;

import java.util.ArrayList;

/* Erstellen Sie folgende Interfaces:
 * "IFlugfähig" mit einer void Methode "fliegen()".
 * "IFahrbar" mit einer void Methode "fahren()".
 * "ISchwimmfähig" mit einer void Methode "schwimmen()".
 *
 * Erstellen Sie weiterhin vier Klassen:
 * - abstrakte Klasse "Fahrzeug" mit einer statischen Liste vom Typ "Fahrzeug" und einem parameterlosen Konstruktor, der das aktuelle Objekt der Liste hinzufügt.
 * - "Flugzeug", welche von "Fahrzeug" erbt und die Interfaces "IFlugfähig" und "IFahrbar" implementiert.
 * - "Auto", erbt von "Fahrzeug" und implementiert das Interface "IFahrbar".
 * - "Bagger", erbt von "Fahrzeug" und implementiert "IFahrbar" und "ISchwimmfähig".
 * - "Boot", erbt von "Fahrzeug" und implementiert "ISchwimmfähig".
 * Die implementierten Methoden sollen einen passenden Text auf der Konsole ausgeben.
 *
 * Erstellen Sie in der Main je ein Objekt der nicht-abstrakten Klassen. Über eine Schleife iterieren Sie durch die statische Liste in Fahrzeug, ermitteln, welches Interface die Objekte implementieren und rufen dann für jedes Objekt die verfügbaren Methoden auf.
 * Erstellen Sie ein UML Klassendiagramm.
 */
interface IFlugfähig
{
    void fliegen();
}
interface IFahrbar
{
    void fahren();
}
interface ISchwimmfähig
{
    void schwimmen();
}
abstract class Fahrzeug
{
    public static ArrayList<Fahrzeug> fahrzeugs = new ArrayList<>();

    public Fahrzeug()
    {
        fahrzeugs.add(this);
    }
}

class Flugzeug extends Fahrzeug implements IFlugfähig, IFahrbar
{
    @Override
    public void fliegen()
    {
        System.out.println("ich kan fliegen");
    }

    @Override
    public void fahren()
    {
        System.out.println("piloten können mich fahren");
    }
}

class Auto extends Fahrzeug implements IFahrbar
{
    @Override
    public void fahren()
    {
        System.out.println("Führerschein erforderlich");
    }
}

class Bagger extends Fahrzeug implements IFahrbar, ISchwimmfähig
{
    @Override
    public void fahren()
    {
        System.out.println("Ich kann sowohl auf dem land ");
    }

    @Override
    public void schwimmen()
    {
        System.out.println("als auch auf dem Wasser fahren");
    }
}

class Boot extends Fahrzeug implements ISchwimmfähig
{
    @Override
    public void schwimmen()
    {
        System.out.println("ich brauche 2m tiefer Wasser ");
    }
}

public class aufgabe_1
{
    public static void main(String[] args)
    {
        Flugzeug f1 = new Flugzeug();
        Flugzeug f2 = new Flugzeug();
        Auto a1 = new Auto();
        Auto a2 = new Auto();
        Bagger ba1 = new Bagger();
        Bagger ba2 = new Bagger();
        Boot b1 = new Boot();
        Boot b2 = new Boot();

        Fahrzeug f3 = new Auto();

        for (Fahrzeug f : Fahrzeug.fahrzeugs)
        {
            if (f.getClass().equals(Auto.class))
            {
                System.out.println("Auto:");
                ((Auto) f).fahren();
            }
            else if (f.getClass().equals(Flugzeug.class))
            {
                System.out.println("Flugzeug:");
                ((Flugzeug) f).fliegen();
                ((Flugzeug) f).fahren();
            }
            else if (f.getClass().equals(Bagger.class))
            {
                System.out.println("Bagger: ");
                ((Bagger) f).fahren();
                ((Bagger) f).schwimmen();
            }
            else if (f.getClass().equals(Boot.class))
            {
                System.out.println("Boot: ");
                ((Boot) f).schwimmen();
            }
            System.out.println();
        }
    }
}
