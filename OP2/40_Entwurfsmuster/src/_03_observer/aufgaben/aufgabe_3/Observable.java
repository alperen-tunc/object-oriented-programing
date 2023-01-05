package _03_observer.aufgaben.aufgabe_3;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable
{
    private List<IObserver> observerList;

    public Observable()
    {
        observerList = new ArrayList<>();
    }

    public void add(IObserver iObserver)
    {
        observerList.add(iObserver);
    }

    public void remove(IObserver iObserver)
    {
        observerList.remove(iObserver);
    }

    public void notifyIObserver()
    {
        for (IObserver o : observerList)
        {
            o.update(this);
        }
    }
}
