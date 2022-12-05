package _04_factory.aufgaben.aufgabe_2.fahrrad;

public class Tourenrad extends Fahrrad
{
    public Tourenrad()
    {
        name = "belastbar01";
        gear = "Rohloff";
        rahmen = "Stahl";
        fahrrads.add(this);
    }
}
