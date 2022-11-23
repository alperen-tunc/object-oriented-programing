package Aufgaben;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/*
    Die 21 gewinnt!
    Schreiben Sie ein Java-Programm, um illegales Glücksspiel zu betreiben.

    Dazu brauchen Sie ein Enum, mit dem Sie die einzelnen Kartentypen darstellen können.
    Folgende Karten und Werte gibt es:
    ASS(11), KÖNIG(10), DAME(10), BUBE(10), ZEHN(10), NEUN(9), ACHT(8), SIEBEN(7), SECHS(6), FÜNF(5), VIER(4), DREI(3), ZWEI(2)

    Außerdem benötigen Sie drei Listen:
    - Eine Liste mit allen Karten des Decks. Ein Kartendeck hat 52 Karten, von jeder Sorte befinden sich 4 Karten im Deck (also 4x Ass, 4x König, 4x Dame, etc)
    - Eine Liste mit den Karten der Hand des Spielers.
    - Eine Liste mit den Karten der Hand der Bank.

    Schreiben Sie eine Methode, die aus den vorhandenen Enum-Werten das Deck befüllt.
    Schreiben Sie eine Methode, mit der aus dem Deck in eine übergebene Hand eine zufällig ausgewählte Karte gezogen wird.
        Diese Methode wird aufgerufen, wenn ein Spieler eine Karte zieht und auch wenn die Bank eine Karte zieht.
    Schreiben Sie eine Methode, um die Punkte einer übergebenen Hand zu berechnen. Die Punkte werden von der Methode zurückgegeben.
        Diese Methode wird aufgerufen, um die Punkte eines Spielers und auch die der Bank zu berechnen.

    Zu Beginn des Spiels zieht ein Spieler zwei Karten. Es werden die Karten ausgegeben und die Punkte berechnet.
    Ergeben die Karten genau 21, ist das Spiel sofort gewonnen.
    Sonst kann ein Spieler weitere Karten ziehen, bis die 21 erreicht oder überschritten sind.
    Ergeben die Karten mehr als 21 Punkte, ist das Spiel sofort verloren.

    Liegen die Punkte unter 21 und möchte ein Spieler keine weiteren Karten ziehen, dann zieht die Bank drei Karten.
    Hat ein Spieler mehr Punkte als die Bank, oder hat die Bank mehr als 21 Punkte, ist das Spiel gewonnen.
    Bei einem gleichen Punktestand ist das Spiel unentschieden.
    Hat die Bank 21 Punkte oder mehr als ein Spieler (aber nicht über 21), ist das Spiel verloren.

    (OPTIONAL: Das ASS kann eigentlich zwei Werte annehmen. Entweder die 11 oder die 1, je nachdem was für einen Spieler besser ist.)
    (OPTIONAL: Stack anstatt Listen, Shuffle anstatt zufälliges Entnehmen)
 */
public class aufgabe_3
{
    enum Karte
    {
        ASS(11), KÖNIG(10), DAME(10), BUBE(10), ZEHN(10), NEUN(9),
        ACHT(8), SIEBEN(7), SECHS(6), FÜNF(5), VIER(4),
        DREI(3), ZWEI(2);

        private final int zahlderKarte;

        public int getZahlderKarte()
        {
            return zahlderKarte;
        }
        private Karte(int zahlderKarte)
        {
            this.zahlderKarte = zahlderKarte;
        }
    }

    static ArrayList<Karte> deck = new ArrayList<>();
    static ArrayList<Karte> hand = new ArrayList<>();
    static ArrayList<Karte> bank = new ArrayList<>();

    public static void main(String[] args)
    {
        fülleDecks();
        int zahlHand;
        int zahlBank;
        String antwort;
        Scanner scanner = new Scanner(System.in);

        do
        {
            for (int i=0; i<2 ; i++)
            {
                kartZiehenHand();
            }
            zahlHand = berechnungHand();
            System.out.println(hand + " Summe: " + zahlHand);

            if(zahlHand > 21)
            {
                System.out.println("Sie haben verloren");
                break;
            }
            else if (zahlHand == 21)
            {
                System.out.println("Sie haben gewonnen!!");
                break;
            }
            else
            {
                System.out.println("Möchten Sie eine weitere Karte ziehen?");
                antwort = scanner.nextLine();

                if (antwort.equalsIgnoreCase("ja"))
                {
                    kartZiehenHand();
                }
                System.out.println("Meine Karte: " + hand);

                for (int i=0; i<3 ; i++)
                {
                    kartZiehenBank();
                }
                System.out.println("Karte von Bank: " + bank);

                zahlHand = berechnungHand();
                zahlBank = berechnungBank();

                System.out.println("Bank Summe: " + zahlBank + " - mein Summe: " + zahlHand);
                if(zahlBank < zahlHand || zahlBank > 21)
                {
                    System.out.println("Sie haben das Spiel gewonnen!");
                    break;
                }
                else if (zahlHand == zahlBank)
                {
                    System.out.println("Unentschieden!!");
                    break;
                }
                else
                {
                    System.out.println("Bank hat gewonnen!!");
                    break;
                }
            }
        }
        while (true);

        System.out.println("DANKE FÜRS SPIEL!");


    } // Hier endet Main**************

    static int berechnungHand()
    {
        int summe=0;

        Karte[] karten = Karte.values();
        for (int i=0; i< hand.size(); i++)
        {
           for (Karte k : karten)
               if(hand.get(i).equals(k))
               {
                   summe += k.zahlderKarte;
               }
        }
        return summe;
    }

    static int berechnungBank()
    {
        int summe=0;

        Karte[] karten = Karte.values();
        for (int i=0; i< bank.size(); i++)
        {
            for (Karte k : karten)
                if(bank.get(i).equals(k))
                {
                    summe += k.zahlderKarte;
                }
        }
        return summe;
    }

    static void fülleDecks()
    {
        Karte[] karten = Karte.values();
        for (Karte k : karten)
        {
            for (int i=0; i<4 ; i++)
            {
                deck.add(k);
            }
        }
    }

    static void kartZiehenHand()
    {
        Random random = ThreadLocalRandom.current();
        int randomZahl = random.nextInt(10) + 2;

        for (Karte k : Karte.values())
        {
            if (k.zahlderKarte == randomZahl)
            {
                hand.add(k);
                deck.remove(k);
                break;
            }
        }
    }
    static void kartZiehenBank()
    {
        Random random = ThreadLocalRandom.current();
        int randomZahl = random.nextInt(10) + 2;

        for (Karte k : Karte.values())
        {
            if (k.zahlderKarte == randomZahl)
            {
                bank.add(k);
                deck.remove(k);
                break;
            }
        }
    }
}
