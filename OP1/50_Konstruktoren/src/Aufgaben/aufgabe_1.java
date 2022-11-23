package Aufgaben;
/*
Zeichnen Sie bitte eine UML-Notation für die folgende Klasse:
- Name: Fußballfeld
- Member:
  3 private Attribute:
    breite (Integer)
    länge (Integer)
    dfbTauglich (Boolean)
  1 public Methode:
    Name: zeigeAlle
    Übergabewerte: Keine
    Funktion: Gibt die Werte der drei Felder auf der Konsole aus
    Rückgabewert: Keiner
  1 Konstruktor:
    Name: Fußballfeld
    Übergabewerte: Länge und Breite des Fußballfeldes
    Funktion: - initialisiert die Felder "breite" und "länge" mit den Übergabewerten
              - setzt dfbTauglich auf True, falls 45<=breite<=55 UND 90<=länge<=110, sonst dfbTauglich=False
    Rückgabewert: Keiner

Schreiben Sie bitte in Programm, in dem ...
- die Klasse 'Fußballfeld' implementiert wird
- im Main die Funktionalität der Klasse getestet wird
*/

class Fußballfeld
{
    private final int breite;
    private final int länge;
    private boolean dfbTauglich;

    public void zeigAlle()
    {
        System.out.printf("breite: %d \nlänge: %d \ndfbTauglich: %b", breite, länge, dfbTauglich);
    }

    public Fußballfeld(int breite, int länge)
    {
        this.breite = breite;
        this.länge = länge;

        if (breite >=45 && breite<=55 && länge>=90 && länge<=110)
            this.dfbTauglich = true;
    }
}

public class aufgabe_1
{
    public static void main(String[] args)
    {
        Fußballfeld fußballfeld = new Fußballfeld(50, 120);

        fußballfeld.zeigAlle();

    }
}
