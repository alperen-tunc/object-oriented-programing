// Aufgabe_01_04_01

package Aufgaben;

import java.util.Scanner;

public class Aufgabe_2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte alter eingeben: ");
        String eingabe = scanner.nextLine();

        int alter = Integer.parseInt(eingabe);

        if (alter > 17)
        {
            System.out.println("In Deutschland gelten Sie als volljährig");
        }
        else
        {
            System.out.println("In Deutschland gelten Sie noch nicht als volljährig");
        }

    }
}
