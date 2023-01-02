package _05_adapter.aufgaben;

public class Main
{
    public static void main(String[] args)
    {
        TemperaturSensor temperatur = new TemperaturSensor();
        System.out.println("temperatur = " + temperatur.getTemperatur());

        TemperaturSensorAdapter temperaturSensorAdapter = new TemperaturSensorAdapter(temperatur);
        System.out.println("temperaturSensorAdapter = " + temperaturSensorAdapter.getTemperatur());

    }
}
