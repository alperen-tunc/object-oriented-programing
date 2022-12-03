package _03_observer._03_thermometer;

public class MainApp
{
    public static void main(String[] args)
    {
        Double minD = 23.0;
        Double maxD = 28.0;

        Thermometer thermometer = new Thermometer(minD, maxD);

        Eltern papa = new Eltern("Baba");
        Eltern mutter = new Eltern("Anne");

        thermometer.add(mutter);
        thermometer.add(papa);


        for (double i=thermometer.getCurrentD(); i<=30 ; i++)
        {
            thermometer.setCurrentD(i);
        }

        for (double i=thermometer.getCurrentD(); i>=22 ; i--)
        {
            thermometer.setCurrentD(i);
        }




    }
}
