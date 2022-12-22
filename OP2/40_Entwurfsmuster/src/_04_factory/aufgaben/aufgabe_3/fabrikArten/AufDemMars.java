package _04_factory.aufgaben.aufgabe_3.fabrikArten;

import _04_factory.aufgaben.aufgabe_3.pizzaSorten.*;

import java.util.HashMap;

public class AufDemMars extends Fabrik
{
    @Override
    public Pizza erstellePizza(String auswahl)
    {
        auswahl = auswahl.toLowerCase();
        Pizza pizza = fabrikMap.get(auswahl);
        return pizza;

    }
    public AufDemMars()
    {
        this.fabrikMap = new HashMap<>();
        fabrikMap.put("marssalami", new MarsSalamiPizza());
        fabrikMap.put("marsschinken", new MarsSchinkenPizza());
    }


}
