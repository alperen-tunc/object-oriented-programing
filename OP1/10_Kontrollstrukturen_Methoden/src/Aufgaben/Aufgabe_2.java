/*
 * Führen Sie 3 Integer-Variablen ein: auswahl, zahl1 und zahl2.
 * Über auswahl soll in einem Switch-Case eine Wahl getroffen werden, welche der 4 Grundrechenarten als Methode aufgerufen wird.
 * Sollte eine falsche Auswahl getroffen werden soll eine Ausgabe auf der Konsole erscheinen die anzeigt, welche Auswahl getroffen
 * wurde und das diese nicht korrekt oder verfügbar ist.
 * Schreiben Sie für jede Rechenart eine separate Methode und übergeben Sie an sie die für die Berechnung notwendigen Parameter
 * zahl1 und zahl2.
 * In der Methode soll dann die Berechnung durchgeführt und das Ergebnis an die main zurückgegeben werden.
 * Die Ausgabe des Ergebnisses soll dann auf der Konsole erscheinen.
 *
 * Beachten: Geben Sie eine Fehlermeldung auf der Konsole aus, wenn durch 0 dividiert wird.
 */
package Aufgaben;

import java.util.Scanner;

public class Aufgabe_2 {

    public static int berechnung(int a, int x, int y)
    {
        return switch (a) {
            case 1 -> x + y;
            case 2 -> x - y;
            case 3 -> x * y;
            case 4 -> x / y;
            default -> 0;
        };
    }

    static int addition(int b, int c)
    {
        return b + c;
    }

    static int subtraktion(int b, int c)
    {
        return b - c;
    }

    static int multiplikation(int b, int c)
    {
        return b * c;
    }

    static double division(double b, double c)
    {
        return b / c;
    }

    public static void main(String[] args) {
        int auswahl, zahl1, zahl2;

        Scanner eingabeWert = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine Zahl \n 1 für addition,\n 2 für subtraktion,\n 3 für Multiplikation,\n 4 für Division \n ein: ");
        auswahl = eingabeWert.nextInt();

        System.out.println("Enter first int: ");
        zahl1 = eingabeWert.nextInt();

        System.out.println("Enter second int: ");
        zahl2 = eingabeWert.nextInt();

        switch (auswahl)
        {
            case 1:
                System.out.println(addition(zahl1, zahl2)); break;
            case 2:
                System.out.println(subtraktion(zahl1, zahl2)); break;
            case 3:
                System.out.println(multiplikation(zahl1, zahl2)); break;
            case 4:
                if (zahl2 == 0) System.out.println("durch 0 Teilen ist nicht erlaubt");
                else
                    System.out.println(division(zahl1, zahl2)); break;
            default:
                System.out.println("Bitte geben Sie richtige Zahl ein.");
        }

        //System.out.println(berechnung(auswahl, zahl1, zahl2));

    }
}
