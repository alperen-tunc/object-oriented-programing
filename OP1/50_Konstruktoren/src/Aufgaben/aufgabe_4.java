package Aufgaben;
/* Das Array "flüge" enthält Flug-Objekte aller Flüge, die auf einer bestimmten Strecke durchgeführt werden.
 * Ein Flug besteht aus id, abflugZeit, ankunftZeit, preis und freiePlätze
 * Das gewünschte Flugdatum und die Anzahl der benötigten Plätze werden einer Methode als Parameter übergeben.
 * Diese Methode soll
 * - aus dem Array die Flug-Objekte derjenigen Flüge auswählen, welche am gewünschten Datum durchgeführt werden
 *      und die benötigten Plätze bieten
 * - die ausgewählten Flug-Objekte in einem neuen Array speichern
 *      Die Flug-Objekte sollen nach Preis aufsteigend sortiert sein
 * - das Array mit den gefundenen Flügen zurückgeben.
 * Ihre Aufgabe ist es nun, die Klasse Flug zu erzeugen, die geforderte Funktion zu implementieren und zu testen.
 * Kommentieren Sie Ihren Code mit Java-Doc-Kommentaren!
 * Diese Aufgabe ist so ähnlich mal in einer Prüfung vorgekommen. Dort wurde nach Pap, Struktogramm oder Pseudocode gefragt
 * Machen Sie sich bei der Lösung der Aufgabe Gedanken zu den drei Darstellungsformen (damit meine ich Pap, Struktogramm und Pseudocode)
 *
 * Verwenden Sie zur Lösung den folgenden Codeausschnitt aus der Main und beachten Sie beim Erstellen des Konstruktors der Klasse Flug die übergebenen Werte:
   Flug.flüge = new Flug[] {
            new Flug("101", LocalDateTime.of(2019, 06, 12, 12, 0, 0), LocalDateTime.of(2019, 06, 12, 18, 20, 0), 1500, 12),
            new Flug("102", LocalDateTime.of(2019, 06, 12, 18, 0, 0), LocalDateTime.of(2019, 06, 13, 0, 0, 0), 1450, 14),
            new Flug("111", LocalDateTime.of(2019, 06, 12, 22, 0, 0), LocalDateTime.of(2019, 06, 13, 4, 0, 0), 1600, 18),
            new Flug("141", LocalDateTime.of(2019, 06, 13, 8, 0, 0), LocalDateTime.of(2019, 06, 13, 14, 0, 0), 1700, 5),
            new Flug("251", LocalDateTime.of(2019, 06, 13, 12, 0, 0), LocalDateTime.of(2019, 06, 13, 18, 0, 0), 1000, 34),
            new Flug("607", LocalDateTime.of(2019, 06, 13, 18, 0, 0), LocalDateTime.of(2019, 06, 14, 0, 0, 0), 1100, 15),
            new Flug("638", LocalDateTime.of(2019, 06, 14, 8, 0, 0), LocalDateTime.of(2019, 06, 14, 14, 0, 0), 1650, 7),
            new Flug("703", LocalDateTime.of(2019, 06, 14, 12, 0, 0), LocalDateTime.of(2019, 06, 14, 18, 0, 0), 1450, 10),
            new Flug("784", LocalDateTime.of(2019, 06, 14, 18, 0, 0), LocalDateTime.of(2019, 06, 15, 0, 0, 0), 1800, 2),
            new Flug("788", LocalDateTime.of(2019, 06, 14, 22, 0, 0), LocalDateTime.of(2019, 06, 15, 4, 0, 0), 1200, 38)
        };
 */
