package Aufgaben;
/*
Schreibe ein Programm, bei dem eine Methode eine Division ausführt.
Erzwinge bei Aufruf dieser eine 0 Division und fange den dazugehörigen Fehler ab.
 */

public class Aufgabe_0
{
    public static double division (int a, int b)
    {
        return (double) a / b;
    }
    public static void main(String[] args)
    {

        try
        {
            System.out.println("Versuche Division durch 0...");
            int ergebnis = 5 / 0;
            System.out.println("Ergebnis " + ergebnis);

        }
        catch (ArithmeticException ex)
        {
            System.out.println("Fehler!" + ex.getMessage());
        }
    }

}
