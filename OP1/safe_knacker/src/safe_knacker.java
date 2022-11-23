import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class safe_knacker
{
    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<Integer> passwort = new ArrayList<>();
    public static ArrayList<Integer> versuch = new ArrayList<>();

    public static void main(String[] args)
    {
        System.out.println("Wie viele Zahlen möchten Sie Ihre Passwort enthalten: ");
        int zahl = Control(scanner.nextLine());
        int counter=0;

        PasswortGenerieren(zahl);

        /*
        System.out.println("Passwort: ");
        for (Integer i : passwort)
        {
            System.out.print(i + " ");
        }
        System.out.println();
         */

        while (true)
        {
            for (int i=0; i<zahl; i++)
            {
                System.out.print("Geben Sie bitte " + (i+1) + ". Stelle ein : ");
                versuch.add(Control(scanner.nextLine()));
            }
            System.out.println("Meine Vermutung");
            for (Integer i: versuch)
            {
                System.out.print(i + " ");
            }
            System.out.println();
            counter++;

            if (Vergleich(zahl))
            {
                System.out.println(counter + ". Versuch");
                break;
            }
            versuch.clear();
        }
    }//Hier endet Main.

    public static boolean Vergleich(int zahl)
    {
        int counter=0;
        for (int i=0; i<zahl; i++)
        {
            if (passwort.get(i) == versuch.get(i))
            {
                System.out.println("in " + (i+1) + ". Stelle war die Zahl gleich. ");
                counter++;
            }
            if (zahl == counter)
            {
                System.out.println("Glückwunsch, Sie haben den Safe erfolgreich geöffnet");
                return true;
            }
        }
        return false;
    }

    public static void PasswortGenerieren(int zahl)
    {
        Random rand = new Random();
        for (int i=0; i<zahl; i++)
        {
            passwort.add(rand.nextInt(10));
        }

    }
    public static int Control(String zahl)
    {
        int zahlRückgabe;
        while(true)
        {
            try
            {
                zahlRückgabe = Integer.parseInt(zahl);
                if (zahlRückgabe<=9)
                    break;
            }
            catch (NumberFormatException ex)
            {
                System.err.println(ex.getMessage());
            }
            System.err.println("Entweder haben Sie falsche Format, oder eine mehr stellige zah eingegeben.");
            System.out.print("Geben Sie Bitte die Zahl nochmal ein: ");
            System.out.println();
            zahl = scanner.nextLine();
        }
        return zahlRückgabe;
    }

}
