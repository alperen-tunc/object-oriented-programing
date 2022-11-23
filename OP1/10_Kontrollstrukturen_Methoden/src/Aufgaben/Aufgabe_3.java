package Aufgaben;

/*
 * Schreiben Sie ein Programm das Ihnen ausgibt ob das über die Integer-Variable jahr eingeführte Jahr ein Schaltjahr ist.
 * Durch 4 ohne Rest teilbare Jahre sind normalerweise Schaltjahre.
 * Durch 100 ohne Rest teilbare Jahre sind keine Schaltjahre
 * Durch 400 ohne Rest teilbare Jahre sind doch Schaltjahre
 * Nutzen Sie zu Umsetzung die Boolesche Variable schaltjahr und lassen Sie sich das Jahr sowie ob es ein Schaltjahr ist oder nicht
 * auf der Konsole ausgeben.
 */

import java.util.Scanner;

public class Aufgabe_3
{
    public static void main(String[] args)
    {
        int jahr;
        boolean schalt;

        Scanner eingabe = new Scanner(System.in);
        System.out.println("Geben Sie bitte ein jahr ein: ");

        jahr = eingabe.nextInt();

        if (jahr%4 == 0 || jahr%400 == 0)
        {
            schalt = true;
        }
        else if (jahr%100 == 0)
        {
            schalt = false;
        }
        else
        {
            schalt = false;
        }

        if (schalt)
        {
            System.out.println("Es ist ein Schaltjahr");
        }
        else
        {
            System.out.println("Es ist kein Schaltjahr.");
        }
    }
}
