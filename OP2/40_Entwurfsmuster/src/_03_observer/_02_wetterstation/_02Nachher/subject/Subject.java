package _03_observer._02_wetterstation._02Nachher.subject;

import _03_observer._02_wetterstation._02Nachher.observer.Observer;

public interface Subject
{
    void registerObserver( Observer o );
    void removeObserver( Observer o );
    void notifyObservers();
}
