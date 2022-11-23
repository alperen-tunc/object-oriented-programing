package Aufgaben;

import java.time.LocalDateTime;
import java.util.ArrayList;

/*
 * Sie betreiben eine altmodische Videothek und möchten ein Programm zur Verwaltung der Videos schreiben.
 * In Ihrem Klassenentwurf entscheiden Sie sich für drei Klassen.
 * Ausleihe - Dort wird abgespeichert, welches Video von welchem Kunden an welchem Datum ausgeliehen und wann das Video zurückgebracht wurde.
 * Video - Sie werden erstmal nur mit Titel gespeichert, weitere Informationen werden in dieser Phase des Projektes nicht benötigt.
 * Kunde - Werden zu diesem Zeitpunkt auch nur mit Name gespeichert.
 * Um alle Kunden, Videos und Ausleih-Vorgänge zu speichern, bekommt jede Klasse eine statische Liste, die ihre eigenen Objekt-Referenzen beinhalten.
 * Um ein Video ausleihen und zurückbringen zu können, implementieren Sie entsprechende Methoden in die Klasse Ausleihe. Dabei beachten Sie,
 *  dass jedes Video nur ein mal zu einem bestimmten Zeitpunkt ausgeliehen sein kann, denn jedes Video existiert physisch nur ein mal in Ihrem Bestand.
 * Wird versucht, einen ungültigen Vorgang durchzuführen, wirft die Methode eine Exception.
 * Erstellen Sie dafür eine eigene Exception-Klasse, die von Exception erbt.
 * Um die Informationen zu der Ausleihe bequem ausgeben zu können, überschreiben Sie die toString-Methoden.
 * Sie beachten bei der Entwicklung die Abkapselung und Trennung von Darstellung und Programmlogik.
 * In der Main testen Sie alle Funktionalitäten.
 *
 * Zeichen Sie dazu ein UML Klassendiagramm.
 */
class Ausleihe
{
    public static ArrayList<Ausleihe> ausleiheArrayList = new ArrayList<>();
    private Video video;
    private Kunde kunde;
    private LocalDateTime ausleiheDatum;
    private LocalDateTime rückgabeDatum;

    public Video getVideo()
    {
        return video;
    }

    public Kunde getKunde()
    {
        return kunde;
    }

    public LocalDateTime getAusleiheDatum()
    {
        return ausleiheDatum;
    }

    public LocalDateTime getRückgabeDatum()
    {
        return rückgabeDatum;
    }

    public void setRückgabeDatum(LocalDateTime rückgabeDatum)
    {
        this.rückgabeDatum = rückgabeDatum;
    }

    public boolean ausleihen()
    {
        if (rückgabeDatum.isBefore(ausleiheDatum))
        {
            System.out.println("nicht Vorhanden, Sie können nicht ausleihen");
            return false;
        }
        return true;
    }

    public Ausleihe(Video video, Kunde kunde, LocalDateTime ausleiheDatum)
    {
        this.video = video;
        this.kunde = kunde;
        this.ausleiheDatum = ausleiheDatum;
        ausleiheArrayList.add(this);
    }
}

class Video
{
    public static ArrayList<Video> videos = new ArrayList<>();
    private String titel;

    public String getTitel()
    {
        return titel;
    }

    public Video(String titel)
    {
        this.titel = titel;
        videos.add(this);
    }
}

class Kunde
{
    public static ArrayList<Kunde> kunden = new ArrayList<>();
    private String name;

    public String getName()
    {
        return name;
    }

    public Kunde(String name)
    {
        this.name = name;
        kunden.add(this);
    }
}
public class aufgabe_9
{
    public static void main(String[] args)
    {
        Video v1 = new Video("film");
        Video v2 = new Video("film2");
        Kunde k1 = new Kunde("erste");
        Ausleihe a1 = new Ausleihe(v1, k1, LocalDateTime.of(2019, 11, 28, 14, 33, 48));


        System.out.println(a1.getAusleiheDatum());

        Ausleihe a2 = new Ausleihe(v1, k1, LocalDateTime.of(2020, 11, 28, 14, 33, 48));
        System.out.println(a2.getAusleiheDatum());

    }
}
