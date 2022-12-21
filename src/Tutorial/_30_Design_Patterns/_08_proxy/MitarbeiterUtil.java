package Tutorial._30_Design_Patterns._08_proxy;

import java.util.*;

public class MitarbeiterUtil
{
    public static List<Mitarbeiter> getMitarbeiterList()
    {
        Mitarbeiter timo = new Mitarbeiter("Timo", "1234", false);
        Mitarbeiter anton = new Mitarbeiter("Anton", "1234", false);
        Mitarbeiter mesmin = new Mitarbeiter("Mesmin", "12345", true);

        List<Mitarbeiter> mitarbeiterList = new ArrayList<>();

        Collections.addAll(mitarbeiterList, mesmin, timo, anton);

        return mitarbeiterList;
    }

    public static Map<String, Mitarbeiter> getUserNameMap()
    {
        List<Mitarbeiter> mitarbeiterList = getMitarbeiterList();
        Map<String, Mitarbeiter> mitarbeiterMap = new HashMap<>();

        for (Mitarbeiter m : mitarbeiterList)
        {
            mitarbeiterMap.put(m.getUserName(), m);
        }

        return mitarbeiterMap;
    }

    public static Mitarbeiter getMitarbeiterByUserName(String userName)
    {
        Map<String, Mitarbeiter> map = getUserNameMap();

        return map.get(userName);
    }

    public static boolean isUserValid(String userName, String password)
    {
        boolean isUserValid = false;

        Mitarbeiter mitarbeiter = getMitarbeiterByUserName(userName);

        if (mitarbeiter != null)
        {
            isUserValid = mitarbeiter.getPassword().equals(password);
        }

        return isUserValid;
    }
}
