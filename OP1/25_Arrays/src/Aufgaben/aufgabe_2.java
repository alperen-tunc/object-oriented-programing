package Aufgaben;
/*
    Schreiben Sie bitte ein Java-Programm, in dem ...
    - in einer Schleife 6 Lottozahlen abgefragt werden
        + Die Abfrage einer Zahl wird wiederholt, wenn ...
              a) Das Eingabeformat keiner ganzen Zahl entspricht
              b) Die eingegebene Zahl bereits zuvor ausgewählt wurde
              c) Die eingegebene Zahl nicht zwischen 1 und 49 liegt
        + Falls weder a), b) noch c) zutrifft, wird die eingegebene Zahl in das Integer-Array 'tipp' abgespeichert.
    - nach der Schleife das Array tipp sortiert wird
    - anschließend das Array auf der Konsole ausgegeben wird
*/

import java.util.Arrays;
import java.util.Scanner;

public class aufgabe_2
{
    public static void main(String[] args)
    {
        int[] tipp = new int[6];
        Scanner scanner = new Scanner(System.in);

        for (int i=0; i<6; i++)
        {
            System.out.println("Geben Sie bitte " + (i+1) + ". Lotto Zahl ein: ");

            try
            {
                tipp[i] = Integer.parseInt(scanner.nextLine());
            }
            catch (Exception ex)
            {
                System.err.println(ex.getMessage() + " Falsche Format. Bitte geben Sie eine richtige Zahl ein!");
                i--;
            }

            if(tipp[i]<1 || tipp[i] > 49)
            {
                i--;
                System.err.println("Bitte geben Sie eine gültige Zahl ein: ");
            }
            for (int j=0; j<i; j++)
            {
                if(tipp[i] == tipp[j])
                {
                    System.err.println("Geben Sie bitte eine Zahl nicht zwei mal ein!");
                    i--;
                    break;
                }
            }
        }

        Arrays.sort(tipp);
        System.out.println("Eingegebene Zahlen: " + Arrays.toString(tipp));
    }
}