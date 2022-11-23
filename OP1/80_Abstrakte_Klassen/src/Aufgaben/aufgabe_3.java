package Aufgaben;

import java.util.ArrayList;
import java.util.Scanner;

/* Sie betreiben einen Imbiss und möchten eine Verwaltungssoftware für die verkauften Waren erstellen.
 * Die Verkaufsware unterteilt sich in Essen und Getränke. Alle Waren werden in der Basisklasse, von der kein Objekt erstellt werden darf, in einer Liste gespeichert.
 * Für alle Waren erfassen Sie die Bezeichnung und den Preis. Essen besteht zudem aus einer Auflistung der Zutaten, zu Getränken speichern Sie die Füllmenge in Milliliter.
 * Alle benötigten Daten werden über Konstruktoren erfasst.
 * Um alle Waren bequem ausgeben zu können, überschreiben Sie die toString-Methode der Klassen. Dabei vermeiden Sie doppelten Code und beachten die Abkapselung und Trennung von Darstellung und Programmlogik.
 * Zum Testen erstellen Sie ein Getränk, ein Essen und geben alle Informationen auf dem Bildschirm aus.
 *
 * Erstellen Sie dazu ein UML Klassendiagramm.
 */
abstract class  Verkaufsware
{
    private String bezeichnung;
    private double preis;

    public double getPreis()
    {
        return preis;
    }

    public void setPreis(double preis)
    {
        this.preis = preis;
    }

    public static ArrayList<Verkaufsware> ware = new ArrayList<>();

    public String getBezeichnung()
    {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung)
    {
        this.bezeichnung = bezeichnung;
    }

    public Verkaufsware(String bezeichnung, double preis)
    {
        this.bezeichnung = bezeichnung;
        this.preis = preis;
        ware.add(this);
    }

    @Override
    public String toString()
    {
        return "Verkaufsware{" +
                "bezeichnung='" + bezeichnung + '\'' +
                ", preis=" + preis +
                '}';
    }
}
class Essen extends Verkaufsware
{
    private String zutaten;

    public void setZutaten(String zutaten)
    {
        this.zutaten = zutaten;
    }

    public Essen(String bezeichnung, double preis, String zutaten)
    {
        super(bezeichnung, preis);
        this.zutaten = zutaten;
    }

    public String toString()
    {

        return super.toString() + " Zutaten: " + zutaten;
    }
}

class Getränke extends Verkaufsware
{
    private int füllmenge;

    public void setFüllmenge(int füllmenge)
    {
        this.füllmenge = füllmenge;
    }

    public Getränke(String bezeichnung, double preis, int füllmenge)
    {
        super(bezeichnung, preis);
        this.füllmenge = füllmenge;
    }

    public String toString()
    {

        return super.toString() + " Füllmenge: " + füllmenge;
    }
}

public class aufgabe_3
{
    public static void main(String[] args)
    {
        Essen e1 = new Essen("Hamburger", 7.8, "hackFleisch, Salzt, Onion, Käse");
        Getränke g1 = new Getränke("Kola", 3.2, 330);

        for (Verkaufsware v : Verkaufsware.ware)
        {
            System.out.println(v.toString());
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben Sie einen Neuen Preis");
        e1.setPreis(Double.parseDouble(scanner.nextLine()));

        System.out.println(e1.toString());

    }
}
