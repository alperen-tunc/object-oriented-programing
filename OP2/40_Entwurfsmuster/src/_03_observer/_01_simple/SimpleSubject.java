package _03_observer._01_simple;

import java.util.ArrayList;
import java.util.List;

public class SimpleSubject implements Subject
{
    private final List<Observer> observers;
    private int value =0;

    public SimpleSubject()
    {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o)
    {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o)
    {
        observers.remove(o);
    }

    @Override
    public void notifyObservers()
    {
        for (Observer o : observers)
        {
            //System.out.println(o.getClass().getSimpleName() + " Wurde benachrichtigt.");
            o.update(value);
        }
    }

    public void setValue(int value)
    {
        this.value = value;
        notifyObservers();
    }
}
