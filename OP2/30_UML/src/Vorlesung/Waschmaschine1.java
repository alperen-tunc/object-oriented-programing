package Vorlesung;

public class Waschmaschine1 implements Startable1
{
    @Override
    public void start()
    {
        System.out.println("Maschine wird gestartet");
    }

    @Override
    public void stop()
    {
        System.out.println("Maschine wird ausgeschaltet");
    }
}
