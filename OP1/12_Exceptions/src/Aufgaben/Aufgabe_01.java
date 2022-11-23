package Aufgaben;

/*
Aufgabe_1

Schreiben Sie eine statische Funktion, die die Quersumme einer Zahl berechnet.
Übergabewert (Parameter): int zahl
Rückgabewert: die berechnete Quersumme.
Ist die übergebene Zahl negativ, soll eine IllegalArgumentException ausgelöst werden.
Im Main rufen Sie die Methode innerhalb einer passenden Try-Catch-Anweisung auf.
Der Catch-Teil soll dabei eine passende Fehlermeldung ausgeben.
Hinweis: Zur Berechnung bietet sich der Modulo-Operator % an.
 */

import java.awt.*;
import java.util.Scanner;

public class Aufgabe_01 {
    static int quersummme (int zahl)
    {
        int summe = 0;

        if(zahl < 0)
        {
           throw new IllegalArgumentException("Zahl darf nicht kleiner als Null sein. ");
        }
        else
        {
            while(zahl > 0)
            {
                summe += zahl % 10;
                zahl /= 10;
            }

            return summe;
        }
    }
    public static void main(String[] args)
    {
        int zahl;
        int return1 = 0;

        try
        {
            Scanner eingabe = new Scanner(System.in);
            System.out.println("Bitte geben Sie ein zahl ein: ");
            zahl = eingabe.nextInt();
            return1 = quersummme(zahl);
        }
        catch (IllegalArgumentException ex)
        {
            System.out.println(ex.getMessage());
        }

        System.out.println(return1);

    }
}
