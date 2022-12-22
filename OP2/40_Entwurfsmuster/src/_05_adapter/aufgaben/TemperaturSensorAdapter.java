package _05_adapter.aufgaben;

public class TemperaturSensorAdapter implements Temperatur
{
    private TemperaturSensor temperaturSensor;


    public  TemperaturSensorAdapter( TemperaturSensor temperaturSensor)
    {
        this.temperaturSensor = temperaturSensor;
    }
    @Override
    public double getTemperatur()
    {
        return temperaturSensor.getTemperatur() - 273;
    }
    public String getEinheit()
    {
        return "Celsius";
    }
}
