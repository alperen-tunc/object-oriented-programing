package Aufgaben;
/* Aufgabe 0-1 (Basics)
 * Interface "Aktion" mit parameterloser void-Methode "ausführen()
 * Klasse "Sportler" mit void Methode "führeAktionAus", welche als Parameter eine Aktion erwartet und die Aktion ausführt.
 * In der Klasse "Program":
 * Void Methode "schwimmen" ohne Parameter: gibt auf der Konsole "Ich schwimme." aus.
 * Void Methode "laufen" ohne Parameter: gibt auf der Konsole "Ich laufe." aus.
 * In der Main:
 * Erstellen Sie einen Sportler, rufen Sie "führeAktionAus" auf und übergeben Sie einmal "schwimmen" und einmal "laufen".
 */

/* Aufgabe 0-2 (Basics)
 * Modifizieren Sie das vorhandene Programm so, dass nicht die Methoden schwimmen() und laufen() verwendet werden, sondern entsprechende Lambda-Expressions
 */
@FunctionalInterface
interface Aktion
{
    void ausfuehren();
}

class Spotler
{
    public void fuehreAktionAus(Aktion aktion)
    {
        aktion.ausfuehren();
    }
}

class Program
{
    public static void schwimme()
    {
        System.out.println("Schwimme nur");
    }
}
public class aufgabe_00
{
    public static void schwimmen()
    {
        System.out.println("Ich scheimme");
    }

    public static void laufen()
    {
        System.out.println("Ich laufe");
    }

    public static void main(String[] args)
    {
        Spotler s1 = new Spotler();

        s1.fuehreAktionAus(aufgabe_00::laufen);
        s1.fuehreAktionAus(aufgabe_00::schwimmen);

        s1.fuehreAktionAus(() -> System.out.println("Ich schwimme"));
        s1.fuehreAktionAus(() -> System.out.println("Ich laufe"));
        
        Aktion s2 = () -> System.out.println("Ich schwimme nur hier");
        s2.ausfuehren();

        Spotler s3 = new Spotler();
        s3.fuehreAktionAus(Program::schwimme);


        System.out.println("======================= end of main() ======================");
    }
}
