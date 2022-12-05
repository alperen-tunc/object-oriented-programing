package _04_factory.aufgaben.aufgabe_2.fahrrad;

public class Cityrad extends Fahrrad
{
    public Cityrad()
    {
        name = "Romeo";
        gear = "shimano Nexus";
        rahmen = "Alu";
        fahrrads.add(this);
    }
}
