package Aufgaben;
/* Aufgabe_2
 * Erstellen Sie die Klasse "Song" mit den Attributen
 * String "titel", int "dauerSekunden", String "interpret".
 * Überschreiben Sie die toString()-Methode, welche einen String bestehend aus Titel, Interpret und der Dauer im Format Minuten : Sekunden zurückgeben soll.
 * Über einen Konstruktor sollen die Attribute initialisiert werden.
 *
 * Erstellen Sie in der Main einen Song geben Sie die gespeicherten Informationen mithilfe der toString()-Methode aus.
 */
class Song
{
    private String titel;
    private int dauerSekunde;
    private String interpret;

    @Override
    public String toString()
    {
       return titel + " " + (dauerSekunde/60) + ":" + (dauerSekunde%10) + " " + interpret;
    }

    public Song(String titel, int dauerSekunde, String interpret)
    {
        this.titel = titel;
        this.dauerSekunde = dauerSekunde;
        this.interpret = interpret;
    }

}
public class aufgabe_2
{
    public static void main(String[] args)
    {
        Song song = new Song("neu", 234, "Hans");

        System.out.println(song.toString());
    }
}
