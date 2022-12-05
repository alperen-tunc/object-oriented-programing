package _04_factory._02_beispiel_pizza.entities;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza
{
    String name;
    String teig;
    String sauce;
    List<String> zutaten = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void vorbereiten() {
        System.out.println("Preparing " + name);
    }

    public void backen() {
        System.out.println("Baking " + name);
    }

    public void schneiden() {
        System.out.println("Cutting " + name);
    }

    public void verpacken() {
        System.out.println("Boxing " + name);
    }

    public String toString() {
        // code to display pizza name and ingredients
        StringBuffer display = new StringBuffer();
        display.append("---- " + name + " ----\n");
        display.append(teig + "\n");
        display.append(sauce + "\n");
        for( String topping : zutaten ) {
            display.append(topping + "\n");
        }
        return display.toString();
    }
}
