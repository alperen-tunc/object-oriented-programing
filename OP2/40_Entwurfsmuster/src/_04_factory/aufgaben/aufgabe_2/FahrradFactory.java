package _04_factory.aufgaben.aufgabe_2;

import _04_factory.aufgaben.aufgabe_2.fahrrad.Cityrad;
import _04_factory.aufgaben.aufgabe_2.fahrrad.Fahrrad;
import _04_factory.aufgaben.aufgabe_2.fahrrad.Rennrad;
import _04_factory.aufgaben.aufgabe_2.fahrrad.Tourenrad;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class FahrradFactory
{
    private Map<String, Fahrrad> fahrradMap;

    public FahrradFactory()
    {
        Fahrrad fahrrad = null;

        this.fahrradMap = new HashMap<>();
        fahrradMap.put("rennrad", new Rennrad());
        fahrradMap.put("tourenrad", new Tourenrad());
        fahrradMap.put("cityrad", new Cityrad());
    }

    public Fahrrad  erstelleFahrrad(String fahrradAuswahl)
    {
        fahrradAuswahl = fahrradAuswahl.toLowerCase(Locale.ROOT);
        Fahrrad fahrrad = fahrradMap.get(fahrradAuswahl);
        if (fahrrad == null)
        {
            return null;
        }
        return fahrrad;
    }
}
