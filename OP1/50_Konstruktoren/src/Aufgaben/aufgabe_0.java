package Aufgaben;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.Scanner;

/* Aufgabe 0
 * Erstellen Sie die Klasse "Song" mit den Attributen
 * string "titel", int "dauerSekunden", string "interpret"
 * passenden Getter und Setter für die Attribute
 * und der Methode "spielen", die auf der Konsole alle Informationen über den Song ausgibt (die Dauer dabei in Minuten und Sekunden, z.B. 03:35).
 *
 * Über einen Konstruktor sollen die Attribute initialisiert werden.
 *
 * Erstellen Sie in der Main einen Song und rufen Sie die Methode auf.
 */
class Song
{
    private String titel;
    private int dauerSekunde;
    private String interpret;

    public String getTitel()
    {
        return titel;
    }

    public void setTitel(String titel)
    {
        this.titel = titel;
    }

    public int getDauerSekunde()
    {
        return dauerSekunde;
    }

    public void setDauerSekunde(int dauerSekunde)
    {
        this.dauerSekunde = dauerSekunde;
    }

    public String getInterpret()
    {
        return interpret;
    }

    public void setInterpret(String interpret)
    {
        this.interpret = interpret;
    }

    public void spielen()
    {
        System.out.println("Name: " + getTitel() + "\nInterpret: " + getInterpret() + "\nDauer: " + getDauerSekunde()/60 + ":" + getDauerSekunde()%60);
    }

    public Song(String titel, int dauerSekunde, String interpret)
    {
        this.titel = titel;
        this.interpret = interpret;
        this.dauerSekunde = dauerSekunde;
    }

    public Song(int dauerSekunde, String titel, String interpret)
    {
        this(titel, dauerSekunde, interpret);
    }

    public Song(String interpret, String titel, int dauerSekunde)
    {
        this(titel, dauerSekunde, interpret);
    }

    public Song()
    {

    }

    public Song(String titel)
    {
        this.titel = titel;
    }

}

public class aufgabe_0
{
    public static void main(String[] args)
    {
        Song song = new Song("raki", 220, "zakkum");
        song.spielen();
        System.out.println();

        Song song2 = new Song("zakkum", 222, "Dünya"); // wie kann ich Rheinfolge ändern?
        song2.spielen();

        Song song3 = new Song(222, "Zakkum", "Yalan");
        song3.spielen();
        System.out.println();

        Song song4 = new Song();

        song4 = new Song("mein");
        song4.spielen();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie bitte Name von Interpreter ein: ");

        song.setInterpret(scanner.nextLine());
        System.out.println("Scanner Interpret: " + song.getInterpret());

        Song song5 = new Song();






    }


}
