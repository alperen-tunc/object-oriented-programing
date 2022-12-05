package _04_factory._02_beispiel_pizza;

import _04_factory._02_beispiel_pizza.entities.Pizza;

public class PizzaStore
{
    private SimplePizzaFactory factory;

    public PizzaStore( SimplePizzaFactory factory ) {
        this.factory = factory;
    }

    public Pizza orderPizza( String type ) {

        Pizza pizza = factory.createPizza(type);

        pizza.vorbereiten(); // vorbereiten
        pizza.backen();    // backen
        pizza.schneiden();     // schneiden
        pizza.verpacken();     // verpacken

        return pizza;
    }
}
