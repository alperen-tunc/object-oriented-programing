package _03_observer._02_wetterstation._02Nachher.subject;

import _03_observer._02_wetterstation._02Nachher.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WetterStation implements Subject
{
    private float temperatur;
    private float feuchtigkeit;
    private float druck;

    private List<Observer> observers;

    public WetterStation()
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
            o.update(temperatur, feuchtigkeit, druck);
        }
    }

    public void setMessdaten(float temperatur, float feuchtigkeit, float druck)
    {
        this.temperatur = temperatur;
        this.feuchtigkeit = feuchtigkeit;
        this.druck = druck;
        notifyObservers();
    }
}
