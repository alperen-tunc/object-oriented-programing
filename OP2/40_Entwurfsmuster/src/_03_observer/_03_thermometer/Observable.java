package _03_observer._03_thermometer;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable
{
    private List<Observer> observerList;

    public Observable()
    {
        observerList = new ArrayList<>();
    }

    public void add(Observer observer)
    {
        observerList.add(observer);
    }

    public void remove(Observer observer)
    {
        observerList.remove(observer);
    }

    public void notifyObserver()
    {
        for (Observer o : observerList)
        {
            o.update(this);
        }
    }


}
