/*
 * Aufgabe 0
 * If-Anweisung und Funktionen
 * Sie bauen einen Roboter. In diesen ist eine Batterie eingebaut.
 * Erzeugen Sie eine Integer-Variable "batterieLaufzeit" mit dem Wert 5.
 * Anschließend implementieren Sie eine Methode "istBatterieLaufzeitNiedrig"
 * Diese Methode soll true zurückgeben, wenn die Laufzeit kleiner 2 ist, sonst false.
 *
 * Erstellen Sie eine String-Variable "aufgabe" und weisen Sie ihr "Ich reiche Butter." zu.
 * Implementieren Sie eine Methode "führeAufgabeAus", die auf dem Bildschirm die Variable "aufgabe" ausgibt,
 * wenn "istBatterieLaufzeitNiedrig" false liefert und dann die Batterie Laufzeit um 1 reduziert,
 * sonst soll "Ich muss aufgeladen werden" in der Konsole erscheinen.
 *
 * Lassen Sie in der Main den Roboter fünfmal die Aufgabe ausführen.
 */

package Aufgaben;

public class Aufgabe_01
{
     static int batterieLaufzeit = 5;

     public static boolean istBatterieLaufzeitNiedrig ()
     {
         if (batterieLaufzeit>2)
            return true;
         else
             return false;
     }
     public static void fuehreAusgabeAus (String aufgabe)
     {
         if (istBatterieLaufzeitNiedrig())
         {
             batterieLaufzeit--;
             System.out.println(aufgabe);
         }
         else
             System.out.println("Ich muss aufgeladen werden.");

     }

    public static void main(String[] args)
    {
        String aufgabe = "Ich reiche Butter";

        for (int i=0; i<5; i++)
        {
            fuehreAusgabeAus(aufgabe);
        }
    }
}

/*class Roboter {

    private int batterieLaufzeit = 5;
    private String aufgabe = "Ich reiche Butter.";

    public boolean IstBatterieLaufzeitNiedrig()
    {
        if (batterieLaufzeit < 2)
            return true;
        else
            return false;
    }

    public void FühreAufgabeAus()
    {
        if (!IstBatterieLaufzeitNiedrig())
        {
            System.out.println(aufgabe);
            batterieLaufzeit--;
        }
        else
            System.out.println("Ich muss aufgeladen werden");
    }
}*/
