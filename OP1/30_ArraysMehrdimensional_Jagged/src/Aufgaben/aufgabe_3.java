package Aufgaben;
/*
Führen Sie im Main bitte zunächst das folgende 3-Dimensionale Array ein:

      String[][][] dim3 = new String[][][] {
            {
                {"Tabelle","Datenbank","Spalte","Beschränkung"},
                {"zuweisen","setzen","erhalten","Liste"},
                {"Puffer","Projekt","Organisation","Interessengruppe"}
            },
            {
                {"table","database","column","constraint"},
                {"assign","set","get","list"},
                {"buffer","project","organization","stakeholder"}
            }
        };

 HINWEISE:
 - Die dritte Dimension zählt die Sprache (0=Deutsch, 1=Englisch)
 - Die zweite Dimension zählt das Fach (0=SQL, 1=OOP, 2=PM)
 - Die erste Dimension zählt die Wortnummern [0 bis 3] (Für jede Sprache und jedes Fach jeweils 4 Wörter)

 Schreiben Sie bitte das folgende Programm, um den Umgang mit diesem 3-dimensionalen Array zu testen:
 - Das Programm besteht aus einer Endlos-Schleife, in der pro Durchlauf ...
   + Die Sprache abgefragt wird (Deutsch=1 / Englisch=2) - Wiederholung der Abfrage bei Fehleingabe
   + Das Fach abgefragt wird (SQL=1 / OOP=2 / PM=3) - Wiederholung der Abfrage bei Fehleingabe
   + Die Wortnummer abgefragt wird (ein Wert zwischen 1 und 4) - Wiederholung der Abfrage bei Fehleingabe
   + das gewählte Wort, des gewählten Fachs in der gewählten Sprache auf der Konsole ausgegeben wird

   Beispiel:
   Bei der Auswahl: 1 1 1 (Deutsch, SQL, 1.Wort) kommt es zur Ausgabe von dim3[0][0][0]="Tabelle"
*/

import java.util.Arrays;
import java.util.Scanner;

public class aufgabe_3
{
    public static void main(String[] args)
    {
        int antwortSprache = 0;
        int antwortFach = 0;
        int antwortWortnummer = 0;
        Scanner scanner = new Scanner(System.in);

        String[][][] dim3 = new String[][][] {
                {
                        {"Tabelle","Datenbank","Spalte","Beschränkung"},
                        {"zuweisen","setzen","erhalten","Liste"},
                        {"Puffer","Projekt","Organisation","Interessengruppe"}
                },
                {
                        {"table","database","column","constraint"},
                        {"assign","set","get","list"},
                        {"buffer","project","organization","stakeholder"}
                }
        };

        boolean controller = false;
        while (!controller)
        {
            System.out.print("Wählen Sie bitte die Sprache aus: (Deutsch=1 / Englisch=2): ");
            try
            {
                antwortSprache = Integer.parseInt(scanner.nextLine())-1;
                controller = true;
            }
            catch (NumberFormatException ex)
            {
                System.err.println(ex.getMessage() + " geben Sie bitte richtige Format ein: ");
            }
            if (antwortSprache < 0 || antwortSprache >1)
                controller = false;
        }
        while (controller)
        {
            System.out.print("Wählen Sie bitte Fach aus: (SQL=1 / OOP=2 / PM=3): ");
            try
            {
                antwortFach = Integer.parseInt(scanner.nextLine())-1;
                controller = false;
            }
            catch (NumberFormatException ex)
            {
                System.err.println(ex.getMessage() + " geben Sie bitte richtige Format ein: ");
            }
            if (antwortFach < 0 || antwortFach >2)
                controller = true;
        }
        while (!controller)
        {
            System.out.print("Wählen Sie bitte Wort aus: (ein Wert zwischen 1 und 4): ");
            try
            {
                antwortWortnummer = Integer.parseInt(scanner.nextLine())-1;
                controller = true;
            }
            catch (NumberFormatException ex)
            {
                System.err.println(ex.getMessage() + " geben Sie bitte richtige Format ein: ");
            }
            if (antwortWortnummer < 0 || antwortWortnummer >3)
                controller = false;
        }

        System.out.println(dim3[antwortSprache][antwortFach][antwortWortnummer]);

    }
}
