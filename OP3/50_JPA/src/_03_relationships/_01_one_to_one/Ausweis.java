package _03_relationships._01_one_to_one;


import jakarta.persistence.*;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Objects;

import static util.DateUtil.de;

@Entity
public class Ausweis {
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "myGen")
    //@SequenceGenerator(name = "myGen",sequenceName = "ausweis_seq",
    //                   initialValue = 501, allocationSize = 10 )
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    private String nummer;
    private LocalDate ausgestellt;
    private LocalDate gültig;

    // ==================== FK ist AUSWEIS_ID in PERSON ==============================
    @OneToOne(fetch = FetchType.EAGER, mappedBy = "pa")
    private Person person;
    // ===============================================================================

    public Person getPerson() {
        return person;
    }

    public void setPerson( Person person ) {
        this.person = person;
    }

    public Ausweis() {
    }

    public Ausweis( String nummer, LocalDate ausgestellt, LocalDate gültig ) {
        this.nummer = nummer;
        this.ausgestellt = ausgestellt;
        this.gültig = gültig;
    }

    public Ausweis( Long id, String nummer,
                    LocalDate ausgestellt, LocalDate gültig ) {
        this.id = id;
        this.nummer = nummer;
        this.ausgestellt = ausgestellt;
        this.gültig = gültig;
    }

    public Ausweis( Long id, String nummer, Date ausgestellt, Date gültig ) {
        this(id, nummer, ausgestellt == null ? null:ausgestellt.toLocalDate(),
                gültig == null ? null: gültig.toLocalDate());
    }

    public Long getId() {
        return id;
    }

    public void setId( Long id ) {
        this.id = id;
    }

    public String getNummer() {
        return nummer;
    }

    public void setNummer( String nummer ) {
        this.nummer = nummer;
    }

    public LocalDate getAusgestellt() {
        return ausgestellt;
    }

    public void setAusgestellt( LocalDate ausgestellt ) {
        this.ausgestellt = ausgestellt;
    }

    public LocalDate getGültig() {
        return gültig;
    }

    public void setGültig( LocalDate gültig ) {
        this.gültig = gültig;
    }

    @Override
    public boolean equals( Object o ) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ausweis that = (Ausweis) o;

        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    //@Override
    //public String toString() {
    //  final StringBuilder sb = new StringBuilder("PersonalAusweis{");
    //  sb.append("id=")
    //    .append(id);
    //  sb.append(", nummer='")
    //    .append(nummer)
    //    .append('\'');
    //  sb.append(", ausgestellt=")
    //    .append(ausgestellt);
    //  sb.append(", gültig=")
    //    .append(gültig);
    //  sb.append('}');
    //  return sb.toString();
    //}



    @Override
    public String toString() {
        return String.format("(%d) - %s - Ausgestellt am: %s - Gültig bis: %s",
                id, nummer, de(ausgestellt), de(gültig));
    }
}

