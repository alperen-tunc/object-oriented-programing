package Aufgaben;

/*
 * Schreiben Sie ein Programm das Ihnen zu jedem Monat im Jahr, den Sie mit der String-Variable "monat" einführen, die Tage des Monats ausgibt.
 * Nutzen Sie für die Monats-Auswahl ein Switch-Case. Bei falscher Monatsangabe soll eine Fehlermeldung auf der Konsole erscheinen.
 * Für den Monat Februar sind 28 Tage anzugeben.
 * Ausgabe auf der Konsole soll wie folgt lauten: "Der "+monat+" hat "+tage+" Tage."
 */

import java.util.Scanner;

public class Aufgabe_4
{
    public static void main(String[] args)
    {
        String monat;

        Scanner eingabe = new Scanner(System.in);
        System.out.println("Bitte geben Sie den Monat ein, welsche Sie die Tageszahl erfahren möchten: ");

        monat = eingabe.nextLine();

        switch (monat)
        {
            case "Januar":
            case "März":
            case "April":
            case "Mai":
            case "Oktober":
                System.out.println("Der " + monat + " hat 30 tage" ); break;
            case "Juni":
            case "Juli":
            case "August":
            case "September":
            case "November":
            case "Dezember":
                System.out.println("Der " + monat + " hat 31 tage"); break;
            case "Februar":
                System.out.println("Der " + monat + " hat 28 tage" ); break;
        }

    }
}
