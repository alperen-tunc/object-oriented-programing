package _04_factory._02_beispiel_pizza;

import _04_factory._02_beispiel_pizza.entities.Pizza;

public class MainApp
{
    public static void main( String[] args ) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);
        System.out.println("============================================================");
        Pizza pizza = store.orderPizza("cheese");
        System.out.println("++++++++++++++++++++++++++++");
        System.out.println("We ordered a " + pizza.getName());
        System.out.println("++++++++++++++++++++++++++++");
        System.out.print(pizza);
        System.out.println("============================================================");
        pizza = store.orderPizza("veggie");
        System.out.println("++++++++++++++++++++++++++++");
        System.out.println("We ordered a " + pizza.getName());
        System.out.println("++++++++++++++++++++++++++++");
        System.out.print(pizza);
        System.out.println("============================================================");
    }
}
