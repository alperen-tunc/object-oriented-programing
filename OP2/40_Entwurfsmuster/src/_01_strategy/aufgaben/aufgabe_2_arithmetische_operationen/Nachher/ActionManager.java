package _01_strategy.aufgaben.aufgabe_2_arithmetische_operationen.Nachher;

import _01_strategy.aufgaben.aufgabe_2_arithmetische_operationen.Nachher.Operationen.*;

import java.util.HashMap;
import java.util.Map;

public class ActionManager
{
    private static Map<Character, OperationWaehlen> actionMap;

    public static void init()
    {
        actionMap = new HashMap<>();
        actionMap.put('A', new Addition());
        actionMap.put('S', new Subtraktion());
        actionMap.put('D', new Division());
        actionMap.put('M', new Multiplikation());
    }

    public static OperationWaehlen getOperation(char userInput)
    {
        if (actionMap == null)
        {
            init();
        }
        OperationWaehlen operationWaehlen = actionMap.get(userInput);
        if (operationWaehlen == null)
        {
            operationWaehlen = new ExceptionClass();
            Meinmain.userInput();
        }
        return operationWaehlen;
    }
}
