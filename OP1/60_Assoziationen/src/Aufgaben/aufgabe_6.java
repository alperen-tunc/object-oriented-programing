package Aufgaben;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.Scanner;

/*
    Führen Sie bitte zunächst die drei folgenden Klassen ein:

        a) Klasse Land
            Member:
                Länderliste (statisch, öffentlich) [Liste aller instanziierten Objekte vom Typ Land]
                Firmenliste (privat) [Liste aller Firmen, die im jeweiligen Land vertreten sind]
                Name des Landes (privat)
                Methode:
                    Name: zeigeAlleFirmen
                    Übergabewerte: keine
                    Funktion: - Ausgabe der Überschrift: "Alle Firmen in" + Ländername
                              - Alle Namen der Firmen aus Firmenliste
                    Rückgabewert: keiner
                Konstruktor:
                    Übergabewert: Name des Landes
                    Funktion: - Füllt das private Feld (Name des Landes)
                              - Fügt das Land zur Länderliste

        b) Klasse Firma
            Member:
                Firmaliste (statisch, öffentlich) [Liste aller instanziierten Objekte vom Typ Firma]
                Länderliste (privat) [Liste aller Länder, in denen die Firma vertreten ist]
                Mitarbeiterliste (privat) [Liste aller Mitarbeiter, die in der Firma arbeiten]
                Name der Firma (privat)
                2 Methoden:
                    1.) Name: zeigeAlleLänder
                    Übergabewerte: keine
                    Funktion: - Ausgabe der Überschrift: Alle Länder in denen " + Name der Firma + " vertreten ist:"
                              - Alle Namen der Länder aus Länderliste
                    Rückgabewert: keiner
                    2.) Name: zeigeAlleMitarbeiter
                    Übergabewerte: keine
                    Funktion: - Ausgabe der Überschrift: Alle Mitarbeiter die in" + Name der Firma + " arbeiten:"
                              - Alle Namen der Mitarbeiter aus Mitarbeiterliste
                    Rückgabewert: keiner
                Konstruktor:
                    Übergabewert: Name der Firma
                    Funktion: - Füllt das private Feld (Name der Firma)
                              - Fügt die Firma zur Firmenliste

        c) Klasse Mitarbeiter
            Member:
                Mitarbeiterliste (statisch, öffentlich) [Liste aller instanziierten Objekte vom Typ Mitarbeiter]
                Name des Mitarbeiters (privat)
                Firma (privat) [in der Mitarbeiter arbeitet]
                Konstruktor:
                    Übergabewert: Name des Mitarbeiters, Firma
                    Funktion: - Füllt das private Feld (Name des Mitarbeiters)
                              - Fügt den Mitarbeiter zur Mitarbeiterliste

     Im Main
        a) Instanziierung:
            Firmen: Microsoft, Apple, Volkswagen und Porsche
            Länder: Deutschland, USA, Dänemark
            Mitarbeiter: Mike, Marcy, Andrew, Amy, Volker, Verena, Paul und Petra
        b) Listen auffüllen:
            Microsoft und Volkswagen sind in allen drei Ländern vertreten.
            Apple und Porsche nur in Deutschland und USA.
            Jeder Mitarbeiter arbeitet in einer Firma, bei denen die Anfangsbuchstaben übereinstimmen.
        c) Navigierbarkeit (als Ergebnis der Klassenmember): Land<->Firma und Firma<->Mitarbeiter (alle Assoziationen sind bidirektional)

        Kontrollausgabe:
            1) Alle Firmen pro Land
            2) Alle Länder pro Firma
            3) Alle Mitarbeiter pro Firma
            4) Firma jedes Mitarbeiters

*/
class Firma
{
    public static final ArrayList<Firma> firmen = new ArrayList<>();
    private final ArrayList<Land> länder = new ArrayList<>();
    private String name;
    private ArrayList<Mitarbeiter> mitarbeiter = new ArrayList<>();

    public Firma(String name)
    {
        this.name = name;

        firmen.add(this);
    }

    public ArrayList<Land> getLänder()
    {
        return länder;
    }

    public String getName()
    {
        return name;
    }

    public ArrayList<Mitarbeiter> getMitarbeiter()
    {
        return mitarbeiter;
    }

    public void zeigeAlleLänder()
    {
        System.out.printf("Alle Länder, in denen %s vertreten ist.", name);
        for (Land l : länder)
        {
            System.out.println(l.getName());
        }
    }

