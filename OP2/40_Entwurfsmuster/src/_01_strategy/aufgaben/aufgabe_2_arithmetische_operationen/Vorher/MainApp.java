package _01_strategy.aufgaben.aufgabe_2_arithmetische_operationen.Vorher;

import java.util.Scanner;

public class MainApp
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie die Rechnungsart bitte ein: \nAddition = 1, \nSubtraktion = 2, \nMultiplikation = 3, \nDivision = 4\n   : ");
        int antwort = Integer.parseInt(scanner.nextLine());

        System.out.println("Geben Sie die erste Zahl ein; ");
        int zahl1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Geben Sie die zweite Zahl ein: ");
        int zahl2 = Integer.parseInt(scanner.nextLine());

        wahl(antwort,zahl1,zahl2);


        System.out.println("\n\nEnd of Main..");
    }

    public static void wahl(int antwort, int zahl1, int zahl2)
    {
        switch (antwort)
        {
            case 1 -> addition(zahl1, zahl2);
            case 2 -> subtraktion(zahl1, zahl2);
            case 3 -> multiplikation(zahl1, zahl2);
            case 4 -> division(zahl1, zahl2);
            default -> System.out.println("Geben Sie gültige Zahl ein: ");
        }
    }

    public static void addition(int zahl1, int zahl2)
    {
        System.out.println("Addition: " + (zahl1+zahl2));
    }

    public static void subtraktion(int zahl1, int zahl2)
    {
        System.out.println("Subtraktion: " + (zahl1 - zahl2));
    }

    public static void multiplikation(int zahl1, int zahl2)
    {
        System.out.println("Multiplikation: " + (zahl1 * zahl2));
    }

    public static void division(int zahl1, int zahl2)
    {
        System.out.println("Division: " + (zahl1 / zahl2));
    }

}
