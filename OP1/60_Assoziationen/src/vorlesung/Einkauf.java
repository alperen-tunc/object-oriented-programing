package assoziationen.vorlesung;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Einkauf
{
    // Wir speichern alle Einkäufe in einer statischen Liste, damit wir sie bequem iterieren und ausgeben können.
    public static final ArrayList<Einkauf> einkaufListe = new ArrayList<>();

    private final int id;
    private final LocalDateTime datum;
    private final Person käufer; // Der Einkauf besteht aus einem Käufer
    private final Produkt ware; // ... und einer Ware. Damit setzt sich ein Einkauf aus Person und Produkt zusammen → Aggregation!

    public int getId()
    {
        return id;
    }

    public LocalDateTime getDatum()
    {
        return datum;
    }

    public Person getKäufer()
    {
        return käufer;
    }

    public Produkt getWare()
    {
        return ware;
    }


    public Einkauf(int id, LocalDateTime datum, Person käufer, Produkt ware)
    {
        this.id = id;
        this.datum = datum;
        this.käufer = käufer;
        this.ware = ware;

        einkaufListe.add(this); // Den Einkauf der Liste hinzufügen.
    }
}
