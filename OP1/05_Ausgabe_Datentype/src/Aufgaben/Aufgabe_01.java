package Aufgaben;

/*
 * Aufgabe 0
 * Schreiben Sie ein Java-Programm das kontrolliert, ob eine Zahl gerade oder ungerade ist und dann einen String ausgibt der sagt "Die Zahl ist ungerade" oder
 * "Die Zahl ist gerade".
 * Hinweis: Zur Vergleichsberechnung bietet sich der Modulo-Operator % an.
 */

import java.util.Scanner;

public class Aufgabe_01
{
   public static void main(String[] args)
   {
       int eingabe, kontrolwert;

       Scanner eingabewert = new Scanner(System.in);

       System.out.println("Bitte eine zahl eingeben: ");
       eingabe = eingabewert.nextInt();

       kontrolwert = eingabe % 2;

       if (kontrolwert == 0) System.out.println("Die Zahl ist Gerade"); //eingabe%2 kann man auch schreiben.

       else System.out.println("Die Zahl ist ungerade");

   }
}
