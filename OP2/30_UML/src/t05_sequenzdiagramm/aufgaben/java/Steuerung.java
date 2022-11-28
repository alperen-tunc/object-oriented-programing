package t05_sequenzdiagramm.aufgaben.java;

public class Steuerung
{
    private Sensor sensor = new Sensor();
    private Datenbank db = new Datenbank();


    public void speichern(double wert)
    {
        String bez = sensor.getBezeichnung();

        this.db.insert(wert, bez);
    }

    public void betrieb()
    {
        while (true)
        {
            speichern(sensor.getMesswert());

            sleep(5);
        }
    }

    private static void sleep( int sec )
    {
        try
        {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }

    }
}
