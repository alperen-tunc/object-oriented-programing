package Aufgaben;
/*
Schreiben Sie bitte ein Java-Programm, das
a) eine Integer-Variable g einführt, die für alle Funktionen in der Klasse 'Program' gültig ist
b) eine Integer-Variable l einführt, die nur im Main gültig ist
c) eine Funktion besitzt, die im Main aufgerufen werden kann und g-mal "Hallo" auf der Konsole ausgibt
d) im Main l-mal "Welt" auf der Konsole ausgibt
e) zur Kontrolle im Main die beiden Werte g und l auf der Konsole ausgibt

*/

import java.util.Scanner;

public class Aufgabe_03
{
    static int g;

    static void g_mal_hallo()
    {
        for (int i=0; i<g; i++) System.out.println("Hallo");
    }

    public static void main(String[] args)
    {
        int l;

        Scanner eingabe = new Scanner(System.in);

        System.out.println("Geben Sie bitte ein, wie viel mal ein 'Hallo' ausgegeben werden soll: ");
        g = eingabe.nextInt();

        System.out.println("Geben Sie bitte ein, wie viel mal ein 'Welt!' ausgegeben werden soll: ");
        l = eingabe.nextInt();

        System.out.println("\n");
        g_mal_hallo();

        for (int i=0; i<l; i++) System.out.println("Welt!");
    }
}
