package Aufgaben;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Sie bereiten Ihre Model-Klassen zur Verwendung in einer GUI vor. Um die Daten in den GUI Elementen darstellen zu können,
brauchen Sie eine Möglichkeit, die Objekte in Strings und aus Strings zurück in die Objekte konvertieren zu können.
Die GUI Elemente sind bereits darauf eingestellt, einen String-Konverter zu verwenden.
 * Der String-Konverter ist eine abstrakte, generische Klasse mit dem Namen 'StringConverter'. Verwenden Sie folgende Syntax:
 *  'abstract class StringConverter<T>'
 * Über generische Klassen erfahren Sie zu einem anderen Zeitpunkt mehr. Im Prinzip bedeutet es, dass die Klasse mit beliebigen Typen verwendet werden kann.
  Diese Typen sind in diesem Fall Ihre Model-Klassen.
 * Die StringConverter-Klasse verfügt über folgende Methoden:
 *  abstract String toString(T obj)
 *  abstract T fromString(String obj)
 *
 * Ihre Model-Klasse 'Mitarbeiter' verfügt über eine öffentliche statische Liste vom Typ Mitarbeiter und die beiden Attribute 'String name' und 'int nummer'.
 Diese Attribute werden über den Konstruktor beschrieben. Für 'name' gibt es auch noch einen getter.
 *
 * In der 'Mitarbeiter'-Klasse erzeugen Sie ein öffentliches, statisches Feld vom Typ StringConverter und instanziieren eine anonyme Klasse, welche von StringConverter erbt.
 * Die toString-Methode gibt Nummer als String zurück.
 * Die fromString-Methode sucht in der Liste nach einem passenden Objekt entsprechend der übergebenen Nummer als String und gibt dieses Objekt zurück. Wird keins gefunden,
  wird null zurückgegeben.
 *
 * Zum Testen erstellen Sie vier Mitarbeiter und lassen diese mit der Converter-Methode als String ausgeben.
 * Anschließend fragen Sie über die Konsole eine Nummer als String ab. Es wird der Name des Mitarbeiters mit Hilfe der fromString-Methode ausgegeben.
 */
abstract class StringConverter<T>
{
    abstract String toString(T obj);
    abstract T fromString(String obj);
}

class Mitarbeiter
{
    public static List<Mitarbeiter> mitarbeiters = new ArrayList<>();
    private String name = null;
    private int nummer = 0;

    public String getName()
    {
        return name;
    }

    public static final StringConverter<Mitarbeiter> stringConverter = new StringConverter<>()
    {
        @Override
        String toString(Mitarbeiter obj)
        {
            return obj.nummer + " " + obj.name;
        }

        @Override
        Mitarbeiter fromString(String s)
        {
            int num = Integer.parseInt(s);
            for (Mitarbeiter m : mitarbeiters)
                if (m.nummer == num)
                    return m;
            return null;
        }
    };

    public int getNummer()
    {
        return nummer;
    }

    public Mitarbeiter(String name, int nummer)
    {
        this.name = name;
        this.nummer = nummer;
        mitarbeiters.add(this);
    }

}

public class aufgabe_3
{
    public static void main(String[] args)
    {
        Mitarbeiter m1 = new Mitarbeiter("Alperen", 12);
        new Mitarbeiter("Ali    ", 13);
        new Mitarbeiter("Said   ", 14);
        new Mitarbeiter("Tamer  ", 15);
        new Mitarbeiter("Ömer   ", 16);
        new Mitarbeiter("Kara   ", 17);

        Mitarbeiter.mitarbeiters.forEach(s-> System.out.println(s.getName()+ " " + s.getNummer()));
        System.out.println();

        System.out.println(Mitarbeiter.stringConverter.toString(m1));


        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie bitte Mitarbeiter nummer ein: ");
        String num = scanner.nextLine();

        System.out.println(Mitarbeiter.stringConverter.fromString(num).getName());;

        System.out.print("\nEnd of Main..");
    }
}
