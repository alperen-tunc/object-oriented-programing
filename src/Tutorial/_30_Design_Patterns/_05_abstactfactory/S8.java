package Tutorial._30_Design_Patterns._05_abstactfactory;

public class S8 implements Handy
{
    private String model;
    private String battery;
    private String width;
    private String height;

    public S8(String model, String battery, String width, String height)
    {
        this.model = model;
        this.battery = battery;
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString()
    {
        return "S8{ " + "model='" + model + '\'' + ", battery='" + battery + '\'' + ", width='" + width + '\'' + ", " +
                "height='" + height + '\'' + '}';
    }

    @Override
    public String getModel()
    {
        return model;
    }

    @Override
    public String getBattery()
    {
        return battery;
    }

    @Override
    public String getWidth()
    {
        return width;
    }

    @Override
    public String getHeight()
    {
        return height;
    }
}
