package Aufgaben;

import java.util.ArrayList;

/*
    Führen Sie bitte zunächst die folgenden Klassen ein:
        Tier
            Attribute: art und name
        Futter
            Attribute: bezeichnung und kalorien
        Fütterung
            Attribute: static-Liste vom Typ Fütterung, in der alle Fütterungen gespeichert werden
            mengeInKg, tier und futter

    Führen Sie bitte die folgenden Objekte ein: (Attributwerte, die im folgenden nicht mitgeteilt werden, können von Ihnen frei gewählt werden)
        Tier
            Blacky
            Lassie
        Futter
            Trockenfutter
            Heu
            Fleisch

     Es gelten die folgenden Assoziationen:
        Trockenfutter darf an Blacky (Pferd) und Lassie (Hund) verfüttert werden
        Heu nur an das Pferd
        Fleisch nur an den Hund

    Für die Klasse Fütterung wird ferner verlangt:
        In Fütterung ist ein Konstruktor implementiert, für den gilt:
        1) alle Attributwerte werden durch die Übergabewerte des Konstruktors gefüllt
        2) die Fütterungsliste wird durch das neue (also gerade vom Konstruktor erzeugte) Objekt ergänzt

    Lassen Sie bitte anschließend im Main (mindestens) die beiden folgenden Kontrollausgaben ausführen:
        a) Alle Futtersorten von Blacky
        b) Alle Tiere an die Trockenfutter verfüttert wurde/wird
*/
public class aufgabe_5
{
    public static void main(String[] args)
    {
        Tier1 t11 = new Tier1("Pferd", "Blacky");
        Tier1 t12 = new Tier1("Hund", "Lassie");

        Futter f1 = new Futter("Trockenfutter", 305);
        Futter f2 = new Futter("Heu", 204);
        Futter f3 = new Futter("Fleisch", 350);

        new Fütterung(3, t11, f1);
        new Fütterung(2, t11, f2);
        new Fütterung(2, t12, f2);
        new Fütterung(1, t12, f3);

        for(Fütterung f : Fütterung.fütterungs)
        {
            if(f.getTier1().getName().equalsIgnoreCase("Blacky"))
            {
                System.out.println("Futter von " + f.getTier1().getName() + " " + f.getFutter().getBezeichnung());
            }
        }

        System.out.println();
        for (Fütterung f : Fütterung.fütterungs)
        {
            if(f.getFutter().getBezeichnung().equalsIgnoreCase("Trockenfutter"))
            {
                System.out.println("Das Tier: " + f.getTier1().getArt() + " " + f.getTier1().getName());
            }
        }


    }
}
class Tier1
{
    private final String art;
    private final String name;

    public String getArt()
    {
        return art;
    }

    public String getName()
    {
        return name;
    }

    public Tier1(String art, String name)
    {
        this.art = art;
        this.name = name;
    }
}
class Futter
{
    private final String bezeichnung;
    private final double kalorien;

    public String getBezeichnung()
    {
        return bezeichnung;
    }

    public double getKalorien()
    {
        return kalorien;
    }

    public Futter(String bezeichnung, double kalorien)
    {
        this.bezeichnung = bezeichnung;
        this.kalorien = kalorien;
    }
}
class Fütterung
{
    public static ArrayList<Fütterung> fütterungs = new ArrayList<>();
    private final double mengeInKg;
    private final Tier1 tier1;
    private final Futter futter;

    public static ArrayList<Fütterung> getFütterungs()
    {
        return fütterungs;
    }

    public double getMengeInKg()
    {
        return mengeInKg;
    }

    public Tier1 getTier1()
    {
        return tier1;
    }

    public Futter getFutter()
    {
        return futter;
    }

    public Fütterung(double mengeInKg, Tier1 tier1, Futter futter)
    {

        this.mengeInKg = mengeInKg;
        this.futter = futter;
        this.tier1 = tier1;

        fütterungs.add(this);
    }

}

