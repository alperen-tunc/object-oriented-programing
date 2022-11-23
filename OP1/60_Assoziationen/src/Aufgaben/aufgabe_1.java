package Aufgaben;
/*
    Führen Sie bitte zunächst die beiden folgenden Klassen ein:
       Fach (Attribute: id, bezeichnung)
       Klausur (Attribute: id, note)
    Erzeugen Sie bitte die beiden folgenden Objekte vom Typ Fach:
       Java-Grundlagen
       Datenbankmodellierung und SQL
       (wählen Sie beliebige ID)
    Erzeugen Sie bitte die drei folgenden Objekte vom Typ Klausur:
       2 Klausuren im Fach Java
       1 Klausur im Fach DBM+SQL
       (wählen Sie beliebige ID und Noten)

    Sorgen Sie bitte für eine BIDIREKTIONALE Navigierbarkeit
    (Dazu müssen Sie weitere Klassenmember einfügen)

    Schreiben Sie ferner bitte das folgende Programm im Main:
       In einer Endlos-Schleife wird pro Durchlauf ...
         - vom User abgefragt, ob er ...
           (1) von Klausur zum Fach navigieren, oder
           (2) von Fach zur Klausur navigieren möchte
           (Wiederholung der Abfrage, wenn weder 1, noch 2 gewählt wurde)
         - Falls 1 gewählt wurde, so wird vom User eine Klausur-ID abgefragt
             Falls die Eingabe einen Format-Fehler hat, wird die Abfrage wiederholt
             Falls die Eingabe vom Format OK, aber keine Klausur mit der gewählten ID existiert: Fehlermeldung + Wiederholung der Abfrage
             Falls Eingabe-Format OK UND ID existiert: Ausgabe der Fach-Bezeichnung
         - Falls 2 gewählt wurde, so wird vom User eine Fach-ID abgefragt
             Falls die Eingabe ein Format-Fehler, wird die Abfrage wiederholt
             Falls die Eingabe vom Format OK, aber kein Fach mit der gewählten ID existiert: Fehlermeldung + Wiederholung der Abfrage
             Falls Eingabe-Format OK UND ID existiert: Ausgabe aller Klausur-IDs und Noten der Klausuren zu diesem Fach
*/
import java.util.ArrayList;
import java.util.Scanner;
class Fach
{
    private final int id;
    private String bezeichnung;

    public static ArrayList<Klausur> klausurs = new ArrayList<>();

    public ArrayList<Klausur> getKlausurs()
    {
        return klausurs;
    }

    public void setKlausurs(ArrayList<Klausur> klausurs)
    {
        this.klausurs = klausurs;
    }

    public void setBezeichnung(String bezeichnung)
    {
        this.bezeichnung = bezeichnung;
    }

    public int getId()
    {
        return id;
    }

    public String getBezeichnung()
    {
        return bezeichnung;
    }

    public Fach(int id, String bezeichnung)
    {
        this.id = id;
        this.bezeichnung = bezeichnung;
    }
}
class Klausur
{
    private final int id;
    private double note;
    private Fach fach;

    public Fach getFach()
    {
        return fach;
    }

    public void setNote(double note)
    {
        this.note = note;
    }

    public int getId()
    {
        return id;
    }

    public double getNote()
    {
        return note;
    }

    public Klausur(int id, double note, Fach fach)
    {
        this.id = id;
        this.note = note;
        this.fach = fach;

        fach.getKlausurs().add(this);
    }
}
public class aufgabe_1
{
    public static void main(String[] args)
    {
        Fach f1 = new Fach(1, "Java-Grundlagen");
        Fach f2 = new Fach(2, "Datenbankmodellierung und SQL");

        Klausur k1 = new Klausur(1, 2.3, f1);
        Klausur k2 = new Klausur(2, 5.5, f1);
        Klausur k3 = new Klausur(3, 6.6, f2);

        Scanner scanner = new Scanner(System.in);
        int antwort=0;
        int klausur_id;
        int fach_id;

        while (true)
        {
            System.out.println("(1) von Klausur zum Fach navigieren, oder");
            System.out.println("(2) von Fach zur Klausur navigieren. Geben Sie bitte ein: ");

            antwort = control(scanner.nextLine());

            if(antwort == 1)
            {
                System.out.println("Geben sie bitte Klausur-ID ein: ");
                klausur_id = control(scanner.nextLine());

                for (Klausur k : Fach.klausurs)
                {
                    if (k.getId() == klausur_id)
                    {
                        System.out.println("Hier ist bezeichnung von Ihrer Klausur: " + k.getFach().getBezeichnung());
                        System.out.println();
                    }
                }
            }
            else if(antwort == 2)
            {
                System.out.println("Geben sie bitte Fach-ID ein: ");
                fach_id = control(scanner.nextLine());

                for (Klausur k : Fach.klausurs)
                {
                    if (k.getFach().getId() == fach_id)
                    {
                        System.out.println("Hier ist id von Klausur:  " + k.getId() + " und Ihre note: " + k.getNote());
                        System.out.println();
                    }
                }
            }
            System.out.println("Wenn Sie Program beenden möchten, geben Sie (1) ein: ");
            antwort = control(scanner.nextLine());
            if(antwort==1) break;
        }
    }

    public static int control(String antwort)
    {
        int umwandeln;

        try
        {
            umwandeln = Integer.parseInt(antwort);
            return umwandeln;
        }
        catch (NumberFormatException ex)
        {
            System.err.println(ex.getMessage()+ " geben Sie bitte eine richtige Format ein: ");
        }
        return 0;
    }
}
