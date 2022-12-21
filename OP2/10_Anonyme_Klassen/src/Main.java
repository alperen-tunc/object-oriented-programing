import java.util.Objects;

public class Main
{
    public static void main(String[] args)
    {
        // HashCode selbsExperiment
        Katze katze = new Katze("Kiti", 6, 12);
        Katze katze2 = new Katze("Kiti", 6, 12);
        System.out.println(katze.hashCode() + "\n" + katze2.hashCode());

    }
}

class Katze
{
    private String name;
    private int alter;
    private int groesse;

    public Katze(String name, int alter, int groesse)
    {
        this.name = name;
        this.alter = alter;
        this.groesse = groesse;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name, alter, groesse);
    }
}