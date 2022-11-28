package Aufgaben;
/* Aufgabe 0 (Basics)
 * Erstellen Sie die abstrakte Klasse "Künstler" mit einer abstrakten Methode "kunstErstellen()".
 *
 * Im Main erzeugen Sie zwei Objekte vom Typ Künstler, wobei Sie die kunstErstellen()-Methode überschreiben.
 * Ein Maler auf der Konsole "Ich male ein Bild" und ein Sänger soll "Ich singe einen Song" ausgeben.
 * Rufen Sie in der Main für beide Objekte die Methode auf.
 */
public class aufgabe_1
{
    public static void main(String[] args)
    {
        System.out.println("============================================================");

        Maler maler = new Maler();
        Singer singer = new Singer();
        Kuenstler kuenstler = new Kuenstler()
        {
            @Override
            void kunstErstellen()
            {
                System.out.println("----------------");
            }
        };

        maler.kunstErstellen();
        kuenstler.kunstErstellen();
        singer.kunstErstellen();

        System.out.println("======================= end of main() ======================");

    }
}
abstract class Kuenstler
{
    abstract void kunstErstellen();
}

class Maler extends Kuenstler
{
    @Override
    public void kunstErstellen()
    {
        System.out.println("Ich male ein Bild");
    }
}
class Singer extends Kuenstler
{
    @Override
    void kunstErstellen()
    {
        System.out.println("Ich Singe einen Song");
    }
}

