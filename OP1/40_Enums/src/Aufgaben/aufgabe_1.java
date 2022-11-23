package Aufgaben;
/*
    Schreiben Sie bitte ein Java Programm, in dem ...
	- das Enum Ihk eingeführt wird (für die Noten SehrGut = 92, Gut = 81, Befriedigend = 67, Ausreichend = 50, Mangelhaft = 30, Ungenügend = 0)
	- vom User in einer Schleife eine Punktzahl abgefragt wird
        (die Schleife wird - ohne Fehlermeldung - wiederholt, falls Eingabe nicht zwischen 0 und 100, oder ein anderer Fehler geschah)
    - nach der Schleife wird der Name des entsprechenden Enum-Wertes ausgegeben
        (also SehrGut bei Eingaben zwischen 100 und 92
                  Gut bei Eingaben von 81 bis 91
                  ... )
 */

import java.util.Scanner;

public class aufgabe_1
{
    enum Ihk
    {
        SEHRGUT(92),
        GUT(81),
        BEFRIEDIGEND(67),
        AUSREICHEND(50),
        MANGELHAFT(30),
        UNGENÜGEND(0);

        private final int note;

        private Ihk(int note)
        {
            this.note = note;
        }

        public static Ihk valueOf(int note)
        {
            Ihk[] noten = Ihk.values();
            for(Ihk i: noten)
            {
                if (i.note == note)
                {
                    return i;
                }
            }
            return null;
        }

        public static Ihk getNote(int note)
        {
            Ihk[] noten = Ihk.values();
            for (Ihk i: noten)
            {
                if(note >= i.note)
                {
                    return i;
                }
            }
            return null;
        }
    }

    public static void main(String[] args)
    {
        boolean controller = false;
        int antwort=0;
        Scanner scanner = new Scanner(System.in);

        while (!controller)
        {
            System.out.print("Geben Sie bitte Punktzahl ein: ");

            try
            {
                antwort = Integer.parseInt(scanner.nextLine());
                controller = true;
            }
            catch (NumberFormatException ex)
            {
                System.err.println(ex.getMessage() + "Geben Sie bitte richtige format ein: ");
            }
            if(antwort<0 || antwort>100)
            {
                System.out.println("Geben Sie bitte eine Zahl zwischen 0 und 100 ein:");
                controller = false;
            }
        }

        System.out.println(Ihk.getNote(antwort));
    }
}
