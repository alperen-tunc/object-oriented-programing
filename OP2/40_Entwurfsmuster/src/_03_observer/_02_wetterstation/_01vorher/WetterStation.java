package _03_observer._02_wetterstation._01vorher;

public class WetterStation
{
    private float temperatur;
    private float feuchtigkeit;
    private float druck;

    public WetterStation() {
    }

    public WetterStation( float temperatur, float feuchtigkeit, float druck ) {
        this.temperatur = temperatur;
        this.feuchtigkeit = feuchtigkeit;
        this.druck = druck;
    }

    public float getTemperatur() {
        return temperatur;
    }

    public void setTemperatur( float temperatur ) {
        this.temperatur = temperatur;
    }

    public float getFeuchtigkeit() {
        return feuchtigkeit;
    }

    public void setFeuchtigkeit( float feuchtigkeit ) {
        this.feuchtigkeit = feuchtigkeit;
    }

    public float getDruck() {
        return druck;
    }

    public void setDruck( float druck ) {
        this.druck = druck;
    }
}
