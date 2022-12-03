package _03_observer._03_thermometer;

public class Thermometer extends Observable
{
    private Double currentD;
    private Double minD;
    private Double maxD;

    public Thermometer(Double minD, Double maxD)
    {
        this.minD = minD;
        this.maxD = maxD;
        this.currentD = 24.00;
    }

    public double getCurrentD()
    {
        return currentD;
    }

    public void setCurrentD(Double currentD)
    {
        this.currentD = currentD;

        System.out.println(currentD);

        controlThermometer();

    }

    private void controlThermometer()
    {
        boolean isWarm = currentD.compareTo(maxD) >= 0;
        boolean isCold = currentD.compareTo(minD) <= 0;

        if(isCold || isWarm)
        {
            notifyObserver();
        }
    }


}
