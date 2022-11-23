package Aufgaben;

import java.util.ArrayList;

/*
    Führen Sie bitte zunächst eine abstrakte Klasse 'GeräuscheMacher' ein.
    Diese besitzt nur eine abstrakte Methode 'macheGeräusch' (keine Über-, oder Rückgabewerte).
    Implementieren Sie bitte zusätzlich die Klassen Auto, Hund und Mensch, die von GeräuscheMacher erben.
        Keine dieser Klassen enthält weitere Member.
        Konsolenausgabe von macheGeräusch in Auto:   "Brummmmmm ..."
        Konsolenausgabe von macheGeräusch in Hund:   "Wau Wau Kläff Grrrrr ..."
        Konsolenausgabe von macheGeräusch in Mensch: "Java lernen ist toll!"

    Führen Sie eine Liste vom Typ GeräuscheMacher der main()-Methode hinzu.
    Erstellen Sie von allen drei Subklassen ein Objekt und fügen diese der Liste hinzu.
    Rufen Sie bitte mittels einer foreach-Schleife, für alle Elemente der Liste, die Methode macheGeräusch auf.
*/
abstract class GeräuscheMacher
{
    public static ArrayList<GeräuscheMacher> elemente = new ArrayList<>();
    abstract void macheGeräusch();

    public GeräuscheMacher()
    {
        elemente.add(this);
    }
}

class Auto extends GeräuscheMacher
{
    @Override
    void macheGeräusch()
    {
        System.out.println("Brummmmmm....");
    }
}

class Hund extends GeräuscheMacher
{
    @Override
    void macheGeräusch()
    {
        System.out.println("Wau Wau Kläff Grrrrr ...");
    }
}

class Mensch extends GeräuscheMacher
{
    @Override
    void macheGeräusch()
    {
        System.out.println("Ich lerne langsam Java");
    }
}
public class aufgabe_2
{
    public static void main(String[] args)
    {
        Auto a = new Auto();
        Mensch m = new Mensch();
        Hund h = new Hund();

        for (GeräuscheMacher g : GeräuscheMacher.elemente)
        {
            if (g.getClass().equals(a.getClass()))
            {
                System.out.println("Ich bin ein Auto");
                g.macheGeräusch();
            }
            if (g.getClass().equals(Mensch.class))
            {
                System.out.println("Ich bin ein Mensch");
                g.macheGeräusch();
            }
            if (g.getClass().equals(Hund.class))
            {
                System.out.println("Ich bin ein Hund");
                g.macheGeräusch();
            }
            System.out.println();
        }
    }
}
