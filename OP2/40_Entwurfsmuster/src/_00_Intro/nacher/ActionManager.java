package _00_Intro.nacher;

import java.util.HashMap;
import java.util.Map;

public class ActionManager
{
    private static Map<String, Action> actionMap;

    public static void init() {
        actionMap = new HashMap<>();
        actionMap.put("1", new Action1());
        actionMap.put("2", new Action2());
        actionMap.put("3", new Action3());
        actionMap.put("4", new Action4());
    }

    public static Action getAction(String userInput) {
        if (actionMap == null)
            init();
        Action action = actionMap.get(userInput);
        if (action == null)
            action = new InvalidInputAction();
        return action;

        // Alternative
        // return actionMap.getOrDefault(userInput, new InvalidInputAction());
    }
}
