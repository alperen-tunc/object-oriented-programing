package Aufgaben;
/*
    Schreiben Sie bitte zunächst die 3 folgenden Methoden:
    a) Funktionsname: SchreibeListe
       Übergabewert:  1 String-Liste 'l'
       Funktion:      l wird sortiert, anschließend werden alle Strings in l auf der Konsole ausgegeben
       Rückgabewert:  Keiner
    b) Funktionsname: HatLeerzeichen
       Übergabewert:  1 String 's'
       Funktion:      Füllt die boolesche Variable 'b' mit 'true', FALLS s (mindestens) ein Leerzeichen besitzt, SONST 'false'
       Rückgabewert:  b
    c) Funktionsname: SchonVorhanden
       Übergabewert:  1 String-Liste 'l' und ein String 's'
       Funktion:      Füllt die boolesche Variable 'b' mit 'true', FALLS s in l vorkommt, SONST 'false'
       Rückgabewert:  b

    Testen Sie die obigen Methoden bitte mithilfe des folgenden Programms:
    - Zunächst wird eine Liste vom Typ String eingeführt
    - Das Programm startet eine Endlos-Schleife, in der pro Durchlauf ...
      + die Konsole gelöscht wird
      + vom User ein Wort abgefragt wird
        - falls in der Eingabe ein Leerzeichen vorkommt: entsprechende Fehlermeldung:
        - falls in der Eingabe KEIN Leerzeichen vorkommt, ABER die Eingabe bereits in der Liste vorkommt: entsprechende Fehlermeldung
        - falls WEDER ein Leerzeichen vorkommt, NOCH die Eingabe bereits vorkommt, so wird die Eingabe in die Liste mit aufgenommen
      + alle Elemente der Liste werden auf der Konsole ausgegeben
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class aufgabe_2
{
    public static void main(String[] args)
    {
        String antwort;
        ArrayList<String> stringList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true)
        {
            System.out.print("Bitte geben Sie ein Wort ein: ");
            antwort = scanner.nextLine();

            if (HatLeerzeichen(antwort))
            {
                System.err.println("\nIhre Eingabe enthält eine Leerzeichen.");
            }
            else if (SchonVorhanden(stringList, antwort))
            {
                System.err.println("\nIhre Eingabe ist schon Vorhanden.");
            }
            else
            {
                stringList.add(antwort);
            }
            System.out.println("Aktuelle listeninhalt: " + stringList);
        }
    }

    static void SchreibeListe (ArrayList<String> l)
    {
        // l = new ArrayList<>();
        Collections.sort(l);
        System.out.println(l);
    }
    static boolean HatLeerzeichen(String s)
    {
        char c ;
        for (int i =0; i< s.length(); i++)
        {
            c = s.charAt(i);
            if (c == ' ')
            {
                return true;
            }
        }
        return false;
    }
    static boolean SchonVorhanden(ArrayList<String> l, String s)
    {
        for (String value : l)
        {
            if (value.equals(s))
            {
                return true;
            }
        }
        return false;
    }
}
