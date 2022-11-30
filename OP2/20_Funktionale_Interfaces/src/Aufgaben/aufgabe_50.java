package Aufgaben;

import java.util.*;

/* Klasse Kunde mit:
 *  einer statischen Liste aller Kunden
 *  einer Integer kundennummer
 *  einem String name
 *  und einem Konstruktor, welcher die Eigenschaften füllt und den Kunden der Liste hinzufügt.
 *
 * In der Main:
 *  Eine Schleife, die 10 Mal eine Zufallszahl zwischen 1 und inklusive 10 ermittelt,
 *  prüft, ob es bereits einen Kunden mit dieser Zufallszahl als kundennummer gibt
 *  und wenn nicht, einen Kunden mit dieser kundennummer erstellt.
 *  Wie der name erzeugt wird, ist egal.
 *
 *  Um herauszufinden, ob es bereits Kunden mit der kundennummer gibt, kann die .stream().noneMatch() Methode der KundeListe aufgerufen werden.
 *  Diese Methode hat ein funktionales Interface vom Typ Predicate als Parameter. Hier übergeben Sie eine passende Lambda-Expression.
 *
 *  Anschließend geben Sie die KundeListe mit der ForEach()-Methode aus. Die ForEach()-Methode hat einen Consumer-Parameter. Hier übergeben Sie eine passende Lambda-Expression für die Konsolen-ausgaben.
 *
 *  Nun lassen Sie die Liste nach kundennummer sortieren. Dafür nutzen Sie die sort()-Methode der Liste. Für diese Methode kann in Kunde entweder das IComparable implementiert werden oder Sie verwenden Collections.sort().
 *
 *  Zum Schluss wird die sortierte Liste ausgegeben.
 *
 */
class Kunde //implements Comparable<Kunde>
{
    public static List<Kunde> kunden = new ArrayList<>();
    private int kundenNummer;
    private String name;

    public int getKundenNummer()
    {
        return kundenNummer;
    }

    public static List<Kunde> getKunden()
    {
        return kunden;
    }

    public String getName()
    {
        return name;
    }

    public Kunde(int kundenNummer, String name)
    {
        this.kundenNummer = kundenNummer;
        this.name = name;
        kunden.add(this);
    }
}

public class aufgabe_50
{
    public static void main(String[] args)
    {
        kundeErstellen();


        Kunde.kunden.forEach(s -> System.out.println(s.getName() + " " + s.getKundenNummer()));
        System.out.println();

        // Nach kundennummer sortieren
        Kunde.kunden.sort(Comparator.comparingInt(Kunde::getKundenNummer));
        Kunde.kunden.forEach(s -> System.out.println(s.getName() + " " + s.getKundenNummer()));


        // Sort ausführlich:
        /*Kunde.kundeListe.sort((Kunde x, Kunde y) ->
        {
            if (x.getKundennummer() > y.getKundennummer())
                return 1;
            else if (x.getKundennummer() == y.getKundennummer())
                return 0;
            else
                return -1;
        });*/


        System.out.println("\nEnd of Main");
    }

    static void kundeErstellen()
    {
        Random rand = new Random();

        for (int i = 0; i < 10; i++)
        {
            int nummer1 = rand.nextInt(10) + 1;

            if (Kunde.kunden.stream().noneMatch(x -> x.getKundenNummer() == nummer1))
                new Kunde(nummer1, "Kunde" + i); // neuen Kunden mit der Nummer erzeugen
        }

    }
}