import java.time.LocalDateTime;
import java.util.Arrays;
class Flug
{
    private String  id;
    private LocalDateTime abflugZeit;
    private LocalDateTime ankunftZeit;
    private double preis;
    private int freiePlätze;
    public static Flug[] flüge;
    public Flug(String id, LocalDateTime abflugZeit, LocalDateTime ankunftZeit, double preis, int freiePlätze)
    {
        this.id = id;
        this.abflugZeit = abflugZeit;
        this.ankunftZeit = ankunftZeit;
        this.preis = preis;
        this.freiePlätze = freiePlätze;

    }
    /**
     * Sucht Flüge, welche am angegebenen Datum starten und genug freie Plätze haben-
     * @param datum Das Abflug-Datum.
     * @param benötigtePlätze Benötigte freie Plätze.
     * @return Ein Array mit allen gefundenen Flügen.
     */
    public static Flug[] findeFlüge(LocalDateTime datum, int benötigtePlätze)
    {
        int anzahl = 0;
        Flug[] gefundeneFlüge = new Flug[flüge.length]; // Ein Array groß genug um theoretisch alle Flüge zu erfassen. Alternative: List verwenden.

        for (Flug flug : flüge) // Alle vorhandenen Flüge nach passenden Flügen durchsuchen
        {
            if (flug.freiePlätze >= benötigtePlätze && flug.abflugZeit.toLocalDate().equals(datum.toLocalDate()))
            {
                gefundeneFlüge[anzahl] = flug; // und im großen Array speichern.
                anzahl++;
            }
        }

        // Die gefundenen Flüge werden in ein neues Array kopiert, welches genauso groß ist wie die Anzahl der gefundenen Flüge.
        Flug[] gefundeneFlügeSortiert = Arrays.copyOf(gefundeneFlüge, anzahl);
        sortiereFlüge(gefundeneFlügeSortiert); // Array sortieren.

        return gefundeneFlügeSortiert;
    }

    /**
     * Sortiert Flüge nach Preis aufsteigend.
     */
    public static void sortiereFlüge(Flug[] flüge)
    {
        for (int i = 0; i < flüge.length - 1; i++)
        {
            for (int j = 0; j < flüge.length - 1 - i; j++)
            {
                if (flüge[j].preis > flüge[j + 1].preis)
                {
                    Flug temp = flüge[j];
                    flüge[j] = flüge[j + 1];
                    flüge[j + 1] = temp;
                }
            }
        }
    }

    /**
     * Eine Methode, um Flüge bequem ausgeben zu können.
     * @return Einen String bestehend aus allen Informationen zum Flug.
     */
    public String toString()
    {
        return String.format("Flug: %s - Preis: %,.2f - Abflug: %s - Ankunft: %s", id, preis, abflugZeit, ankunftZeit);
    }


}
public class aufgabe_4
{
    public static void main(String[] args)
    {
        Flug.flüge = new Flug[] {
                new Flug("101", LocalDateTime.of(2019, 06, 12, 12, 0, 0), LocalDateTime.of(2019, 06, 12, 18, 20, 0), 1500, 12),
                new Flug("102", LocalDateTime.of(2019, 06, 12, 18, 0, 0), LocalDateTime.of(2019, 06, 13, 0, 0, 0), 1450, 14),
                new Flug("111", LocalDateTime.of(2019, 06, 12, 22, 0, 0), LocalDateTime.of(2019, 06, 13, 4, 0, 0), 1600, 18),
                new Flug("141", LocalDateTime.of(2019, 06, 13, 8, 0, 0), LocalDateTime.of(2019, 06, 13, 14, 0, 0), 1700, 5),
                new Flug("251", LocalDateTime.of(2019, 06, 13, 12, 0, 0), LocalDateTime.of(2019, 06, 13, 18, 0, 0), 1000, 34),
                new Flug("607", LocalDateTime.of(2019, 06, 13, 18, 0, 0), LocalDateTime.of(2019, 06, 14, 0, 0, 0), 1100, 15),
                new Flug("638", LocalDateTime.of(2019, 06, 14, 8, 0, 0), LocalDateTime.of(2019, 06, 14, 14, 0, 0), 1650, 7),
                new Flug("703", LocalDateTime.of(2019, 06, 14, 12, 0, 0), LocalDateTime.of(2019, 06, 14, 18, 0, 0), 1450, 10),
                new Flug("784", LocalDateTime.of(2019, 06, 14, 18, 0, 0), LocalDateTime.of(2019, 06, 15, 0, 0, 0), 1800, 2),
                new Flug("788", LocalDateTime.of(2019, 06, 14, 22, 0, 0), LocalDateTime.of(2019, 06, 15, 4, 0, 0), 1200, 38)
        };

        Flug[] gefundeneFlüge = Flug.findeFlüge(LocalDateTime.of(2019, 6, 14, 0, 0, 0), 4);

        for (Flug flug : gefundeneFlüge)
        {
            System.out.println(flug.toString());
        }



    }
}
