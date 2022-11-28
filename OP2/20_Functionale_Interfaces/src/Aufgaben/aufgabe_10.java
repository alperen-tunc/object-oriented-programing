package Aufgaben;

import java.util.function.Consumer;

/*  Aufgabe 1-1
 *  - Erstellen Sie das funktionale Interface "Ausgabe" mit der void "ausgeben(String[] daten)"-Methode
 *  - Erstellen Sie die drei void Methoden bildschirm, datei und datenbank mit String[]-Parameter passend zum Interface
 *  - Die drei Methoden sollen jeden String im Array testweise auf der Konsole ausgeben wobei
 *      die Methoden zur Unterscheidung auch das Ziel der Ausgabe mit ausgeben sollen
 *      z.B. System.out.printf("Schreibe %s in die Datenbank...%n", d);
 *  - Testen Sie die Methoden und das Interface im Main, indem Sie dort ein String Array anlegen,
 *      dem Interface die Methoden zuweisen (als Array z.B.) und aufrufen.
 *
 *  Aufgabe 1-2
 *  Modifizieren Sie das Programm so, dass anstelle des eigenen Interfaces "Ausgabe", das in Java bereits vorhandene Interface "Consumer" verwendet wird.
 */
public class aufgabe_10
{
    public static void main(String[] args)
    {
        String[] arr = {"Alperen", "Timo", "Anton", "Thomas"};

        bildschrim(arr);
        datei(arr);
        datenbank(arr);

        System.out.println();
        Ausgabe[] arrAusgabe = new Ausgabe[] { aufgabe_10::bildschrim, aufgabe_10::datei, aufgabe_10::datenbank};

        for (Ausgabe a : arrAusgabe)
        {
            a.ausgeben(arr);
        }
        System.out.println();
        Consumer<String[]> ausgabeConsumer = aufgabe_10::bildschrim;
        ausgabeConsumer = ausgabeConsumer.andThen(aufgabe_10::datei);
        ausgabeConsumer = ausgabeConsumer.andThen(aufgabe_10::datenbank);

        ausgabeConsumer.accept(arr);
        System.out.println();

        System.out.println("In meinen Gedanken: ");
        Ausgabe[] ausgaben = new Ausgabe[] {
                (s) ->{ for(String a : s )
                {
                    System.out.println("Bildschrim: " + a);
                } }
                ,
                (s) ->{ for(String a : s )
                {
                    System.out.println("Datei: " + a);
                } }
        };

        for (Ausgabe a : ausgaben)
        {
            a.ausgeben(arr);
        }

        System.out.println("\nfuer Alles: ");
        fuerAlles(arr, aufgabe_10::bildschrim);

        System.out.println();
        fuerAlles(arr,
                    (String[] s) ->
                    {
                            for(String a: s)
                                System.out.println("Auf dem bildschrim: " + a);
                    }
                );

        System.out.println("\nAus Gedanke her: ");
        Consumer<String[]> consumerString = (String[] s) ->
                        {
                            for(String a: s)
                                System.out.println("Auf dem bildschrim: " + a);
                        };

        consumerString = consumerString.andThen((String[] s) ->
        {
            for(String a: s)
                System.out.println("In der Datei: " + a);
        });

        consumerString = consumerString.andThen((String[] s) ->
        {
            for(String a: s)
                System.out.println("Bei der Datenbank: " + a);
        });

        consumerString.accept(arr);

    } // End of main.
    
    static void fuerAlles(String[] arr, Ausgabe a)
    {
            a.ausgeben(arr);
    }

    static void bildschrim(String[] arr)
    {
        for (String s : arr)
        {
            System.out.println("Bildschrim: " + s);
        }
    }

    static void datei(String[] arr)
    {
        for (String s : arr)
        {
            System.out.println("Datei: " + s);
        }
    }

    static void datenbank(String[] arr)
    {
        for (String s : arr)
        {
            System.out.println("Datenbank: " + s);
        }
    }

    @FunctionalInterface
    interface Ausgabe
    {
        void ausgeben(String[] arr);
    }

}

