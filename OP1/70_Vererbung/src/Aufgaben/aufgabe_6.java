package Aufgaben;

import java.util.ArrayList;
import java.util.Random;
import static Aufgaben.aufgabe_6.umsatz;
/*
    Offene Aufgabenstellung:
        Betrachten Sie bitte zunächst den Screenshot und berücksichtigen hierzu folgende Informationen:
        a) Ein Mitarbeiter erhält ausschließlich ein Grundgehalt (Zufallszahl zwischen 1900 und 2100)
        b) Ein Vorgesetzter erhält ein Grundgehalt (zwischen 3700 und 4300) sowie ein Bonus (zwischen 450 und 550)
        c) Ein Vorstandsvorsitzender erhält ein Grundgehalt (zwischen 7500 und 8500) ein Bonus (2500 bis 3100) + prozentualer Aufschlag (5% bis 15%)
        d) Es gibt 20 Mitarbeiter, 5 Vorgesetzte und 2 Vorstandvorsitzende
        e) Der Umsatz soll frei gewählt werden können
        f) Der Gewinn ergibt sich aus Umsatz - Löhne
    Zielsetzung:
        Entwickeln Sie bitte ein Programm-Design und implementieren Sie dieses, wobei folgende Qualitätsmerkmale angestrebt werden sollen:
        a) Versuchen Sie möglichst viele Felder und Methoden abzukapseln
        b) Bemühen Sie sich bitte um eine konsequente Vererbungshierarchie, um Redundanzen zu vermeiden
        c) Lassen Sie die gesamte Konsolenausgabe durch eine einzige Methode ausgeben
*/
class FirmenMitglied
{
    public static ArrayList<FirmenMitglied> firmenMitglieds = new ArrayList<>();
    private String name;
    private double gehalt;

    public Random rand = new Random();
    public double getGehalt()
    {
        return gehalt;
    }

    public void setGehalt(double gehalt)
    {
        this.gehalt = gehalt;
    }
    public static ArrayList<FirmenMitglied> getFirmenMitglieds()
    {
        return firmenMitglieds;
    }

    public String getName()
    {
        return name;
    }

    public FirmenMitglied(String name)
    {
        this.name = name;
        setGehalt(gehalt);
        firmenMitglieds.add(this);
    }
}

class Mitarbeiter extends FirmenMitglied
{
    private ArrayList<Mitarbeiter> mitarbeiters = new ArrayList<>();

    public void setGehalt(double gehalt)
    {
        super.setGehalt(gehalt);
    }

    public Mitarbeiter(String name)
    {
        super(name);
        //setGehalt(rand.nextDouble(200)+1900);
        mitarbeiters.add(this);
    }
}
class Vorgesetzter extends FirmenMitglied
{
    private ArrayList<Vorgesetzter> vorgesetzters = new ArrayList<>();

    @Override
    public void setGehalt(double gehalt)
    {
        super.setGehalt(gehalt);
    }

    public Vorgesetzter(String name)
    {
        super(name);
        //setGehalt(rand.nextDouble(600)+3700 + rand.nextDouble(100)+450);
        vorgesetzters.add(this);
    }
}

class Vorstandsvorsitzender extends FirmenMitglied
{
    private ArrayList<Vorstandsvorsitzender> vorstandsvorsitzenders = new ArrayList<>();

    @Override
    public void setGehalt(double gehalt)
    {
        super.setGehalt(gehalt);
    }

    public Vorstandsvorsitzender(String name)
    {
        super(name);
        //setGehalt(rand.nextDouble(1000)+7500 + rand.nextDouble(600)+2500 + (rand.nextDouble((umsatz*15/100)-(umsatz*5/100)+(umsatz*5/100))));
        vorstandsvorsitzenders.add(this);
    }
}
public class aufgabe_6
{
    public static double umsatz=10000000;
    public static double Gewinn()
    {
        double summe = 0;
        double gewinn;

        for (FirmenMitglied f : FirmenMitglied.getFirmenMitglieds())
        {
            summe += f.getGehalt();
        }

        gewinn = umsatz - summe;
        return gewinn;
    }
    public static void main(String[] args)
    {
        for (int i=0; i<20; i++)
        {
            String a = Integer.toString(i+1);
            new Mitarbeiter(a);
        }
        for (int i=0; i<5; i++)
        {
            String a = Integer.toString(i+1);
            new Vorgesetzter(a);
        }

        for (int i=0; i<3; i++)
        {
            String a = Integer.toString(i+1);
            new Vorstandsvorsitzender(a);
        }

        for (FirmenMitglied f : FirmenMitglied.getFirmenMitglieds())
        {
            if (f.getClass().equals(Mitarbeiter.class))
            {
                System.out.printf("ich bin %s. Mitarbeiter, mein Gehalt: %.2f\n", f.getName(), f.getGehalt());
            }
            else if (f.getClass().equals(Vorgesetzter.class))
            {
                System.out.printf("ich bin %s. Vorgesetzter, mein Gehalt: %.2f\n", f.getName(), f.getGehalt());

            }
            else if (f.getClass().equals(Vorstandsvorsitzender.class))
            {
                System.out.printf("ich bin %s. Vorstandsvorsitzender, mein Gehalt: %.2f\n", f.getName(), f.getGehalt());
            }
        }
        System.out.println();
        System.out.println(Gewinn());
    }
}