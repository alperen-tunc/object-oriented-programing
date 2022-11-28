package t05_sequenzdiagramm.aufgaben.java;

import java.time.LocalDateTime;

public class Datenbank
{
    public void insert(double messwert, String sensor)
    {
        System.out.println(LocalDateTime.now() + " Der Messwert " + messwert + " vom Sensor " + sensor + " wird in Datenbank geschrieben.");

    }
}
