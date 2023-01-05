package _03_observer.aufgaben.aufgabe_3;

import java.util.ArrayList;
import java.util.List;

public class SensorDaten extends Observable
{
    private double messWert;

    public SensorDaten(double messWert)
    {
        this.messWert = messWert;
    }

    public double getMessWert()
    {
        return messWert;
    }

    public void setMessWert(double messWert)
    {
        this.messWert = messWert;
        System.out.println(messWert);
        notifyIObserver();
    }
}
