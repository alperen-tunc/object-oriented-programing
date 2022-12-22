package _05_adapter.aufgaben;

import java.util.Random;

public class TemperaturSensor implements Temperatur
{
    Random random = new Random();
    private double gradKelvin = random.nextDouble() % 200;

    public double getTemperatur()
    {
        return gradKelvin;
    }

    public String getEinheit()
    {
        return "Kelvin";
    }
}
