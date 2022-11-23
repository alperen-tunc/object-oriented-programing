package Aufgaben;
/*
 Schreiben Sie bitte ein Java-Programm, in dem ...
 - eine Klasse 'Produkt' definiert wird
   + Klassenmember sind:
     - name (String, private)
        + normaler Getter und Setter
     - mindestpreis (Integer, private)
        + kein Getter, normaler Setter
     - verkaufspreis (Integer, private)
        + normaler Getter; Setter: nur FALLS value>=mindestpreis SONST verkaufspreis=mindestpreis
 - im Main alle obigen "Feature" getestet werden
*/
class Produkt
{
    private String name;
    private int mindestpreis;
    private int verkaufspreis;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setMindestpreis(int mindestpreis)
    {
        this.mindestpreis = mindestpreis;
    }

    public int getVerkaufspreis()
    {
        return verkaufspreis;
    }

    public void setVerkaufspreis(int verkaufspreis)
    {
        if (verkaufspreis>=mindestpreis)
            this.verkaufspreis = verkaufspreis;
        else
            this.verkaufspreis = mindestpreis;
    }
}
public class aufgabe_3
{
    public static void main(String[] args)
    {
        Produkt p1 = new Produkt();
        p1.setMindestpreis(1000);
        p1.setVerkaufspreis(800);
        System.out.println("Verkaufspreis hat den Wert " + p1.getVerkaufspreis());
        p1.setVerkaufspreis(120);
        System.out.println("Verkaufspreis hat  den Wert " + p1.getVerkaufspreis());

        p1.setName("Schokolade");
        System.out.println("Name: " + p1.getName());
    }
}