    public void zeigeAlleMitarbeiter()
    {
        System.out.println("Alle mit Arbeiter von " + name);
        for (Mitarbeiter m : mitarbeiter)
        {
            System.out.println(m.getName());
        }
    }
}
class Land
{
    public static final ArrayList<Land> länder = new ArrayList<>();
    private final String name;
    private final ArrayList<Firma> firmen = new ArrayList<>();

    public String getName()
    {
        return name;
    }

    public ArrayList<Firma> getFirmen()
    {
        return firmen;
    }

    public Land(String name)
    {
        this.name = name;
        länder.add(this);
    }

    public void zeigeAlleLänder()
    {
        System.out.println("Alle Firmen in " + name);
        for (Firma f : firmen)
        {
            System.out.println(f.getName());
        }
    }
}
class Mitarbeiter
{
    public static final ArrayList<Mitarbeiter> mitarbeiter = new ArrayList<>();
    private final String name;
    private final Firma firma;

    public String getName()
    {
        return name;
    }

    public Firma getFirma()
    {
        return firma;
    }

    public Mitarbeiter(String name, Firma firma)
    {
        this.name = name;
        this.firma = firma;

        mitarbeiter.add(this);
    }
}
public class aufgabe_6
{
    private static final Scanner scanner = new Scanner(System.in);
    private static boolean istOk;
    private static String auswahl = null;
    private static String landName = null;
    private static String firmenName = null;

    public static void main(String[] args)
    {
        Firma f1 = new Firma("Microsoft");
        Firma f2 = new Firma("Apple");
        Firma f3 = new Firma("Volkswagen");
        Firma f4 = new Firma("Porsche");

        Land l1 = new Land("Deutschland");
        Land l2 = new Land("USA");
        Land l3 = new Land("Dänemark");

        Mitarbeiter m1 = new Mitarbeiter("Mike", f1);
        Mitarbeiter m2 = new Mitarbeiter("Marcy", f1);
        Mitarbeiter m3 = new Mitarbeiter("Andrey", f2);
        Mitarbeiter m4 = new Mitarbeiter("Amy", f2);
        Mitarbeiter m5 = new Mitarbeiter("Volker", f3);
        Mitarbeiter m6 = new Mitarbeiter("Verena", f3);
        Mitarbeiter m7 = new Mitarbeiter("Paul", f4);
        Mitarbeiter m8 = new Mitarbeiter("Petra", f4);

        f1.getLänder().add(l1);
        f1.getLänder().add(l1);
        f1.getLänder().add(l2);
        f1.getLänder().add(l3);

        f2.getLänder().add(l1);
        f2.getLänder().add(l2);

        f3.getLänder().add(l1);
        f3.getLänder().add(l2);
        f3.getLänder().add(l3);

        f4.getLänder().add(l1);
        f4.getLänder().add(l2);

        l1.getFirmen().add(f1);
        l1.getFirmen().add(f2);
        l1.getFirmen().add(f3);
        l1.getFirmen().add(f4);

        l2.getFirmen().add(f1);
        l2.getFirmen().add(f2);
        l2.getFirmen().add(f3);
        l2.getFirmen().add(f4);

        l3.getFirmen().add(f1);
        l3.getFirmen().add(f3);

        f1.getMitarbeiter().add(m1);
        f1.getMitarbeiter().add(m2);
        f2.getMitarbeiter().add(m3);
        f2.getMitarbeiter().add(m4);
        f3.getMitarbeiter().add(m5);
        f3.getMitarbeiter().add(m6);
        f4.getMitarbeiter().add(m7);
        f4.getMitarbeiter().add(m8);

        while(true)
            starteMenu();

    }

    public static void starteMenu()
    {
        System.out.println("\nHauptmenü");
        System.out.println("Bitte treffen Sie ihre Auswahl:");
        System.out.print("1 <- Alle Firmen pro Land\n2 <- Alle Länder pro Firma\n3 <- Alle Mitarbeiter pro Firma\n" +
                                 "4 <- Firma jedes Mitarbeiters\n5 <- Programm beenden\n\nAuswahl: ");
        auswahl = scanner.nextLine();

        switch (auswahl)
        {
            case "1":
                auswahlAlleFirmenProLand(); // Methode für Auswahl Land und Anzeige der Firmen
                break;
            case "2":
                auswahlLänderProFirma(); // Methode für Auswahl Firma und Anzeige der Länder (Standorte)
                break;
            case "3":
                auswahlMitarbeiterProFirma(); // Methode für Auswahl der Firma und Anzeige ihrer Mitarbeiter
                break;
            case "4":
                auswahlFirmaJedesMitarbeiter(); // Methode für Anzeige aller Mitarbeiter jeder Firma
                break;
            case "5":
                System.exit(0); // Programm beendet
                break;

            default:
                System.out.println("Eingabe ist nicht bekannt!");
                break;
        }

    }

