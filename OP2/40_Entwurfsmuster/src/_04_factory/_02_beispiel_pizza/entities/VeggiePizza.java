package _04_factory._02_beispiel_pizza.entities;

public class VeggiePizza extends Pizza
{
    public VeggiePizza() {
        name = "Veggie Pizza";
        teig = "Crust";
        sauce = "Marinara sauce";
        zutaten.add("Shredded mozzarella");
        zutaten.add("Grated parmesan");
        zutaten.add("Diced onion");
        zutaten.add("Sliced mushrooms");
        zutaten.add("Sliced red pepper");
        zutaten.add("Sliced black olives");
    }
}
