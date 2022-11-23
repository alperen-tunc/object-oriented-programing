package Aufgaben;
/*
 *  Interface TankfüllstandNiedrig mit void-Methode onTankfüllstandNiedrig, welche als Parameter ein PKW und eine TankfüllstandLeuchte erhält.
 *  Klasse TankfüllstandLeuchte mit der Farbe der Leuchte als Attribut, dem passenden Getter und Setter und einem Konstruktor.
 *  Klasse PKW
 *      mit einer TankfüllstandLeuchte, die auf "Grün" gesetzt wird,
 *      einem öffentlichen Attribut vom Typ TankfüllstandNiedrig,
 *      einem privaten Tankfüllstand und einer öffentlichen addTankfüllstand-Methode,
 *          die den Tankfüllstand erhöhen kann und die Farbe der Leuchte auf Grün setzt, wenn der Tankfüllstand größer gleich 15 ist,
 *      einen Konstruktor, der den Tankfüllstand initialisiert,
 *      eine void-Methode fahren(), die in einer Schleife "Brumm..." ausgibt und den Tankfüllstand um 1 reduziert, solange der Tankfüllstand größer 0 ist
 *          und weiterhin, wenn der Tankfüllstand kleiner 15 ist, die Leuchte auf Gelb stellt und für das TankfüllstandNiedrig-Objekt die Methode onTankfüllstandNiedrig aufruft,
 *          und wenn der Tankfüllstand kleiner 10 ist, die Leuchte auf Rot stellt und für das TankfüllstandNiedrig-Objekt die Methode onTankfüllstandNiedrig aufruft.
 *  Klasse Fahrer, implementiert das Interface,
 *      mit einer Methode tanken, die den Tankfüllstand eines übergebenen PKW-Objektes erhöhen kann.
 *      Die implementierte Interface-Methode fragt aus der übergebenen TankfüllstandLeuchte die Farbe ab
 *          und ist sie Gelb, sagt der Fahrer "Ach, hat noch Zeit...",
 *          ist sie Rot, sagt der Fahrer "Jetzt aber dringend Tanken..." und tankt anschließend den PKW.
 */
interface TankfüllstandNiedrig
{
    void onTankfüllstandNiedrig(PKW auto, TankfüllstandLeuchte tankfüllstandLeuchte);
}
class TankfüllstandLeuchte
{
    private String leuchteFarbe;

    public String getLeuchteFarbe()
    {
        return leuchteFarbe;
    }

    public void setLeuchteFarbe(String leuchteFarbe)
    {
        this.leuchteFarbe = leuchteFarbe;
    }

    public TankfüllstandLeuchte(String leuchteFarbe)
    {
        this.leuchteFarbe = leuchteFarbe;
    }
}

class PKW
{
    private TankfüllstandLeuchte tankfüllstandLeuchte = new TankfüllstandLeuchte("Grün");
    public TankfüllstandNiedrig tankfüllstandNiedrig;;
    private int tankfüllstand;

    public int getTankfüllstand()
    {
        return tankfüllstand;
    }

    public void setTankfüllstand(int tankfüllstand)
    {
        this.tankfüllstand = tankfüllstand;
    }

    public void addTankfüllstand( int value)
    {
        tankfüllstand+=value;
        if (tankfüllstand>=15)
        {
            tankfüllstandLeuchte.setLeuchteFarbe("Grün");
        }
    }

    public PKW(int tankfüllstand)
    {
        this.tankfüllstand =tankfüllstand;
    }

    public void fahren() throws InterruptedException
    {
        while (tankfüllstand>0)
        {
            System.out.println("Brumm....");
            tankfüllstand--;
            Thread.sleep(500);

            if (tankfüllstand<15 && tankfüllstand>=10)
            {
                tankfüllstandLeuchte.setLeuchteFarbe("Gelb");
                System.out.println(tankfüllstandLeuchte.getLeuchteFarbe());
                tankfüllstandNiedrig.onTankfüllstandNiedrig(this, tankfüllstandLeuchte);

            }
            else if(tankfüllstand<10 && tankfüllstand>0)
            {
                tankfüllstandLeuchte.setLeuchteFarbe("Rot");
                System.out.println(tankfüllstandLeuchte.getLeuchteFarbe());
                tankfüllstandNiedrig.onTankfüllstandNiedrig(this, tankfüllstandLeuchte);
            }
        }


    }
}

class Fahrer implements TankfüllstandNiedrig
{

    public void tanken(PKW p, int value)
    {
        p.addTankfüllstand(value);
    }
    public void onTankfüllstandNiedrig(PKW sender, TankfüllstandLeuchte e)
    {
        if (e != null)
        {
            if (e.getLeuchteFarbe().equals("GELB"))
                System.out.println("Fahrer: Ach, hat noch Zeit...");
            else if (e.getLeuchteFarbe().equals("ROT"))
            {
                System.out.println("Fahrer: Jetzt aber dringend Tanken...");
                tanken(sender, 20);
            }
        }
    }

    public Fahrer(PKW pkw)
    {
        pkw.tankfüllstandNiedrig = this;
    }

}
public class aufgabe_2
{
    public static void main(String[] args) throws InterruptedException
    {
        PKW auto = new PKW(20);
        Fahrer fahrer = new Fahrer(auto);

        auto.fahren();
    }
}
