package Aufgaben;

import java.util.ArrayList;

/* Aufgabe 0 (Basics)
 * Zwei Klassen:
 *  "Song" mit dem Attribut "titel"
 *  "Interpret" mit dem Attribut "name"
 * Implementieren Sie die Assoziation der beiden Klassen und stellen Sie eine bidirektionale Navigierbarkeit her.
 * Dazu müssen Sie den Klassen weitere Felder hinzufügen.
 * (Gehen Sie davon aus, dass jeder Song nur einen Interpreten, ein Interpret aber mehrere Songs hat)
 * Testen Sie das Programm im Main.
 */
class Song
{
    private String titel;
    private Interpret interpret;

    public void setInterpret(Interpret interpret)
    {
        this.interpret = interpret;
    }

    public Interpret getInterpret()
    {
        return interpret;
    }

    public String getTitel()
    {
        return titel;
    }

    public void setTitel(String titel)
    {
        this.titel = titel;
    }

    public Song(String titel, Interpret interpret)
    {
        this.titel = titel;
        this.interpret = interpret;

        interpret.getSongs().add(this);
    }
}

class Interpret
{
    private String name;
    private ArrayList<Song> songs = new ArrayList<>();

    public ArrayList<Song> getSongs()
    {
        return songs;
    }

    public void setSongs(ArrayList<Song> songs)
    {
        this.songs = songs;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Interpret(String name)
    {
        this.name = name;
    }
}

public class aufgabe_0
{
    public static void main(String[] args)
    {
        Interpret i1 = new Interpret("Henry");
        Song s1 = new Song("Erste", i1);
        Song s2 = new Song("zweite", i1);
        Song s3 = new Song("Dritte", i1);

        for (Song s : i1.getSongs())
        {
            System.out.println(s.getTitel() + " " + s.getInterpret().getName());
        }
    }
}
