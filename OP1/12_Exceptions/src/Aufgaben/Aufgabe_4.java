package Aufgaben;

/*
Schauen Sie sich, um diese Aufgabe zu lösen, das Thema DatumsFormat aus den Codebeispielen an.

Führen Sie bitte zunächst die folgende Methode ein:
Methodenname: tryStringZuDatum
Übergabewerte: String s
Funktion: - Versucht s in LocalDate zu konvertieren
          - Fängt bei DateTimeParseException die Fehlermeldung ab

Rückgabewert: das LocalDate Objekt, FALLS Konvertierung klappte, sonst null

Testen Sie diese Funktion.
 */

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Aufgabe_4
{
    static LocalDate stringZuDatum (String s)
    {
        LocalDate d;
        try
        {
            DateTimeFormatter fm = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            d = LocalDate.parse(s, fm);
        }
        catch (DateTimeParseException e)
        {
            return null;
        }

        return d;
    }

    public static void main(String[] args)
    {
        String datumText;
        LocalDate datum;

        Scanner eingabe = new Scanner(System.in);
        System.out.println("Bitte geben Sie Datum ein: ");
        datumText = eingabe.nextLine();

        datum = stringZuDatum(datumText);

        if (datum != null)
        {
            System.out.println(datum);
        }
        else
        {
            System.out.println("Konvertieren funktioniert nicht.");
        }
    }
}
