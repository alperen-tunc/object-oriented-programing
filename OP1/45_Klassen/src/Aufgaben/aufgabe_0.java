package Aufgaben;
/* Aufgabe 0 (Basics)
 * Erstellen Sie die Klasse "Song" mit den Attributen
 * string "titel", int "dauerSekunden", string "interpret"
 * passenden Getter und Setter für die Attribute
 * und der Methode "spielen", die auf der Konsole alle Informationen über den Song ausgibt (die Dauer dabei in Minuten und Sekunden, z.B. 03:35).
 *
 * Erstellen Sie in der Main einen Song und rufen Sie die Methode auf.
 * Erstellen Sie außerdem ein UML Klassendiagramm für die Klasse "Song".
 */

class Song
{
    private String titel;
    private int dauerSekunden;
    private String interpret;

    public String getTitel()
    {
        return titel;
    }

    public void setTitel(String titel)
    {
        this.titel = titel;
    }

    public String getInterpret()
    {
        return interpret;
    }

    public void setInterpret(String interpret)
    {
        this.interpret = interpret;
    }

    public int getDauerSekunden()
    {
        return dauerSekunden;
    }

    public void setDauerSekunden(int dauerSekunden)
    {
        this.dauerSekunden = dauerSekunden;
    }

    public String getDauer()
    {
        String dauer = String.format("%s:%s",dauerSekunden/60, dauerSekunden%60);
        return dauer;
    }

    public void spielen()
    {
        System.out.printf("Song: %s - dauer: %s - interpret: %s", titel, getDauer(), interpret);
    }
}

public class aufgabe_0
{
    public static void main(String[] args)
    {
        Song song = new Song();
        song.setDauerSekunden(250);
        song.setInterpret("Me");
        song.setTitel("WarAlleinEinmal");
        song.spielen();
    }

}
