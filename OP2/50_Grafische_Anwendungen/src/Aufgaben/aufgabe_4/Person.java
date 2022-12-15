package Aufgaben.aufgabe_4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

enum Krankenversicherung
{
    GESETZLICH, PRIVAT
}

enum FamilienStatus
{
    LEDIG, VERHEIRATET, GESCHIEDEN, GETRENNTLEBEND
}

enum Programmiersprachen
{
    JAVA, CSHARP, CPLUSPLUS, PHP, ANDERE
}

public class Person
{
    private String vorname;
    private String nachname;
    private LocalDate Geburtsdatum;
    private String strasse;
    private String hausnummer;
    private String plz;
    private String ort;

    private int id = 0;

    public Person(String vorname, String nachname, LocalDate geburtsdatum, String strasse, String hausnummer, String plz, String ort)
    {
        this.vorname = vorname;
        this.nachname = nachname;
        Geburtsdatum = geburtsdatum;
        this.strasse = strasse;
        this.hausnummer = hausnummer;
        this.plz = plz;
        this.ort = ort;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public int getId()
    {
        return id;
    }

    public  Person(){ }

    public String getVorname()
    {
        return vorname;
    }

    public void setVorname(String vorname)
    {
        this.vorname = vorname;
    }

    public String getNachname()
    {
        return nachname;
    }

    public void setNachname(String nachname)
    {
        this.nachname = nachname;
    }

    public LocalDate getGeburtsdatum()
    {
        return Geburtsdatum;
    }

    public void setGeburtsdatum(LocalDate geburtsdatum)
    {
        Geburtsdatum = geburtsdatum;
    }

    public String getStrasse()
    {
        return strasse;
    }

    public void setStrasse(String strasse)
    {
        this.strasse = strasse;
    }

    public String getHausnummer()
    {
        return hausnummer;
    }

    public void setHausnummer(String hausnummer)
    {
        this.hausnummer = hausnummer;
    }

    public String getPlz()
    {
        return plz;
    }

    public void setPlz(String plz)
    {
        this.plz = plz;
    }

    public String getOrt()
    {
        return ort;
    }

    public void setOrt(String ort)
    {
        this.ort = ort;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(vorname, person.vorname) && Objects.equals(nachname, person.nachname) && Objects.equals(Geburtsdatum, person.Geburtsdatum) && Objects.equals(strasse, person.strasse) && Objects.equals(hausnummer, person.hausnummer) && Objects.equals(plz, person.plz) && Objects.equals(ort, person.ort);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(vorname, nachname, Geburtsdatum, strasse, hausnummer, plz, ort, id);
    }

    @Override
    public String toString()
    {
        return id + "-) " +  "Person{" + "vorname='" + vorname + '\'' + ", nachname='" + nachname + '\'' + ", " +
            "Geburtsdatum=" + Geburtsdatum + ", strasse='" + strasse + '\'' + ", hausnummer='" + hausnummer + '\'' + ", plz='" + plz + '\'' + ", ort='" + ort + '\'' +  '}';
    }
}
