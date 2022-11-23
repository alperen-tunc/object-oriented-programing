package Aufgaben;
/* Aufgabe 1
 * Schreiben Sie eine statische Methode, die vom Benutzer eine Zahl abfragt und die eingegebene Zahl als Integer zurückgibt.
  Wenn der Benutzer etwas eingibt, was keine ganze Zahl ist, soll eine Fehlermeldung erscheinen und die Abfrage wird wiederholt.
 * Geben Sie zum Testen die eingegebene Zahl in der Konsole aus.
 * Übergabewert: Die eingegebene Zahl
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class aufgabe_1
{
    public static int umwandelnInt() throws NumberFormatException
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Eingabe: ");
        String eingabe = scanner.nextLine();
        int zahl = Integer.parseInt(eingabe);
        return zahl;
    }

    public static void main(String[] args)
    {
        int zahl = 0;
        boolean controlling = false;

        while (!controlling)
        {
            try
            {
                int eingabe = umwandelnInt();
                System.out.println(eingabe);
                controlling = true;
            }
            catch (NumberFormatException ex)
            {
                System.err.println("Umwandlung fehler: " + ex.getMessage());
            }
        }



    }
}
