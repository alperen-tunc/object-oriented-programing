package _04_factory.aufgaben.aufgabe_3.pizzaSorten;

import _04_factory.aufgaben.aufgabe_3.fabrikArten.Fabrik;

public class FabrikManagement
{
    private Fabrik fabrik;

    public FabrikManagement(Fabrik fabrik)
    {
        this.fabrik = fabrik;
    }

    public Pizza orderPizza(String type)
    {
        Pizza pizza = fabrik.erstellePizza(type);
        return pizza;
    }
}
