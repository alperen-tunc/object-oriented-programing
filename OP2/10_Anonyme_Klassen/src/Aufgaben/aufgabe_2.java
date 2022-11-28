package Aufgaben;
/*
 * Sie haben eine Methode, mit der Sie Objekte drucken können, die das Interface 'IDruckbar' implementieren. 'IDruckbar' verfügt über eine 'getInfo()'-Methode, die,
 * wenn sie in implementierenden Klassen überschrieben wurde, die Infos dieser Klasse als String zurückgibt. Nun möchten Sie zwischen den Ausgaben der Klassen-Infos
 * aber noch extra Platz lassen. Die drucken-Methode und die in der Kunde-Klasse implementierte getInfo-Methode wollen oder können Sie aber nicht ändern.
 *
 * Erstellen Sie das Interface 'IDruckbar' mit der String 'getInfo()'-Methode.
 * Erstellen Sie die Klasse 'Kunde' mit dem Attribut 'name', welches über den Konstruktor gefüllt wird.
 * Die Klasse implementiert das Interface und die getInfo-Methode gibt den Namen des Kunden zurück.
 *
 * In Ihrer Main-Klasse erstellen Sie die statische Methode 'void drucken(IDruckbar... druckbar)'
 * Diese Methode wird zu Testzwecken in einer Schleife für alle übergebenen IDruckbar-Objekte die getInfo() aufrufen und ausgeben.
 *
 * In der Main erstellen Sie zwei Kunden und eine anonyme Klasse, welche das Interface implementiert. In dieser Implementierung jedoch wird getInfo() nur ">" zurückgeben.
 *
 * Übergeben Sie den ersten Kunden, dann das Objekt der anonymen Klasse und dann den zweiten Kunden an die drucken()-Methode.
 */
public class aufgabe_2
{
    public static void main(String[] args)
    {
        System.out.println("============================================================");

        Kunde k1 = new Kunde("Kunde1");
        Kunde k2 = new Kunde("Kunde2");
        IDruckbar platzhalter = new IDruckbar()
        {
            @Override
            public String getInfo()
            {
                return ">";
            }
        };

        Drucken(k1, platzhalter, k2);

        System.out.println("======================= end of main() ======================");
    }
    static void Drucken(IDruckbar... druckbar)
    {
        System.out.println("Drucke..");
        for (IDruckbar d : druckbar)
        {
            System.out.println(d.getInfo());
        }
    }
}

interface IDruckbar
{
    String getInfo();
}

class Kunde implements IDruckbar
{
    private String name;

    public Kunde(String name)
    {
        this.name = name;
    }

    @Override
    public String getInfo()
    {
        return name;
    }
}
