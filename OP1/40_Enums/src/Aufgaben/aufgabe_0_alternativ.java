package Aufgaben;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

enum Auswahl
{
    JA,
    NEIN,
    VIELLEICHT
}

public class aufgabe_0_alternativ
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        for (Auswahl a : Auswahl.values())
        {
            System.out.println(a.name() + " ");
        }

        System.out.println("Macht dir JAVA Spaß");
        String antwort = scanner.nextLine();

        try
        {
            switch (Auswahl.valueOf(antwort.toUpperCase()))
            {
                case JA:
                    System.out.println("Super! dann können wir so weitermachen");
                    break;
                case NEIN:
                    System.out.println("Kann ich verstehen. heute ist schwierig");
                    break;
                case VIELLEICHT:
                    System.out.println("Du musst üben.");
                    break;
            }
        }
        catch (IllegalArgumentException ex)
        {
            System.err.println("Keine gültige Auswahl");
        }

    }
}
