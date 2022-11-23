package Aufgaben;

/* Schreiben Sie ein Programm, das...
 * eine Zufallszahl von 1 bis inklusive 99 auswürfelt
 * und den Benutzer in einer Schleife über eine Eingabe die Zahl erraten lässt.
 * Dabei wird die eingegebene Zahl in einen Integer geparst. Bei falscher Eingabe soll wiederholt werden.
 * Das Programm teilt nun dem Benutzer mit, ob die Schätzung kleiner oder größer als die gewürfelte Zahl war.
 * Die Schleife endet, wenn die gewürfelte Zahl getroffen wurde.
 * Dem Benutzer wird die Anzahl der Versuche ausgegeben.

 * Recherchieren Sie die Klasse "Random".
 */

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class aufgabe_4
{
    public static void main(String[] args)
    {
        int randomNum = ThreadLocalRandom.current().nextInt(99)+1;
        int zahl, counter=0;
        boolean control = false;
        System.out.println("Randomzahl: " + randomNum);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ich habe gewürfelt (1 bis 99)! Rate meine Zahl! ");

        while (!control)
        {
            counter++;
            try
            {
                zahl = Integer.parseInt(scanner.nextLine());
                if (zahl != randomNum)
                {
                    if(zahl < randomNum)
                    {
                        System.out.println("Geben Sie bitte eine höhere Zahl ein: ");
                    }
                    else
                    {
                        System.out.println("Geben Sie bitte eine kleinere Zahl ein: ");
                    }
                }
                else
                {
                    control = true;
                }
            }
            catch (NumberFormatException ex)
            {
                System.out.println(ex.getMessage() + "Bitte geben Sie richtige Format ein: ");
            }
        }

        System.out.println("Sie haben nach " + counter + " Versuch richtige Zahl gefunden.");
        System.out.println("ENDE...");

    }
}
