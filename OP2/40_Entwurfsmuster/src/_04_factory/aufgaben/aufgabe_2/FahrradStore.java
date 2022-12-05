package _04_factory.aufgaben.aufgabe_2;

import _04_factory.aufgaben.aufgabe_2.fahrrad.Fahrrad;

public class FahrradStore
{
    private FahrradFactory fahrradFactory;

    public FahrradStore(FahrradFactory factory)
    {
        this.fahrradFactory = factory;
    }

    public Fahrrad bestelleFahrrad(String type)
    {
        Fahrrad fahrrad = fahrradFactory.erstelleFahrrad(type);
        fahrrad.rahmenSchweißen();
        fahrrad.gearVerstellen();

        return fahrrad;
    }
}
