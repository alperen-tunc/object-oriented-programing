package Aufgaben;
/*
 * Aufgabe 3
    AUFGABENSTELLUNG ("große Straße" beim Kniffel-Spiel)

        - Führen Sie bitte zunächst im Main ein Integer-Array der Länge 5 ein
        - Schreiben Sie anschließend bitte die beiden folgenden Methoden:
            a) Funktionsname: fülleWürfelArray
               Übergabewerte: 1 Integer-Array 'arr'
                              2 Integer 'min' und 'max'
               Funktion:      Die Methode füllt das Array arr mit Zufallszahlen zwischen (beiderseits einschließlich) min und max
                              (HINWEIS: Länge des Arrays = arr.Length)
               Rückgabewert:  Keiner

            b) Funktionsname: ausgabeWürfelArray
               Übergabewerte: 1 Integer-Array 'arr'
               Funktion:      Ausgabe aller Arrayfeld-Werte (also für alle Indices zwischen 0 und arr.Length) auf der Konsole
               Rückgabewert:  Keiner

       Verwenden Sie bitte die beiden obigen Methoden in folgendem Java-Programm - für dieses Programm soll gelten:
            - Das Programm startet eine Schleife, pro Durchlauf ...
                + wird ein Array der Länge 5 mit Zufalls-Würfelzahlen gefüllt
                + wird das gefüllte Array (numerisch) sortiert
                + wird überprüft, ob es sich um eine "große Straße" handelt (1,2,3,4,5) oder (2,3,4,5,6)
            - Die Schleife endet, falls eine "große Straße" gewürfelt wurde
            - Das Programm endet mit der Ausgabe der Anzahl der Schleifen-Durchläufe, die nötig waren, um die "große Straße" zu erreichen
*/

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class aufgabe_3
{
    static void fülleWürfelArray(int[] arr, int max, int min)
    {
        Random random = ThreadLocalRandom.current();
        for(int i = 0; i< arr.length; i++)
        {
            arr[i] = random.nextInt(max) + min;
        }
    }

    static void ausgabeWürfelArray(int[] arr)
    {
        Arrays.sort(arr);
        for(int i : arr)
        {
            System.out.print(i + " ");
        }
    }

    static Boolean prüfung(int[] zahl)
    {
        Arrays.sort(zahl);
        for(int i=0; i<zahl.length -1; i++)
        {
            if (zahl[i+1] - zahl[i] != 1)
                return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        int[] würfel = new int[5];

        int counter=1;
        do
        {
            fülleWürfelArray(würfel, 6,1);
            counter++;
        }
        while(!prüfung(würfel));

        ausgabeWürfelArray(würfel);
        System.out.println(counter + ". Versuch");

    }
}
