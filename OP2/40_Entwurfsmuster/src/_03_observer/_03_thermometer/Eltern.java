package _03_observer._03_thermometer;

public class Eltern implements Observer
{
    private String name;

    public Eltern(String name)
    {
        this.name = name;
    }

    @Override
    public void update(Observable observable)
    {
        Thermometer thermometer = (Thermometer) observable;

        System.out.println(name + " hat gesagt, dass es " + thermometer.getCurrentD() + " geworden ist.");
    }
}