    public static void auswahlAlleFirmenProLand()
    {
        System.out.println("Bitte wählen Sie das Land von dem die Firmen angezeigt werden sollen!");
        int i = 1;
        for (Land l : Land.länder)
        {
            System.out.println(i + " <- " + l.getName());
            i++;
        }
        System.out.print("Auswahl: ");
        auswahl = scanner.nextLine();

        do
        {
            istOk = false;
            switch (auswahl)
            {
                case "1":
                    landName = "Deutschland";
                    break;
                case "2":
                    landName = "USA";
                    break;
                case "3":
                    landName = "Dänemark";
                    break;

                default:
                    System.out.println("Eingabe ist nicht bekannt!");
                    istOk = true;
                    break;
            }
        } while (istOk);
        System.out.println("Alle Firmen von " + landName + ":");
        for (Land l : Land.länder)
        {

            if (l.getName().equals(landName))
            {
                for (Firma f : l.getFirmen())
                {
                    System.out.println(f.getName());
                }
            }
        }
    }

    public static void auswahlLänderProFirma()
    {

        System.out.println("Bitte wählen Sie die Firma aus von der Sie die Länder angezeigt bekommen haben wollen!");
        int i = 1;
        for (Firma f : Firma.firmen)
        {
            System.out.println(i + " <- " + f.getName());
            i++;
        }
        System.out.print("Auswahl: ");
        auswahl = scanner.nextLine();

        do
        {
            istOk = false;
            switch (auswahl)
            {
                case "1":
                    firmenName = "Microsoft";
                    break;
                case "2":
                    firmenName = "Apple";
                    break;
                case "3":
                    firmenName = "Volkswagen";
                    break;
                case "4":
                    firmenName = "Porsche";
                    break;
                default:
                    System.out.println("Eingabe ist nicht bekannt!");
                    istOk = true;
                    break;
            }
        } while (istOk);
        System.out.println("Alle Länder von " + firmenName + ":");
        for (Firma f : Firma.firmen)
        {

            if (f.getName().equals(firmenName))
            {
                for (Land l : f.getLänder())
                {
                    System.out.println(l.getName());
                }
            }
        }

        System.out.println("\n---Warte auf Tastendruck---");
        scanner.nextLine();
        starteMenu();

    }

    public static void auswahlMitarbeiterProFirma()
    {

        System.out.println("Bitte wählen Sie die Firma aus von der Sie alle Mitarbeiter angezeigt bekommen wollen!");
        int i = 1;
        for (Firma f : Firma.firmen)
        {
            System.out.println(i + " <- " + f.getName());
            i++;
        }
        System.out.print("Auswahl: ");
        auswahl = scanner.nextLine();

        do
        {
            istOk = false;
            switch (auswahl)
            {
                case "1":
                    firmenName = "Microsoft";
                    break;
                case "2":
                    firmenName = "Apple";
                    break;
                case "3":
                    firmenName = "Volkswagen";
                    break;
                case "4":
                    firmenName = "Porsche";
                    break;
                default:
                    System.out.println("Eingabe ist nicht bekannt!");
                    istOk = true;
                    break;
            }
        } while (istOk);
        System.out.println("Alle Mitarbeiter der Firma " + firmenName + ":");
        for (Firma f : Firma.firmen)
        {

            if (f.getName().equals(firmenName))
            {
                for (Mitarbeiter m : f.getMitarbeiter())
                {
                    System.out.println(m.getName());
                }
            }
        }

        System.out.println("\n---Warte auf Tastendruck---");
        scanner.nextLine();
        starteMenu();

    }

    public static void auswahlFirmaJedesMitarbeiter()
    {
        System.out.println("Ausgabe aller Mitarbeiter und ihren Firmen: ");
        int i = 1;
        for (Mitarbeiter m : Mitarbeiter.mitarbeiter)
        {
            System.out.println(i + ".Mitarbeiter:\t" + m.getName() + "\n  Firma:\t\t" + m.getFirma().getName());
            i++;
        }

        System.out.println("\n---Warte auf Tastendruck---");
        scanner.nextLine();
        starteMenu();
    }
}

