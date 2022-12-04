package Tutorial.src._30_Design_Patterns._02_factory;

public class Factory
{
    public static Handy getHandy(String model, String battery,String width, String height)
    {
        Handy handy;
        if ("s8".equalsIgnoreCase(model))
        {
            handy = new S8(model, battery, width, height);
        }
        else if ("Note8".equalsIgnoreCase(model))
        {
            handy = new Note8(model, battery, width, height);
        }
        else
        {
            throw new RuntimeException("Ungültige Eingabe.");
        }

        return handy;
    }
}
