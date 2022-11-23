package Aufgaben;

import java.util.ArrayList;

/*
    Führen Sie bitte die drei folgenden Klassen ein:
        a) Tierart
            Member:
                Liste vom Typ Tierart (öffentlich und statisch)
                String bezeichnung (private)
                double futtermenge (private)
                Konstruktor: Initialisiert die Felder bezeichnung und futtermenge, außerdem wird die aktuelle Instanz zur Liste hinzugefügt
        b) Tier
            Member:
                Liste vom Typ Tier (öffentlich und statisch)
                int id (private)
                String name (private)
                Tierart art (private)
                Konstruktor: Initialisiert die Felder Id, Name und Art, außerdem wird die aktuelle Instanz zur Liste hinzugefügt
        c) Gehege
            Member:
                Liste vom Typ Tierart (private) [Liste aller im Gehege zulässigen Tierarten]
                Liste vom Typ Tier (private) [Liste alle Tier(-Individuen), die im Gehege leben]
                int maxAnzahlDerTiere (private)
                Konstruktor: Initialisiert maxAnzahlDerTiere mit Hilfe eines entsprechenden Übergabewertes
                3 Methoden:
                    1.) Methodenname: addTier
                        Übergabewerte: 1 Tier t
                        Funktion: Fügt t zur Liste vom Typ Tier FALLS Tierart zulässig UND Gehege noch nicht voll
                        Rückgabewert: true FALLS t hinzugefügt werden konnte, SONST false
                    2.) Methodenname: zeigeTierListe
                        Übergabewerte: Keiner
                        Funktion: Gibt von allen Tieren des Geheges den Namen und dessen Tierart auf der Konsole aus
                        Rückgabewert: Keiner
                    3.) Methodenname: futtermengeGesamt
                        Übergabewerte: Keiner
                        Funktion: Ermittelt die Gesamtmenge des benötigten Futters für alle im Gehege lebenden Tier(-Individuen)
                        Rückgabewert: Gesamtmenge
        Im Main
            Implementieren Sie bitte folgende Tierarten (und deren jeweiligen Futtermengen)
              "Jaguar", 3.75
              "Leopard", 3.10
              "Schaf", 4.50
            Implementieren Sie bitte die folgenden Tier(-Individuen) (und deren jeweilige Id)
              1, "Shira" (Jaguar)
              2, "Shari" (Jaguar)
              3, "Lopa" (Leopard)
              4, "Shaun"  (Schaf)
            Führen Sie ferner bitte einen Gehege 'k' ein (in dem maximal 2 Tiere Platz finden)
            Tragen Sie bitte in der Liste aller zulässigen Tierarten in k die Tierarten Jaguar und Leopard ein
            Versuchen Sie bitte zur Liste aller Tier(-Individuen, die in k leben) folgende Tiere (in genau dieser Reihenfolge) einzuführen:
              Shira
              Shaun
              Lopa
              Shari
            (Ergebnis muss dann sein, dass im Gehege die Tiere Shira und Lopa erscheinen, da Shaun nicht zulässig ist und für Shari kein Platz mehr seien wird)
            Rufen Sie zum Abschluß bitte die Methode futtermengeGesamt() auf [Kontrollergebnis: 6,85 kg]
*/
class Tierart
{
    public static ArrayList<Tierart> tierarts = new ArrayList<>();
    private String bezeichnung;
    private double futterMenge;

    public static ArrayList<Tierart> getTierarts()
    {
        return tierarts;
    }

    public static void setTierarts(ArrayList<Tierart> tierarts)
    {
        Tierart.tierarts = tierarts;
    }

    public String getBezeichnung()
    {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung)
    {
        this.bezeichnung = bezeichnung;
    }

    public double getFutterMenge()
    {
        return futterMenge;
    }

    public void setFutterMenge(double futterMenge)
    {
        this.futterMenge = futterMenge;
    }

    public Tierart(String bezeichnung, double futterMenge)
    {
        this.bezeichnung = bezeichnung;
        this.futterMenge = futterMenge;

        tierarts.add(this);
    }
}

class Tier
{
    public static ArrayList<Tier> tiers = new ArrayList<>();
    private int id;
    private String name;
    private Tierart art;

    public static ArrayList<Tier> getTiers()
    {
        return tiers;
    }

    public static void setTiers(ArrayList<Tier> tiers)
    {
        Tier.tiers = tiers;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public Tierart getArt()
    {
        return art;
    }

    public Tier(int id, String name, Tierart art)
    {
        this.art = art;
        this.id = id;
        this.name = name;

        tiers.add(this);
    }
}

class Gehege
{
    private final ArrayList<Tierart> zulässigeTierart = new ArrayList<>();
    private ArrayList<Tier> hierLebendeTiere = new ArrayList<>();

    private int maxAnzahlDerTiere;

    public void setZulässigeTierart(Tierart zulässigeTierart)
    {
        this.zulässigeTierart.add(zulässigeTierart);
    }

    public void zeigTierart()
    {
        for (Tierart ta : zulässigeTierart)
        {
            System.out.println(ta.getBezeichnung());
        }
    }

    public boolean addTier(Tier t)
    {
        for (Tierart ta : zulässigeTierart)
        {
            if(ta == t.getArt() && hierLebendeTiere.size() < maxAnzahlDerTiere)
            {
                hierLebendeTiere.add(t); // Or Tier.tiers.add(t);
                return true;
            }
        }
        return false;
    }

    public void zeigeTiere()
    {
        for (Tier t : hierLebendeTiere)
        {
            System.out.println(t.getArt().getBezeichnung() + " - " + t.getName());
        }
    }

    public double gesamtFutterMenge()
    {
        double gesamtmenge=0;

        for (Tier t : hierLebendeTiere)
        {
            gesamtmenge += t.getArt().getFutterMenge();
        }
        return gesamtmenge;
    }

    public Gehege(int maxAnzahlDerTiere)
    {
        this.maxAnzahlDerTiere = maxAnzahlDerTiere;
    }
}
public class aufgabe_2
{
    public static void main(String[] args)
    {
        Tierart ta1 = new Tierart("jaguar", 3.75);
        Tierart ta2 = new Tierart("Leopard", 3.10);
        Tierart ta3 = new Tierart("Schaf", 4.50);

        Tier t1 = new Tier(1, "Shira", ta1);
        Tier t2 = new Tier(2, "Shari", ta1);
        Tier t3 = new Tier(3, "Lopa", ta2);
        Tier t4 = new Tier(4, "Shaun", ta3);

        Gehege k = new Gehege(2);

        k.setZulässigeTierart(ta1);
        k.setZulässigeTierart(ta2);

        k.addTier(t1);
        k.addTier(t4);
        k.addTier(t3);
        k.addTier(t2);

        k.zeigTierart();
        k.zeigeTiere();

        System.out.println();
        System.out.println("Gesamt Futter Menge: " + k.gesamtFutterMenge());
    }
}