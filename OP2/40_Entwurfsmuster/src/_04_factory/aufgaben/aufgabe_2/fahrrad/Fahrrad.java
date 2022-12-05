package _04_factory.aufgaben.aufgabe_2.fahrrad;

import java.util.ArrayList;
import java.util.List;

public abstract class Fahrrad
{
    String name;
    String gear;
    String rahmen;

    List<Fahrrad> fahrrads = new ArrayList<>();


    public void rahmenSchweißen()
    {
        System.out.println(rahmen + " Rahmen wird geschweißt.");
    }

    public void gearVerstellen()
    {
        System.out.println(gear + " Getriebe wird verstellt.");
    }

    @Override
    public String toString()
    {
        return "Fahrrad{" +
                "name='" + name + '\'' +
                ", gear='" + gear + '\'' +
                ", rahmen='" + rahmen + '\'' +
                '}';
    }
}
