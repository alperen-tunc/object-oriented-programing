package _01_Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String vorname;
    private String nachname;

    public Person(String vorname, String nachname)
    {
        this.vorname = vorname;
        this.nachname = nachname;
    }
    // Konstruktoren

    public Person() { }

    public Person( Long id, String vorname, String nachname ) {
        this.id = id;
        this.vorname = vorname;
        this.nachname = nachname;
    }
    // Getter- und Setter-Methoden
    public Long getId() {
        return id;
    }

    public void setId( Long id ) {
        this.id = id;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname( String vorname ) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname( String nachname ) {
        this.nachname = nachname;
    }
    // equals() / hashCode()

    @Override
    public boolean equals( Object o ) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return Objects.equals(id, person.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    // toString()
    @Override
    public String toString() {
        return String.format("(%d) - %s %s", id, vorname, nachname);
    }

}