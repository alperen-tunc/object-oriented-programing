package Aufgaben;
/*
 * Aufgabe 5
 * Schreiben Sie eine Funktion, die die Stromkosten im Jahr für einen Computer berechnet.
 * Es soll der Verbrauch des Computers (in Watt),
 * die durchschnittliche Zeit, die der Computer am Tag läuft in Stunden
 * und die Stromkosten pro kWh als Argumente an die Funktion übergeben werden.
 * Wer die Werte seines Computers, oder die Stromkosten pro kWh seines Anbieters nicht kennt,
 * sollte mit folgenden Werten arbeiten:
 * Verbrauch eines Laptops: 70
 * Stromkosten kWh: 25 Cent
 * Erstellen Sie einen PAP, ein Struktogramm, oder Pseudocode und anschließend ein Java-Programm.
 */

import java.util.Objects;
import java.util.Scanner;

public class aufgabe_5
{
    public static void main(String[] args)
    {
        double zeit;
        double stromkosten;
        double verbrauch;
        double ergebnis;
        String antwort;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Wie viel Stunde am Tag benutzen Sie das Computer: ");
        zeit = Double.parseDouble(scanner.nextLine());

        System.out.println("Kennen Sie Ihre Stromkosten: J / N");
        antwort = scanner.nextLine();

        if(Objects.equals(antwort, "J"))
        {
            System.out.println("Dann geben Sie bitte ein: ");
            stromkosten = Double.parseDouble(scanner.nextLine());
        }
        else
        {
            System.out.println("nicht schlimm.");
            stromkosten = 0.25;
        }

        System.out.println("Kennen Sie Verbrauch Ihres Computers: J / N");
        antwort = scanner.nextLine();

        if (Objects.equals(antwort, "J"))
        {
            System.out.println("Dan bitte geben Sie ein: ");
            verbrauch = Double.parseDouble(scanner.nextLine());
        }
        else
        {
            System.out.println("Nicht schlimm");
            verbrauch = 0.07;
        }

        System.out.println(berechnung(zeit, stromkosten, verbrauch) + " € im Jahr");
    }

    public static double berechnung(double zeit, double stromkosten, double verbrauch)
    {
        double summe=0;

        summe = (zeit*365) * stromkosten * verbrauch;

        return summe;
    }
}
