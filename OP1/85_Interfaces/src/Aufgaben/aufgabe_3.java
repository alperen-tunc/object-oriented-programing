package Aufgaben;
import java.util.Arrays;
/*
 *  - Erstellen Sie eine Klasse "Adresse" mit Straße, Hausnummer, PLZ und Ort
 *  - Erstellen Sie ein Interface "IAdresse" mit den Getter- und Setter-Methoden für Name und Anschrift (Anschrift ist vom Typ Adresse)
 *      und der Methode "printEtikett()"
 *  - Erstellen Sie die Klasse "Adressverwaltung" mit den Static Methoden "printEtikett(IAdresse obj)""
 *      und "Erfasse(IAdresse obj, String name, String straße, int hausnr, String plz, String ort)""
 *      (Die Klasse Adressverwaltung wird das Interface nicht implementieren, aber wir werden die Klasse verwenden,
 *      um Adressen auszugeben und zu erfassen)
 *  - Die Methode "printEtikett" soll alle Informationen von IAdresse ausgeben (also Name und die Werte in Anschrift)
 *  - Die Methode "erfasse" soll dem übergebenen IAdresse-Objekt die neuen Werte zuweisen
 *  - Erstellen Sie eine Klasse "Person", die nun das Interface IAdresse implementiert und über den Konstruktor
 *      public Person(String name, String straße, int hausnr, String plz, String ort) verfügt
 *      Im Konstruktor sollen die Adress-Werte über die Adressverwaltung erfasst werden
 *  - In der Implementierung der printEtikett-Methode des Interfaces soll die printEtikett-Methode der Adressverwaltung
 *      aufgerufen werden
 *  - Testen Sie die Funktionalitäten in der Main-Methode, indem Sie dort eine Liste oder ein Array mit mehreren Personen anlegen und für jede
 *      Person die Etikett-Methode aufrufen.
 *  - Erweitern Sie das Programm durch Erstellen einer Klasse Firma, die ebenfalls IAdresse implementiert.
 *  - Fügen Sie zu Ihrer Liste im Main nun zusätzlich Objekte der Klasse Firma hinzu. Bewerkstelligen Sie dies ohne
 *      Generalisierung der Klassen.
 */
interface IAdresse
{
    String getName();

    void setName(String value);

    Adresse getAnschrift();

    void setAnschrift(Adresse value);

    void printEtikett();

}
class Adresse
{
    private String straße;
    private String hausnummer;
    private String PLZ;
    private String ort;

    public Adresse(String straße, String hausnummer, String PLZ, String ort)
    {
        this.straße = straße;
        this.hausnummer = hausnummer;
        this.PLZ = PLZ;
        this.ort = ort;
    }

    @Override
    public String toString()
    {
        return straße + " " + hausnummer + " " + PLZ + " " + ort;
    }
}

class Adressverwaltung
{
    public static void printEtikett(IAdresse obj)
    {
        char[] c = new char[30];
        Arrays.fill(c, '*');
        System.out.println("\n" + new String(c));
        System.out.println(obj.getName());
        System.out.println(obj.getAnschrift()); //<- geht dank überschriebener ToString()-Methode in der Struktur
        System.out.println(new String(c));
    }
    public static void erfasse(IAdresse obj, String name, String straße, String hausnr, String plz, String ort)
    {
        obj.setName(name);
        obj.setAnschrift(new Adresse(straße, hausnr, plz, ort));
    }

}

class Person implements IAdresse
{
    private String name;
    private Adresse adresse;

    public Person(String name, String straße, String hausnr, String plz, String ort)
    {
        Adressverwaltung.erfasse(this, name, straße, hausnr, plz, ort);
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public void setName(String value)
    {
        name = value;
    }

    @Override
    public Adresse getAnschrift()
    {
        return adresse;
    }

    @Override
    public void setAnschrift(Adresse value)
    {
        adresse = value;
    }

    public void printEtikett()
    {
        Adressverwaltung.printEtikett(this);
    }
}
public class aufgabe_3
{
    public static void main(String[] args)
    {
        IAdresse[] adressen =
                {
                        new Person("Klaus Müller", "Dorfstr.", "8", "12345", "Irgendwo"),
                        new Person("Marie Heinrich", "Stadtstr.", "24", "01234", "Sonstwo"),
                        //new Firma("Stahlbau GmbH", "Industriestr.", 2, "12345", "Irgendwo")
                };

        for (IAdresse adresse : adressen)
            adresse.printEtikett();
    }
}
