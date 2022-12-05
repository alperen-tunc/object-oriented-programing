package _04_factory.aufgaben.aufgabe_2;

import _04_factory.aufgaben.aufgabe_2.fahrrad.Fahrrad;

import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welsche Fahrrad möchten Sie haben? ");

        String antwort = scanner.nextLine();

        FahrradFactory fahrradFactory = new FahrradFactory();
        FahrradStore store = new FahrradStore(fahrradFactory);

        Fahrrad fahrrad = store.bestelleFahrrad(antwort);

        System.out.println(fahrrad);



        System.out.println("\n\nEnd of Main..");
    }
}
