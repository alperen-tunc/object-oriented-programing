package _03_observer.aufgaben.aufgabe_3;

public class History implements IObserver
{
    @Override
    public void update( Observable observable)
    {
        SensorDaten sensorDaten = (SensorDaten) observable;
        System.out.println(getClass().getSimpleName() + " sensorDaten.getMessWert() = " + sensorDaten.getMessWert());
    }
}
