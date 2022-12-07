package Tutorial.src._30_Design_Patterns._05_abstactfactory;

public class S8Factory implements HandyFactory
{
    @Override
    public Handy getHandy(String model, String battery, String width, String height)
    {
        return new S8(model, battery, width, height);
    }
}
