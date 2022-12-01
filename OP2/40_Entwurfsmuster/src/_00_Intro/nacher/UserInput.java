package _00_Intro.nacher;

import javax.swing.*;

public class UserInput
{
    public static void main(String[] args)
    {
        String message = "Eine Option auswählen bitte (1,2,3,4)";
        String input = JOptionPane.showInputDialog(message);

        Action action = ActionManager.getAction(input);
        action.execute();


    }
}
