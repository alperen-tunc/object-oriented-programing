package Aufgaben;

/*
 * Schreiben Sie eine statische Funktion, die die Quersumme einer Zahl berechnet.
 * Übergabewert (Parameter): int zahl
 * Rückgabewert: Die berechnete Quersumme.
 * Hinweis: Zur Berechnung bietet sich der Modulo-Operator % an.
 */


import java.util.Scanner;

public class Aufgabe_02
{
    static int quersumme(int a)
    {
        int summe = 0;
        int b;

        do
        {
            b = a % 10;
            a = a / 10;
            summe = summe + b;
        }while (a > 0);

        return summe;
    }

    public static void main(String[] args)
    {
        int zahl;

        Scanner eingabewert = new Scanner(System.in);

        System.out.println("Bitte geben Sie ein Zahl ein: ");
        zahl = eingabewert.nextInt();

        System.out.println(quersumme(zahl));
    }
}
