package _04_factory._02_beispiel_pizza.entities;

public class PepperoniPizza extends Pizza
{
    public PepperoniPizza() {
        name = "Pepperoni Pizza";
        teig = "Crust";
        sauce = "Marinara sauce";
        zutaten.add("Sliced Pepperoni");
        zutaten.add("Sliced Onion");
        zutaten.add("Grated parmesan cheese");
    }
}
