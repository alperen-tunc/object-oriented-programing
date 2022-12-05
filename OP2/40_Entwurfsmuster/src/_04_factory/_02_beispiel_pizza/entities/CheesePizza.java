package _04_factory._02_beispiel_pizza.entities;

public class CheesePizza extends Pizza
{
    public CheesePizza() {
        name = "Cheese Pizza";
        teig = "Regular Crust";
        sauce = "Marinara Pizza Sauce";
        zutaten.add("Fresh Mozzarella");
        zutaten.add("Parmesan");
    }
}
