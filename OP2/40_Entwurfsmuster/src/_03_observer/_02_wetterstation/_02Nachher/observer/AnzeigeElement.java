package _03_observer._02_wetterstation._02Nachher.observer;

import _03_observer._02_wetterstation._02Nachher.subject.WetterStation;

public abstract class AnzeigeElement implements Observer
{
    float temperatur;
    float feuchtigkeit;
    float druck;

    public AnzeigeElement(WetterStation wetterStation)
    {
        wetterStation.registerObserver(this);
    }
    public void setze( float temperatur, float feuchtigkeit, float druck ) {
        this.temperatur = temperatur;
        this.feuchtigkeit = feuchtigkeit;
        this.druck = druck;
    }

    public void anzeigeAktualisieren() {
        // AnzeigeAktuell.anzeigeAktualisieren() oder ...
        System.out.println("========================================");
        System.out.println(getClass().getSimpleName() + ".anzeigeAktualisieren()");
        System.out.format("%f / %f / %f%n", temperatur, feuchtigkeit, druck);
    }
    @Override
    public void update( float temperatur, float feuchtigkeit, float druck ) {
        setze(temperatur, feuchtigkeit, druck);
        anzeigeAktualisieren();
    }
}
