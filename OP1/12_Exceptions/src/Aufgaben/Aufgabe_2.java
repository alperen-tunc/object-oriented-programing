package Aufgaben;

/*
Aufgabe_2

Schreiben Sie eine statische Funktion, die die Quersumme einer Zahl berechnet.
Übergabewert (Parameter): int zahl
Rückgabewert: die berechnete Quersumme.
Ist die übergebene Zahl negativ, soll eine IllegalArgumentException ausgelöst werden.
Im Main rufen Sie die Methode innerhalb einer passenden Try-Catch-Anweisung auf.
Der Catch-Teil soll dabei eine passende Fehlermeldung ausgeben.
Hinweis: Zur Berechnung bietet sich der Modulo-Operator % an.
 */

import java.util.Scanner;

public class Aufgabe_2
{
    static int quersumme (int a)
    {
        if (a < 0)
        {
            throw new IllegalArgumentException("Zahl darf nicht kleiner als 0 sein.");
        }

        if (a == 0)
        {
            return 0;
        }

        return a % 10 + quersumme(a / 10);
    }
    public static void main(String[] args)
    {
        int zahl, try1;


        Scanner eingabewert = new Scanner(System.in);
        System.out.println("Bitte Geben Sie eine Zahl ein: ");
        zahl = eingabewert.nextInt();

        try
        {
            try1 = quersumme(zahl);
            System.out.println(try1);
        }
        catch (IllegalArgumentException ex)
        {
            System.out.println("Fehler! " + ex.getMessage());
        }


    }
}
