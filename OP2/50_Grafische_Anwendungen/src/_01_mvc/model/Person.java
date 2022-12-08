package _01_mvc.model;

public class Person
{
    private int id;
    private String vorname;
    private String nachname;

    public Person( String vorname, String nachname ) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public Person( int id, String vorname, String nachname ) {
        this.id = id;
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public Person setVorname( String vorname ) {
        this.vorname = vorname;
        return this;
    }

    public String getNachname() {
        return nachname;
    }

    public Person setNachname( String nachname ) {
        this.nachname = nachname;
        return this;
    }

    @Override
    public boolean equals( Object o ) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return id == person.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("(%d) - %s %s", id, vorname, nachname);
    }

}
