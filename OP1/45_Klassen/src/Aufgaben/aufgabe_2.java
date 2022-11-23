package Aufgaben;
/*
 * Sie bauen einen Roboter. Erstellen Sie die Klasse Robot mit folgenden öffentlichen Membern:
 *  - Integer "batterieLaufzeit"
 *  - String "aufgabe"
 *  - Methode "istBatterieLaufzeitNiedrig"
 *      gibt true zurück, wenn die Laufzeit kleiner 2 ist, sonst false.
 *  - Methode "führeAufgabeAus"
 *      gibt auf dem Bildschirm den Text des Attributs "aufgabe" aus, wenn "istBatterieLaufzeitNiedrig" false liefert
 *          und reduziert dann die Batterielaufzeit um 1,
 *      sonst soll "Ich muss aufgeladen werden." in der Konsole erscheinen.
 *
 * Erstellen Sie in der Main einen Roboter mit der Aufgabe "Ich reiche Butter." und einer Batterielaufzeit von 5.
 * Lassen Sie ihn fünfmal in einer Schleife Butter reichen.
 */
class Robot
{
    private Integer batterieLaufzeit;
    private String aufgabe;

    public Integer getBatterieLaufzeit()
    {
        return batterieLaufzeit;
    }

    public void setBatterieLaufzeit(Integer batterieLaufzeit)
    {
        this.batterieLaufzeit = batterieLaufzeit;
    }

    public String getAufgabe()
    {
        return aufgabe;
    }

    public void setAufgabe(String aufgabe)
    {
        this.aufgabe = aufgabe;
    }

    public boolean istBatterieLaufzeitNiedrig()
    {
        return this.batterieLaufzeit <= 2;
    }

    public void führeAufgabeAus()
    {
        if(!istBatterieLaufzeitNiedrig())
        {
            System.out.println(aufgabe);
            this.batterieLaufzeit--;
        }

        else
        {
            System.out.println("Ich muss aufgeladen werden.");
        }
    }
}
public class aufgabe_2
{
    public static void main(String[] args)
    {
        Robot roboter = new Robot();

        roboter.setAufgabe("Ich reiche Butter.");
        roboter.setBatterieLaufzeit(5);

        for (int i=0; i<5;i++)
        {
            roboter.führeAufgabeAus();
        }
    }
}