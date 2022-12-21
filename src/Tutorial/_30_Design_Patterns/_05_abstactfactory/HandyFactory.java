package Tutorial._30_Design_Patterns._05_abstactfactory;

public interface HandyFactory
{
    Handy getHandy(String model, String battery, String width, String height);
}
