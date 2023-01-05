package _03_observer.aufgaben.aufgabe_3;

public class MainApp
{
    public static void main(String[] args)
    {
        SensorDaten sensorDaten = new SensorDaten(12.2);

        Dashboard dashboard = new Dashboard();
        History history = new History();

        sensorDaten.add(dashboard);
        sensorDaten.add(history);

        for (int i=0; i<5 ; i++)
            sensorDaten.setMessWert(i+10);

        System.out.println("\n\nEnd of Main..");
    }
}
