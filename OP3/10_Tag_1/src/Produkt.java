import java.util.Objects;


public class Produkt {

    private Long id;

    private String Name;

    private double EuroPreis;

    private Long herstellerId;

    public Produkt() {
    }

    public Produkt( Long id, Long herstellerId, String name, double euroPreis ) {
        this.id = id;
        this.herstellerId = herstellerId;
        Name = name;
        EuroPreis = euroPreis;
    }

    public Long getId() {
        return id;
    }

    public void setId( Long id ) {
        this.id = id;
    }

    public Long getHerstellerId() {
        return herstellerId;
    }

    public void setHerstellerId( Long herstellerId ) {
        this.herstellerId = herstellerId;
    }

    public String getName() {
        return Name;
    }

    public void setName( String name ) {
        Name = name;
    }

    public double getEuroPreis() {
        return EuroPreis;
    }

    public void setEuroPreis( double euroPreis ) {
        EuroPreis = euroPreis;
    }

    @Override
    public boolean equals( Object o ) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Produkt produkt = (Produkt) o;

        return Objects.equals(id, produkt.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return String.format("(%d) - %-25s - %8.2f € - HerstellerId: %d",
                id, Name, EuroPreis, herstellerId);
    }

}