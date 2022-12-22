package _04_factory.aufgaben.aufgabe_3.fabrikArten;

import _04_factory.aufgaben.aufgabe_3.pizzaSorten.*;

import java.util.HashMap;

public class AufDemVenus extends Fabrik
{
    @Override
    public Pizza erstellePizza(String auswahl)
    {
        auswahl = auswahl.toLowerCase();
        Pizza pizza = fabrikMap.get(auswahl);
        return pizza;

    }
    public AufDemVenus()
    {
        this.fabrikMap = new HashMap<>();
        fabrikMap.put("venussalami", new VenusSalamiPizza());
        fabrikMap.put("venusschinken", new VenusSchinkenPizza());
    }
}
