package aufgaben.aufgabe_2;

import java.sql.Date;

public class Person
{
    private long id;
    private String vorname;
    private String nachname;
    private java.sql.Date geburtsdatum;
    private PersonalAusweis personalAusweis;

    public Person()
    {

    }

    public Person(long id, String vorname, String nachname, Date geburtsdatum, PersonalAusweis personalAusweis)
    {
        this.id = id;
        this.vorname = vorname;
        this.nachname = nachname;
        this.geburtsdatum = geburtsdatum;
        this.personalAusweis = personalAusweis;
    }

    public Person(long id, String vorname, String nachname, Date geburtsdatum)
    {
        this.id = id;
        this.vorname = vorname;
        this.nachname = nachname;
        this.geburtsdatum = geburtsdatum;
    }

    public PersonalAusweis getPersonalAusweis()
    {
        return personalAusweis;
    }

    public void setPersonalAusweis(PersonalAusweis personalAusweis)
    {
        this.personalAusweis = personalAusweis;
    }

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

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

    public Date getGeburtsdatum()
    {
        return geburtsdatum;
    }

    public void setGeburtsdatum(Date geburtsdatum)
    {
        this.geburtsdatum = geburtsdatum;
    }

    @Override
    public String toString()
    {
        return "Person{" +
                "id=" + id +
                ", vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", geburtsdatum=" + geburtsdatum + ", " + personalAusweis.toString() +
                '}';
    }
}
