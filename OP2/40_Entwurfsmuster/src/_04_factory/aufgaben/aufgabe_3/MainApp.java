package _04_factory.aufgaben.aufgabe_3;

import _04_factory.aufgaben.aufgabe_3.fabrikArten.AufDemMars;
import _04_factory.aufgaben.aufgabe_3.fabrikArten.AufDemVenus;
import _04_factory.aufgaben.aufgabe_3.fabrikArten.Fabrik;
import _04_factory.aufgaben.aufgabe_3.pizzaSorten.FabrikManagement;
import _04_factory.aufgaben.aufgabe_3.pizzaSorten.Pizza;

/* Sie sind der größte Pizza-Hersteller auf dem Mars. Nun wollen Sie auch auf der Venus eine Fabrik eröffnen.
Damit Sie nicht die Software für die Produktion und Verwaltung neu erstellen müssen,
wollen Sie bestehenden Code wiederverwenden. Sie entscheiden sich, das Factory-Muster anzuwenden.
 *
 * Dafür benötigen Sie eine abstrakte Pizza-Klasse und eine abstrakte Fabrik-Klasse.
 *  Die abstrakte Fabrik stellt die abstrakte Methode erstellePizza bereit, welche die Sorte als String
übergeben bekommt und das erstellte Pizza-Objekt zurück gibt.
 *      Von der abstrakten Fabrik erbt die MarsFabrik, welche dann in Ihrer Fabrik auf dem Mars zum Einsatz
 kommen wird, und die VenusFabrik, welche auf der Venus verwendet werden soll.
 *      In der überschriebenen erstellePizza-Methode wird die Sorte geprüft und daraufhin das passende
Pizza-Objekt erstellt und zurück gegeben.
 *  Die abstrakte Pizza-Klasse überschreibt die toString()-Methode, um unkompliziert die Pizza-Sorte
ausgeben zu können (für diese Aufgabe reicht ein getClass().getSimpleName())
 *      Von der abstrakten Pizza erben MarsSalamiPizza, MarsSchinkenPizza, VenusSalamiPizza und VenusSchinkenPizza.
 * Der Client verfügt über ein Fabrik-Attribut.
 *
 * Erstellen Sie das UML Klassendiagramm und anschließend den Java-Code.
 *
 * In der Main instanziieren Sie zum Testen eine MarsFabrik und erstellen eine MarsPizza.
Dann ersetzen sie die MarsFabrik durch eine VenusFabrik und erstellen eine VenusPizza.
 *
 */
public class MainApp
{
    public static void main(String[] args)
    {
        Fabrik factoryAufDemMars = new AufDemMars();
        Fabrik factoryAfDemVenus = new AufDemVenus();

        FabrikManagement fabrikManagementAufDemMars = new FabrikManagement(factoryAufDemMars);
        FabrikManagement fabrikManagementAufDemVenus = new FabrikManagement(factoryAfDemVenus);

        Pizza pizza = fabrikManagementAufDemMars.orderPizza("MarsSalami");

        System.out.println(pizza.toString());

        Pizza pizza1 = fabrikManagementAufDemVenus.orderPizza("VenusSalami");

        System.out.println(pizza1);

        pizza = factoryAufDemMars.erstellePizza("MarsSalami");
        System.out.println(pizza);



        System.out.println("\n\nEnd of Main..");
    }
}
