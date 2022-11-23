package Aufgaben;
/*
Aufgabe 0
Schreiben Sie bitte ein Java-Programm, das
a) einen Integer-Wert so lange abfragt, bis er mindestens die Größe 10 hat
b) bei jeder zu kleinen Eingabe eine Fehlermeldung ausgibt
c) bei einer Eingabe von mindestens 10 mit einer Erfolgsmeldung das Programm beendet
*/


import java.util.InputMismatchException;
import java.util.Scanner;

public class aufgabe_0
{
    public static int fehlerErkennung (int zahl)
    {
        if(zahl < 0)
        {
            System.out.println("Zahl darf nicht kleiner als 0 sein.");
            return 0;
        }
        else
        {
            try
            {
                Scanner eingabe = new Scanner(System.in);
                System.out.println("Geben Sie bitte eine Zahl ein: ");
                String zahlString = eingabe.nextLine();
                zahl = Integer.parseInt(zahlString);
                return zahl;
            }
            catch (NumberFormatException ex)
            {
                System.out.println("Fehler bei der Umwandlung in Integer! " + ex.getMessage());
            }
            catch (InputMismatchException ex)
            {
                System.out.println("Fehler bei Eingabe, bitte richtige Format eingeben. " + ex.getMessage());
            }
            return 0;
        }
    }

    public static void main(String[] args)
    {
        int zahl = 0;

        while(zahl<10)
        {
            zahl = fehlerErkennung(zahl);
        }
        System.out.println("Alles gut...");
    }
}
