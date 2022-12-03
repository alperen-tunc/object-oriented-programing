package _01_strategy.aufgaben.aufgabe_3_sortieralgorithmen.Lösung_2;

import _01_strategy.aufgaben.aufgabe_2_arithmetische_operationen.Nachher.OperationManager;
import _01_strategy.aufgaben.aufgabe_2_arithmetische_operationen.Nachher.Operationen.Operation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        int[] arr1 = new int[5];
        boolean cont = false;

        Scanner scanner = new Scanner(System.in);
        Strategy strategy = null;
        while (true)
        {
            System.out.println("Bitte geben Sie Sortieralgorithmen \n(1) -> Bubblesort, \n(2) -> Quicksort, \n(3) -> " +
                                       "Mergesort, " +
                                       "\n(0) -> für Beenden\n   ein: ");
            int antwort = Integer.parseInt(scanner.nextLine());

            if (antwort == 0)
            {
                cont = true;
                break;
            }

            strategy = Manager.getStrategy(antwort);

            if (strategy == null)
            {
                System.err.println("Ungültige Syntax");
                continue;
            }
            else
            {
                break;
            }
        }

        if(!cont)
        {
            for (int i = 0; i < 5; i++)
            {
                System.out.printf("Geben Sie bitte %d. Zahl ein: ", i + 1);
                arr1[i] = Integer.parseInt(scanner.nextLine());
            }
            arr1 = strategy.operation(arr1);

            List<Integer> list = Arrays.stream(arr1).boxed().toList();

            list.forEach(System.out::println);
        }

    }
}
