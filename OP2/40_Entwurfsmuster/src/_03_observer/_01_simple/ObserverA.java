package _03_observer._01_simple;

public class ObserverA implements Observer
{
    private int value;
    private final Subject subject;

    public ObserverA(Subject subject)
    {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(int value)
    {
        this.value = value;
        System.out.format("Benachrichtigung => ObserverA.update(%d)%n", value);
    }
}
