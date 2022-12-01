package _01_strategy.aufgaben.aufgabe_2_arithmetische_operationen.Nachher;

import _01_strategy.aufgaben.aufgabe_2_arithmetische_operationen.Nachher.Operationen.OperationWaehlen;

import java.util.Scanner;

public class Meinmain
{
    public static void main(String[] args)
    {
        userInput();
    }

    public static void userInput()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie Rechenart \nAddition, \nSubtraktion, \nMultiplikation, \nDivision\n   ein: ");
        char antwort = (scanner.nextLine()).charAt(0);

        OperationWaehlen operation = ActionManager.getOperation(antwort);

        System.out.println("Geben Sie bitte erste Zahl ein: ");
        int zahl1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Geben Sie bitte zweite Zahl ein: ");
        int zahl2 = Integer.parseInt(scanner.nextLine());
        System.out.println();

        double ergebnis = operation.berechnen(zahl1, zahl2);

        System.out.println(ergebnis);
    }
}
