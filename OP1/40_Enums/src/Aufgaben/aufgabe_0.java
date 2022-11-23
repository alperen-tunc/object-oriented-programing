package Aufgaben;

import java.util.Scanner;

import static java.lang.String.valueOf;

/*
    Aufgabe 0 (Basics)

    Schreiben Sie ein Programm, indem ein Benutzer über ein Menü zwischen drei Möglichkeiten auswählen kann.
    Die auswählbaren Möglichkeiten werden über ein Enum erfasst. Es sollen "JA", "NEIN" und "VIELLEICHT" auswählbar sein.

    In einem Switch-Case wird die Eingabe auf Übereinstimmung mit den Enum-Konstanten geprüft und der Benutzer erhält passend zu seiner Auswahl eine Ausgabe.
    Trifft der Benutzer eine ungültige Wahl, soll eine Fehlermeldung ausgegeben werden.

    Hinweis: Die Auswahlmöglichkeiten können per Schleife mithilfe der Methode values() des Enums ausgegeben werden. Mit valueOf() kann aus einem String eine Enum-Konstante gemacht werden.
 */
public class aufgabe_0
{
    enum Möglichkeiten
    {
        JA, NEIN, VIELLEICHT
    }

    public static void main(String[] args)
    {
        boolean controller = false;
        Scanner scanner = new Scanner(System.in);

        for(Möglichkeiten a : Möglichkeiten.values())
        {
            System.out.print(a.name() + " / ");
        }

        // antwort = String.valueOf(Möglichkeiten.valueOf(antwort));
        while(!controller)
        {
            System.out.print("\nMacht dir heute Spaß: ");
            String antwort = scanner.nextLine();

            try
            {
                info(Möglichkeiten.valueOf(antwort.toUpperCase()));
                controller = true;
            }
            catch (IllegalArgumentException ex)
            {
                System.out.println("ungültige Auswahl");
            }
        }

    }

    public static void info(Möglichkeiten antwort)
    {
        switch (antwort)
        {
            case JA:
                System.out.println("Sind Sie sicher.");
                break;
            case NEIN:
                System.out.println("Jaaa verstehe ich.");
                break;
            case VIELLEICHT:
                System.out.println("'VIELLEICHT' auch nicht");
                break;
        }
    }

}
