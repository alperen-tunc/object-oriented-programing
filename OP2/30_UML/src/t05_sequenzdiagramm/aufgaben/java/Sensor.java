package t05_sequenzdiagramm.aufgaben.java;

import java.util.Random;

public class Sensor
{
    String bezeichnung = "Kerntemperatur";

    public String getBezeichnung()
    {
        return bezeichnung;
    }

    public double getMesswert()
    {
        return new Random().nextDouble() * 100;
    }
}
