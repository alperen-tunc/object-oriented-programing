package Aufgaben;
/* Aufgabe 0
 * Sie möchten Ihre Musiksammlung verwalten.
 * Erstellen Sie ein Array "Album" vom Typ String mit der Größe 5 (Es ist ein kleines Album).
 * Lieblingssongs von User wird gefragt.
 * In einer For-Schleife sollen dann alle Songs des Albums ausgegeben werden. Verwenden Sie Length-Eigenschaft des Arrays für die Schleifenbedingung.
 */

import java.util.Arrays;
import java.util.Scanner;

public class aufgabe_0
{
    public static void main(String[] args)
    {
        String[] album = new String[5];
        Scanner scanner = new Scanner(System.in);

        for (int i =0; i<album.length; i++)
        {
            System.out.println("Geben Sie Ihre " + (i+1) + ". LieblingsSongs ein: ");
            album[i] = scanner.nextLine();
        }
        System.out.println("Ihre angaben: " + Arrays.toString(album));
    }
}
