package Aufgaben;

/*
 * In ihrem Unternehmen werden neue Artikelnummern vergeben. Sie bestehen aus 5 Zahlen und einer Prüfziffer.
 * Sie sollen ein Programm entwerfen, dass 5 einstellige Zahlen einliest und daraus die Prüfziffer errechnet und sie auf der Console ausgibt. Wie Sie mit Fehleingaben umgehen,
 * bleibt Ihnen überlassen.
 * Folgende Informationen erhalten Sie für die Berechnung der Prüfziffer:
 * - die geraden Zahlen werden addiert, die ungeraden Zahlen werden mit 3 multipliziert und anschließend addiert.
 * - die Prüfziffer ergibt sich aus der letzten Stelle der Summe.
 * Beispiel:    27493 => 2+4 = 6;
 *              7*3+9*3+3*3 = 57;
 *              6 + 57 = 63 => Prüfziffer 3
 *              Artikelnummer = 27493-3
 */

import java.util.Scanner;

public class Aufgabe_6
{
    static int[] pruefung (int zahl)
    {
        int[] arr = new int[5];

        for (int i=0; i<5; i++)
        {
            arr[i] = zahl % 10;
            zahl = zahl / 10;
        }
        return arr;
    }

    public static int eingabePruefung ()
    {
        int zahl;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie Nummer ein: ");
        zahl = Integer.parseInt(scanner.nextLine());

        return zahl;
    }
    public static void main(String[] args)
    {
        int artikelnummer=0;
        int[] pruefZahlenGerade = new int[5];
        int[] pruefZahlenUngerade = new int[5];
        int[] pruefung;
        int summeVonGerade = 0;
        int summeVonUngerade = 0;
        int ergebnis;
        boolean controlling = false;

        while(!controlling)
        {
            try
            {
                artikelnummer = eingabePruefung();
                controlling = true;
            }
            catch (NumberFormatException ex)
            {
                System.out.println("Fehler bei Eingabe: " + ex.getMessage());
            }

        }

        pruefung = pruefung(artikelnummer);

        for (int i=0; i<5; i++)
        {
            if(pruefung[i] % 2 == 0)
            {
                pruefZahlenGerade[i] = pruefung[i];
            }
            else
            {
                pruefZahlenUngerade[i] = pruefung[i];
            }
        }

        for (int k : pruefZahlenGerade)
        {
            summeVonGerade += k;
        }

        for (int j : pruefZahlenUngerade)
        {
            summeVonUngerade += j * 3;
        }

        ergebnis = (summeVonGerade + summeVonUngerade) % 10;

        System.out.println("artikelnummer: " + artikelnummer + "-" + ergebnis);
    }
}