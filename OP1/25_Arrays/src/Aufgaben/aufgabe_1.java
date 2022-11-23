package Aufgaben;
/*
 * Aufgabe 1
Schreiben Sie bitte ein Java-Programm, das
a) in einer Endlosschleife den User zu Beginn jeden Durchlaufs fragt, ob er eine  ...
	(1) Übersetzung, oder
	(2) Monatsnummer wünscht
	(3) Programm Beenden

b) bei Eingabe von (1) einen deutschen Monatsnamen abfragt und die englische Übersetzung ausgibt
c) bei Eingabe von (2) einen deutschen Monatsnamen abfragt und die Monatsnummer ausgibt (Januar=1, ...)
d) bei Fehleingaben (Auswahl ungleich 1 und 2 / nicht-existenter deutscher Monatsname) eine entsprechende Fehlermeldung ausgibt

Bemerkung:
Versuchen Sie die Aufgabe bitte zunächst durch zwei 1-dimensionale String-Arrays zu lösen.
*/

import java.util.Scanner;

public class aufgabe_1
{
    static String[] monate = {"Januar", "Februar", "März", "April", "Mai", "Juni", "Juli", "August", "September", "Oktober", "November", "Dezember"};
    static String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    static int eingabe() throws Exception
    {
        int auswahl;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie Bitte für Übersetzung (1), für Monatszahl (2) ein: ");
        auswahl = Integer.parseInt(scanner.nextLine());
        if (auswahl == 1 || auswahl == 2)
            return auswahl;

        throw new Exception();
    }

    static String monatsnamen () throws Exception
    {
        String monat = new String();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie Bitte einen Monat auf Deutsch ein: ");
        monat = scanner.nextLine();

        for (String s : monate)
        {
            if (monat.equalsIgnoreCase(s))
                return monat;
        }

        throw new Exception();
    }

    public static void main(String[] args)
    {
        boolean pruefung = false;
        int auswahl=0;
        String monat = new String();

        while(!pruefung)
        {
            try
            {
                auswahl = eingabe();
                pruefung = true;
            }
            catch (Exception ex)
            {
                System.out.println("Falsche Format für Zahl: " + ex.getMessage());
            }
        }

        while (pruefung)
        {
            try
            {
                monat = monatsnamen();
                pruefung = false;
            }
            catch (Exception ex)
            {
                System.err.println("Bitte Geben Sie richtige Monat ein. " + ex.getMessage());
            }
        }

        if (auswahl == 1)
        {

            for(int i = 0; i<monate.length; i++)
            {
                if (monat.equalsIgnoreCase(monate[i]))
                {
                    System.out.println("Übersetzung: " + months[i]);
                    break;
                }
            }
        }
        else if (auswahl == 2)
        {
            for(int i=0; i<monate.length; i++)
            {
                if (monat.equalsIgnoreCase(monate[i]))
                {
                    System.out.println(monate[i] + "= " + (i+1) + ". Monat");
                }
            }
        }

        System.out.println("\nENDE...\n");

    }
}
