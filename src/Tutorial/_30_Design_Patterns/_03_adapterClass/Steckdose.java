package Tutorial._30_Design_Patterns._03_adapterClass;

public class Steckdose
{
    public void gibElectric(ElektrischeHausGeräte elektrischeHausGeräte)
    {
        int volt = elektrischeHausGeräte.steckdoseEinstecken();
        System.out.println("kommt " + volt + " electric");
    }
}
