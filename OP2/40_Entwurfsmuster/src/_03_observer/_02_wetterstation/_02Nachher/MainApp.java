package _03_observer._02_wetterstation._02Nachher;

import _03_observer._02_wetterstation._02Nachher.observer.AnzeigeAktuell;
import _03_observer._02_wetterstation._02Nachher.observer.AnzeigeHitzenIndex;
import _03_observer._02_wetterstation._02Nachher.observer.AnzeigeVorhersage;
import _03_observer._02_wetterstation._02Nachher.subject.WetterStation;

public class MainApp
{
    public static void main(String[] args)
    {
        WetterStation wetterStation = new WetterStation();
        AnzeigeAktuell anzeigeAktuell = new AnzeigeAktuell(wetterStation);
        AnzeigeHitzenIndex anzeigeHitzeIndex = new AnzeigeHitzenIndex(wetterStation);
        AnzeigeVorhersage anzeigeVorhersage = new AnzeigeVorhersage(wetterStation);

        System.out.println("Vor den Änderungen");
        System.out.println("Messdaten werden aktualisiert.");

        wetterStation.setMessdaten(12.3f, 56.6f, 3.5f);

        System.out.println();

        anzeigeAktuell.update(15.3f, 23.5f, 3.4f);

        wetterStation.notifyObservers();

        System.out.println("\n\nEnd of Main..");
        
    }
}
