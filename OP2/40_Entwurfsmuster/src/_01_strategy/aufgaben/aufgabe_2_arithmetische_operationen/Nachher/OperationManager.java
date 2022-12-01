package _01_strategy.aufgaben.aufgabe_2_arithmetische_operationen.Nachher;

import _01_strategy.aufgaben.aufgabe_2_arithmetische_operationen.Nachher.Operationen.*;

import java.util.HashMap;
import java.util.Map;

public class OperationManager
{
    private static Map<Character, OperationWaehlen> operationMap;

    public static void init()
    {
        operationMap = new HashMap<>();
        operationMap.put('A', new Addition());
        operationMap.put('S', new Subtraktion());
        operationMap.put('D', new Division());
        operationMap.put('M', new Multiplikation());
    }

    public static OperationWaehlen getOperation(char userInput)
    {
        if (operationMap == null)
        {
            init();
        }
        OperationWaehlen operationWaehlen = operationMap.get(userInput);
        if (operationWaehlen == null)
        {
            operationWaehlen = new ExceptionClass();
            Meinmain.userInput();
        }
        return operationWaehlen;
    }
}
