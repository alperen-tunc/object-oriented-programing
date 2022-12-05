package _04_factory.aufgaben.aufgabe_2.fahrrad;

public class Rennrad extends Fahrrad
{
    public Rennrad()
    {
        name = "speed01";
        gear = "Shimano grx";
        rahmen = "Carbon";
        fahrrads.add(this);
    }
}
