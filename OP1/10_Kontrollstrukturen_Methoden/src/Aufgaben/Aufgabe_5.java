package Aufgaben;

/*
 * Erweitern Sie die Aufgabe 3 mit der Angabe einer Integer-Variable "jahr" um ein bestimmtes Jahr einzuführen.
 * Danach führen sie eine Kontrollmethode istSchaltjahr ein, die das Jahr kontrolliert, ob es ein Schaltjahr ist.
 * Wenn ja soll anstatt 28 im Februar 29 Tage ausgegeben werden.
 * Die neue Konsolenausgabe soll dann lauten: "Der "+monat+" hat im Jahr "+jahr"+" : "+tage+" Tage.
 */

import java.util.Scanner;

public class Aufgabe_5
{
    public static boolean schaltJahr(int jahr)
    {
        if (jahr%4 == 0 || jahr%400 == 0)
        {
            return true;
        }
        else if (jahr%100 == 0)
        {
            return false;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args)
    {
        String monat;
        int jahr;
        int tag=0;

        Scanner eingabe = new Scanner(System.in);

        System.out.println("Bitte geben Sie den Monat ein: ");
        monat = eingabe.nextLine();

        System.out.println("Bitte geben Sie ein Jahr ein: ");
        jahr = eingabe.nextInt();

        switch (monat)
        {
            case "Januar":
            case "März":
            case "April":
            case "Mai":
            case "Oktober":
                tag = 30; break;
            case "Juni":
            case "Juli":
            case "August":
            case "September":
            case "November":
            case "Dezember":
                tag = 31; break;
            case "Februar":
                if(schaltJahr(jahr))
                    tag = 29;
                else tag = 28; break;
            default:
                System.out.println("Bitte geben Sie Richtige Monat");
        }
        System.out.println("Der " + monat + " hat " + tag + " tage."  );
    }
}
