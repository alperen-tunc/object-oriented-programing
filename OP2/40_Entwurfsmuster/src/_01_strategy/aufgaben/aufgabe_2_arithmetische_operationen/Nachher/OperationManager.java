package _01_strategy.aufgaben.aufgabe_2_arithmetische_operationen.Nachher;

import _01_strategy.aufgaben.aufgabe_2_arithmetische_operationen.Nachher.Operationen.*;

import java.util.HashMap;
import java.util.Map;

public class OperationManager
{
    private static Map<Character, Operation> operationMap;

    public static void init()
    {
        operationMap = new HashMap<>();
        operationMap.put('A', new Addition());
        operationMap.put('S', new Subtraktion());
        operationMap.put('D', new Division());
        operationMap.put('M', new Multiplikation());
    }

    public static Operation getOperation(char userInput)
    {
        if (operationMap == null)
        {
            init();
        }
        Operation operationWaehlen = operationMap.get(userInput);

        return operationWaehlen;
    }
}
