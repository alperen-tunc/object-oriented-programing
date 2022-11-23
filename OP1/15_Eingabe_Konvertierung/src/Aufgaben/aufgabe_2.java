package Aufgaben;
/*
    Schreiben Sie bitte ein Programm, in dem  ...
    - in einer Schleife pro Durchlauf so lange 2 Double-Zahlen vom User abgefragt werden, bis deren Differenz (auf 2 Nachkommastellen gerundet) 0 beträgt
    - pro Durchlauf wird jeweils die aktuelle Differenz ausgegeben

    HINWEIS:
    Je nach Reihenfolge der Differenzbildung (bzw. Eingabe der Zahlen) kann die Differenz positiv, oder negativ sein ...
    ... sorgen Sie bitte bei der Ausgabe dafür, dass die Differenz stets als ein Wert größer gleich null ausgegeben wird.
    Zum Runden oder zum Bilden des positiven Betrags eines Wertes gibt es passende Methoden in der Math-Klasse
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class aufgabe_2
{
    public static void main(String[] args)
    {
        double val1;
        double val2;
        double difference;

        Scanner eingabe = new Scanner(System.in);


        do
        {
            System.out.println("Geben Sie bitte erste Gleitkommazahl");
            val1 = Double.parseDouble(eingabe.nextLine());

            System.out.println("Geben Sie bitte zweite Gleitkommazahl");
            val2 = Double.parseDouble(eingabe.nextLine());

            difference = val1 - val2;

            if (difference < 0)
            {
                difference *= -1;
            }

            DecimalFormat df = new DecimalFormat("###.##");
            System.out.println("Rounded Double difference (DecimalFormat): "+df.format(difference));
        }
        while ((difference != 0));

        System.out.println("ENDE...");




    }
}
