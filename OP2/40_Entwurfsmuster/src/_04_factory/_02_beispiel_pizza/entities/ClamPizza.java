package _04_factory._02_beispiel_pizza.entities;

public class ClamPizza extends Pizza
{
    public ClamPizza() {
        name = "Clam Pizza";
        teig = "Thin crust";
        sauce = "White garlic sauce";
        zutaten.add("Clams");
        zutaten.add("Grated parmesan cheese");
    }
}
