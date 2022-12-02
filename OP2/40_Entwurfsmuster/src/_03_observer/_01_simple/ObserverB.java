package _03_observer._01_simple;

public class ObserverB implements Observer
{
    private int value;
    private final Subject subject;

    public ObserverB(Subject subject)
    {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(int value)
    {
        this.value = value;
        System.out.format("Benachrichtigung => ObserverB.update(%d)%n", value);
    }
}
