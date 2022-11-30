package _00_Intro.vorher;

import javax.swing.*;

public class UserInput
{
    public static void main( String[] args ) {

        String input = JOptionPane.showInputDialog("Eine Option auswählen bitte (1,2,3,4)");
        if (input.equals("1"))
            m1();
        else if (input.equals("2"))
            m2();
        else if (input.equals("3"))
            m3();
        else if (input.equals("4"))
            m4();
        else
            invalidInput();
    }

    private static void m4() {

    }

    private static void invalidInput() {
    }

    private static void m3() {

    }

    private static void m2() {
    }

    private static void m1() {

    }
}
