package Aufgaben;
/*
    - Führen Sie bitte zunächst ein funktionales Interface 'PrüfeStrings' ein mit der Methode 'prüfen' (übergabewerte: 2 Strings, Rückgabewert: boolean)
    - Führen Sie bitte ferner die 4 folgenden Methoden ein:
        a) Name:            A_IstLängerAls_B
           Übergabewerte:   2 Strings A und B
           Funktion:        Ermittelt die Länge beider Strings
           Rückgabewert:    true, FALLS A länger als B, SONST false
        b) Name:            A_hatMehrEAls_B
           Übergabewerte:   2 Strings A und B
           Funktion:        Ermittelt die Anzahl der (großen oder kleinen) E´s beider Strings
           Rückgabewert:    true, FALLS A mehr E´s (bzw. e´s) als B hat, SONST false
        c) Name:            Sortiere
           Übergabewerte:   String-Array und ein Delegat vom Typ PrüfeStrings
           Funktion:        Sortiert das Array nach dem Bubblesort-Verfahren bzgl. des übergebenen Delegats [siehe Erläuterung(*)]
           Rückgabewert:    keiner
        d) Name:            Ausgabe
           Übergabewerte:   String-Array
           Funktion:        Konsolenausgabe aller Felder (wählen Sie selbst ein Layout nach ihren Vorlieben :-)
           Rückgabewert:    keiner

    Im Main
       Führen Sie bitte zunächst ein String-Array 'arr' ein, gefüllt mit den folgenden drei Strings:
            "Dampfschifffahrtsgesellschaft", "EDV", "Schneeeule"
       Lassen Sie den aktuellen Inhalt des Arrays bitte auf der Konsole ausgeben
       Führen Sie bitte ferner ein Objekt des Interfaces 'PrüfeStrings' ein und initialisieren dieses mit dem Verweis auf 'A_IstLängerAls_B'
       Rufen Sie anschließend bitte die Methode Sortiere auf (Übergabewerte arr und das Interface-Objekt)
       Lassen Sie bitte erneut den aktuellen Inhalt des Arrays auf der Konsole ausgeben
       Überschreiben Sie daraufhin bitte das Interface-Objekt mit dem Verweis auf ' 'A_hatMehrEAls_B'
       Rufen Sie daraufhin bitte erneut die Methode Sortiere auf
       Lassen Sie bitte auch diesmal den aktuellen Inhalt des Arrays auf der Konsole ausgeben

    (*)ERLÄUTERUNG:
       Beim Bubblesort wird pro Durchlauf der inneren Schleife entschieden, ob für zwei benachbarte Elemente 'A' und 'B' gilt: A>B ...
       ... A>B ist eine Frage der Betrachtung: Es kann alphabetisch gemeint sein, oder bzgl. der Wortlänge, oder der Anzahl der E´s ...
       Genau dies kann durch den übergebenen Delegaten entschieden werden!

*/
public class aufgabe_20
{
    public static void main(String[] args)
    {

    }
}
