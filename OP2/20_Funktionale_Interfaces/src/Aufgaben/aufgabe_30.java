package Aufgaben;
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
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class aufgabe_30
{
    public static void main(String[] args)
    {
        List<String> strings = new ArrayList<>(List.of("Tee", "Auto", "Gitarre", "Abrakadabra", "C# ist die beste " + "OOP-Programmiersprache"));

        strings.forEach(System.out::println);

        System.out.println();
        int rückgabeVonMethode = meinRemoveAll(strings, s -> s.length()<15);
        System.out.println();

        System.out.println(rückgabeVonMethode + " Elemente wird entfernt");
        System.out.println("Die folgende parametern sind übrig geblieben: ");
        strings.forEach(System.out::println);


    }

    public static Integer meinRemoveAll(List<String> arr, Predicate<String> stringPredicate)
    {
        int anzahl=0;

        for (int i=0; i<arr.size(); i++)
        {
            if (stringPredicate.test(arr.get(i)))
            {
                System.out.println(arr.get(i) + " wird entfernt.");
                arr.remove(arr.get(i));
                anzahl++;
                i--;
            }
        }
        return anzahl;
    }
}