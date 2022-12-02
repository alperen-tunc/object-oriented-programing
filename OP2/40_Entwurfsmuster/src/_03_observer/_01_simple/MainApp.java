package _03_observer._01_simple;

public class MainApp
{
    public static void main(String[] args)
    {
        SimpleSubject subject = new SimpleSubject();

        Observer observerA = new ObserverA(subject);
        Observer observerB = new ObserverB(subject);

        System.out.println("value = 80 => Reaktionen: ");
        subject.setValue(80); // Observer update.

        subject.removeObserver(observerA);
        subject.removeObserver(observerB);
        System.out.println("value = 20 => Reaktionen: ");
        subject.setValue(20);


        System.out.println("\n\nEnd of Main..");
    }
}
