package Aufgaben;

import java.util.ArrayList;

/* Aufgabe 0 (Basics)
 * Erstellen Sie die abstrakte Klasse "Künstler" mit einer abstrakten Methode "kunstErstellen()".
 * Erstellen Sie zwei weitere Klassen "Maler" und "Sänger", die beide von "Künstler" erben.
 * Die beiden Subklassen überschreiben die Methode der Basisklasse.
 * Dabei gibt der Maler auf der Konsole "Ich male ein Bild" und der Sänger "Ich singe einen Song" aus.
 * Im main() erzeugen Sie je ein Objekt von Maler und Sänger.
 * Rufen Sie in der main()-Methode für beide Objekte die Methode kunstErstellen() auf.
 *
 * Zeichnen Sie ein Klassendiagramm.
 */
abstract class Künstler
{
    abstract void kunstErstellen();
    public static ArrayList<Künstler> künstlers = new ArrayList<>();
    public Künstler()
    {
        künstlers.add(this);
    }
}
class Maler extends Künstler
{
    public void kunstErstellen()
    {
        System.out.println("Ich male ein Bild");
    }
}
class Sänger extends Künstler
{
    public void kunstErstellen()
    {
        System.out.println("Ich singe einen Song");
    }
}
public class aufgabe_0
{
    public static void main(String[] args)
    {
        Maler m1 = new Maler();
        Sänger s1 = new Sänger();

        for (Künstler k : Künstler.künstlers)
        {
            k.kunstErstellen();
        }
    }
}
