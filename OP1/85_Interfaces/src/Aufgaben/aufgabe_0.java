package Aufgaben;

import java.util.ArrayList;

/* Aufgabe 0 (Basics)
 * Zwei Interfaces:
 * "IGitarrenspieler" mit der void Methode "gitarreSpielen"
 * "ISänger" mit der void Methode "singen"
 * Eine Klasse:
 * "Musiker", implementiert IGitarrenspieler und ISänger.
 * Die implementierten Methoden sollen etwas in der Konsole ausgeben.
 * Im Main einen Musiker erzeugen und die implementierten Methoden aufrufen.
 * Erstellen Sie ein UML Klassendiagramm.
 */
interface IGitarrenspieler
{
    void spielen();
}
interface ISänger
{
    void singen();
}
class Musiker implements ISänger, IGitarrenspieler
{
    String name;
    public static ArrayList<Musiker> musikers = new ArrayList<>();

    public Musiker(String name)
    {
        this.name = name;
        musikers.add(this);
    }

    @Override
    public void spielen()
    {
        System.out.println("Ich kann Guitar spielen");
    }

    @Override
    public void singen()
    {
        System.out.println("Ich kann singen");
    }
}
public class aufgabe_0
{
    public static void main(String[] args)
    {
        ISänger sänger = new Musiker("50Cent");
        IGitarrenspieler gitarrenspieler = new Musiker("Metallica");

        sänger.singen();
        gitarrenspieler.spielen();

        System.out.println();
        Musiker musiker = new Musiker("alle");

        musiker.singen();
        musiker.spielen();

        System.out.println();
        sänger = (ISänger) gitarrenspieler;

        ((ISänger) gitarrenspieler).singen();
        sänger.singen();


    }
}
