package Aufgaben;
/*
 Schreiben Sie bitte ein Java-Programm, in dem ...
 - die Klasse 'Schachfeld' definiert wird,
   + die Klasse besitzt zwei private Methoden (linie() und reihe()) und eine public Methode (getZufallsfeld())
     - keine der Methoden hat Übergabewerte
     - linie() liefert als Rückgabewert einen Buchstaben zwischen A und H (als String)
     - reihe() liefert als Rückgabewert eine Ziffer zwischen 1 und 8 (als String)
     - getZufallsfeld() liefert als Rückgabewert die Konkatenation der Rückgabewerte aus linie() und reihe()
 - im Main ein Objekt "feld" vom Typ Schachfeld instanziiert wird
   + zur Kontrolle wird der Rückgabewert feld.getZufallsfeld() auf der Konsole ausgegeben
*/

import java.util.Calendar;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

class Schachfeld
{
    private char linie()
    {
        Random random = ThreadLocalRandom.current();
        int zahl = random.nextInt(8) + 65;
        return (char) zahl;
    }
    private int reihe()
    {
        Random random = ThreadLocalRandom.current();
        return random.nextInt(8) + 1;
    }

    private final String zufallsfeld = Character.toString(linie()) + Integer.toString(reihe());

    public String getZufallsfeld()
    {
        return zufallsfeld;
    }
}

public class aufgabe_4
{
    public static void main(String[] args)
    {
        Schachfeld feld = new Schachfeld();

        System.out.println(feld.getZufallsfeld());
    }

}
