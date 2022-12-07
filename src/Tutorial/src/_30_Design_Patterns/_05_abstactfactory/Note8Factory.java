package Tutorial.src._30_Design_Patterns._05_abstactfactory;

public class Note8Factory implements HandyFactory
{
    @Override
    public Handy getHandy(String model, String battery, String width, String height)
    {
        return new Note8(model, battery, width, height);
    }
}
