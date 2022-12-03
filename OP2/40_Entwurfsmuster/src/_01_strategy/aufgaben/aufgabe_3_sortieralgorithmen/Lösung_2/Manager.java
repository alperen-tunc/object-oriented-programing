package _01_strategy.aufgaben.aufgabe_3_sortieralgorithmen.Lösung_2;

import _01_strategy.aufgaben.aufgabe_2_arithmetische_operationen.Nachher.Operationen.*;

import java.util.HashMap;
import java.util.Map;

public class Manager
{
    private static Map<Integer, Strategy> operationMap;

    public static void init()
    {
        operationMap = new HashMap<>();
        operationMap.put(1, new Bubblesort());
        operationMap.put(2, new Quicksort());
        operationMap.put(3, new Mergesort());
    }

    public static Strategy getStrategy(int userInput)
    {
        if (operationMap == null)
        {
            init();
        }
        Strategy strategy = operationMap.get(userInput);

        return strategy;
    }
}
