package komposition.Vorlesung;

import java.util.ArrayList;
import java.util.Iterator;

public class Gebäude
{
    private final ArrayList<Raum> raumArrayList = new ArrayList<>();

    private String name;

    public String getName()
    {
        return name;
    }

    public Gebäude(String name, int raumNummer)
    {
        this.name = name;
        addRaum(raumNummer);
    }

    protected void finalize()
    {
        System.out.println("Das Gebäude mit dem Namen " + name + " wurde gelöscht!");
    }

    public String getRäume()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Iterator<Raum> it = raumArrayList.iterator(); it.hasNext();)
        {
            Raum r = it.next();
            if(it.hasNext())
                sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    public void addRaum(int raumNummer)
    {
        raumArrayList.add(new Raum(raumNummer));
    }
}
