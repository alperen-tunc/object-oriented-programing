package Aufgaben;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*
        VORBEMERKUNG:
        Das folgende Programm soll mit einer Liste von String-Arrays der Länge 2 arbeiten
        => Jedes Element der Liste ist also ein Array, in dem jeweils 2 Strings abgespeichert werden können.

        AUFGABENSTELLUNG:
        Schreiben Sie bitte ein Programm, in dem ...
        - zunächst eine Liste von String-Arrays der Länge 2 eingeführt wird
        - eine Endlos-Schleife startet, in der pro Durchlauf ...
          + vom User ein deutsches Wort und dessen englische übersetzung abgefragt wird
          + die beiden User-Eingaben in ein String-Array der Länge 2 abgespeichert werden
          + dieses Array in der Liste abgespeichert wird
          + anschließend alle Wortpaare der Liste ausgegeben werden
*/
public class aufgabe_3
{
    public static void main(String[] args)
    {
        ArrayList<String[]> arrayList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        String deutsch;
        String english;

        while (true)
        {
            System.out.print("Geben Sie bitte ein Wort auf Deutsch ein: ");
            deutsch = scanner.nextLine();
            System.out.print("und geben Sie dessen Übersetzung ein: ");
            english = scanner.nextLine();

            String[] arr = new String[2];
            arr[0] = deutsch;
            arr[1] = english;

            arrayList.add(arr);

            for (String[] s : arrayList)
            {
                System.out.println(s[0] + " - " + s[1]);
            }

        }

    }
}
