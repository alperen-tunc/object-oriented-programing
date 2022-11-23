package Aufgaben;
/*
Aufgabe 1
Schreiben Sie bitte ein Java-Programm, in dem
a) ein 2-dimensionales Array (Dimensionen 2,3) namens "lexikon" eingeführt wird
b) in [0][x] (für alle x=0;1 oder 2) ein Begriff initialisiert wird
c) in [1][x] jeweils die Erläuterung des Begriffes abgespeichert wird
d) in einer Endlosschleife vom User pro Durchlauf ein Begriff abgefragt wird
e) die passende Erläuterung ausgegeben wird, oder eine Fehlermeldung, falls der Begriff nicht vorhanden

Beispiel:
lexikon[0][0]="Auto" / lexikon[1][0]="Motorisiertes Straßen-Fahrzeug mit 4 Rädern"
lexikon[0][1]="OOP" / lexikon[1][1]="Abkürzung für 'Objektorientierte Programmierung'"
lexikon[0][2]="Süßstoff" / lexikon[1][2]="Kalorienarmer Zuckerersatz"

Hinweis:
- die erste Dimension (3) zählt die Anzahl der abgespeicherten Begriffs-Erläuterung-Paare
- die zweite Dimension (2) zählt also die "Textarten" (Begriff oder Erläuterung)
(oder umgekehrt, je nachdem welche Zählrichtung der Dimensionen man betrachtet)
*/

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class aufgabe_1
{
    public static void main(String[] args)
    {
        String antwort = new String();
        String[][] lexikon = new String[][]
                {
                        {
                            "DHCP", "DNS", "DSL"
                        },
                        {
                            "Dynamic Host Configuration Protocol", "Domain Name System", "Digital Subscriber Line"
                        }
                };

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wenn Sie das Programm beenden wollen, geben Sie Bitte 'EXIT' ein.");

        while(true)
        {
            boolean control = false;
            System.out.println("Bitte geben Sie einen Begriff, für den Sie eine Erläuterung brauchen: ");
            antwort = scanner.nextLine();

            if(antwort.equalsIgnoreCase("exit"))
            {
                break;
            }
            for (int i=0; i<lexikon[0].length; i++)
            {
                    if (antwort.equalsIgnoreCase(lexikon[0][i]))
                    {
                        System.out.println("Die Erläuterung von Begriff " + lexikon[0][i] + " ist: " + lexikon[1][i]);
                        control=true;
                        break;
                    }
            }
            if (!control)
            {
                System.out.println("Bitte geben Sie einen richtigen Begriff ein: ");
            }

        }


    }
}
