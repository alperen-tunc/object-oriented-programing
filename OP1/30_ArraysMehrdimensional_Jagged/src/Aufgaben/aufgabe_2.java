package Aufgaben;
/*
    Schreiben Sie bitte zunächst die beiden folgenden Methoden:
    a) Funktionsname: fülleLottoArray
       Übergabewerte: 1 Integer-Array
       Funktion:      Füllt in das Array mit 6 Lottozahlen (Zahlen zwischen 1 und 49, KEINE Zahl darf mehrfach auftreten)
       Rückgabewert:  Keiner

    b) Funktionsname: zähleTreffer
       Übergabewerte: 2 Integer-Array a und b
       Funktion:      Zählt die Anzahl der "Treffer" (= Anzahl der Zahlen, die in a und b gemeinsam auftreten)
       Rückgabewert:  Anzahl der Treffer

    Verwenden Sie obige Funktionen bitte in folgendem Java-Programm, in dem ...
    - zunächst ein Lottotipp ausgelost wird (Random oder vom Benutzer eingeben lassen)
		und in einem Array 'tipp' abgespeichert wird
    - anschließend eine do-while-Schleife startet, die pro Durchlauf ...
      + eine Lotto-Auslosung (6 Zahlen, also ohne Zusatzzahl) in ein Array 'auslosung' abspeichert
      + Lottotipp und (aktuelle) Auslosung auf der Konsole ausgibt
      + aktuelle Anzahl der Treffer (wie viele Richtige wurden erzielt?) ermittelt und auf der Konsole ausgibt
	  + die Auslosung in einem 2-dimensionalen Array abspeichert
    - die Schleife endet, wenn (mindestens) 3 Treffer erreicht wurden, oder 10 Durchläufe / Auslosungen stattfanden.
    - nach der Schleife zur Kontrolle die Auslosungen des 2-dimensionalen Arrays auf der Konsole ausgegeben werden
 */

import java.awt.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class aufgabe_2
{
    static Scanner scanner = new Scanner(System.in);
    static int[] fülleLottoArray ()
    {
        int[] arr = new int[6];
        Random random = new Random();
        for (int i=0; i<6; i++)
        {
            arr[i] = random.nextInt(0,10);
        }
        return arr;
    }

    static int zähleTreffer (int[] arr, int[] arr2)
    {
        int anzahl=0;

        for (int k : arr)
        {
            for (int i : arr2)
            {
                if (k == i)
                    anzahl++;
            }
        }
        return anzahl;
    }
    static int pruefung () throws NumberFormatException
    {
        int a=0;
        boolean f = false;
        while (!f)
        {
            try
            {
                a = Integer.parseInt(scanner.nextLine());
                f = true;
            }
            catch (NumberFormatException ex)
            {
                System.err.println(ex.getMessage() + " Bitte Richtige zahl eingeben: ");
            }
            if (a<0 || a>49)
            {
                System.out.println("Bitte geben Sie eine gültige Zahl ein: ");
                f = false;
            }
        }
        return a;
    }

    public static void main(String[] args)
    {
        int[] Lottotipp = new int[6];
        int[] lottoZahlen = new int[6];
        int counter = 0;
        int treffer = 0;
        int[][] auslosungen = new int[2][6];

        do
        {
            lottoZahlen = fülleLottoArray();
            System.out.println("Lotto Zahlen: " + Arrays.toString(lottoZahlen));
            System.out.println("Geben Sie bitte Zahl ein: ");

                for (int i = 0; i < Lottotipp.length; i++)
            {
                Lottotipp[i] = pruefung();
            }
            counter++;
            treffer = zähleTreffer(Lottotipp, lottoZahlen);
            System.out.println();
            System.out.println("Treffer: " + treffer);
            System.out.println("Die Lotto Zahlen: " + Arrays.toString(lottoZahlen));
            System.out.println("Die eingegebene lottozahlen: " + Arrays.toString(Lottotipp));
            System.out.println();

        }while(treffer<=3 && counter<10);

        auslosungen[0] = lottoZahlen;
        auslosungen[1] = Lottotipp;

        System.out.println(Arrays.deepToString(auslosungen));

        System.out.println("\n");
        System.out.println("Ende");
    }
}
