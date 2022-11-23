package Aufgaben;

import java.util.Scanner;
import java.util.SimpleTimeZone;

/*
    AUFGABE 3A
    Schreiben Sie bitte die folgende Funktion (und testen Sie diese im Main)
    Name: inputINT
    Übergabewert: 1 String als User-Information-Text (z.B."Geben Sie bitte eine ganze Zahl ein: ")
    Funktion: Fragt vom User eine ganze Zahl ab (OHNE Überprüfung der Korrektheit der User-Eingabe)
    Rückgabewert: User-Eingabe

    AUFGABE 3B
    Schreiben Sie bitte ein Java-Programm, in dem (unter Verwendung der Funktion aus Teilaufgabe A) ...
    - eine Schleife solange durchlaufen wird, bis der User die Eingabe 42 tätigt
    - bei jeder falschen Eingabe eine Fehlermeldung auf der Konsole erscheint
    - bei der ersten korrekten Eingabe die Schleife beendet und eine Erfolgsmeldung ausgegeben wird

*/
public class aufgabe_3
{
    public static String inputInt()
    {
        String zahl = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie bitte eine Zahl ein: ");
        zahl = scanner.nextLine();

        return zahl;
    }

    public static void main(String[] args)
    {
        int zahl = 0;

        do
        {
            try
            {
                zahl = Integer.parseInt(inputInt());;
            }
            catch (NumberFormatException ex)
            {
                System.out.println("Falsche Format, bitte geben Sie richtige Format ein: " + ex.getMessage());
            }

        }
        while (zahl != 42);

        System.out.println("ENDE...");

    }
}
