package _03_relationships._01_one_to_one;


import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    private String vorname;
    private String nachname;

    // ==================== FK ist AUSWEIS_ID in PERSON ==============================
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "AUSWEIS_ID", referencedColumnName = "ID")
    private Ausweis pa;
    // ===============================================================================

    public Person() {
    }

    public Person( String vorname, String nachname ) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public Person( Long id, String vorname, String nachname ) {
        this.id = id;
        this.vorname = vorname;
        this.nachname = nachname;
    }

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

    public Ausweis getPersonalAusweis() {
        return pa;
    }

    public void setPersonalAusweis( Ausweis pa ) {
        this.pa = pa;
    }

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

    //@Override
    //public String toString() {
    //  final StringBuilder sb = new StringBuilder("Person{");
    //  sb.append("id=")
    //    .append(id);
    //  sb.append(", vorname='")
    //    .append(vorname)
    //    .append('\'');
    //  sb.append(", nachname='")
    //    .append(nachname)
    //    .append('\'');
    //  sb.append('}');
    //  return sb.toString();
    //}

    @Override
    public String toString() {
        return String.format("(%d) - %s %s", id, vorname, nachname);
    }

    public void printInfo() {
        System.out.println(this); // this.toString()
        System.out.println("Personalausweis: " + pa);
        System.out.println("========================");
    }

}

