package Tutorial.src._30_Design_Patterns._06_Builder;

public class HausBuilder
{
    private String city;
    private String street;
    private String number;

    private int numberOfRooms;
    private int numberOfBath;
    private int numberOfBed;
    private int numberOfBalcony;

    private boolean isDuplex;
    private boolean hasFurniture;
    private boolean hasCarPark;
    private boolean hasKindPark;
    private boolean hasPool;

    public static HausBuilder startBuild()
    {
        return new HausBuilder();
    }

    public Haus build()
    {
        Haus haus = new Haus();

        haus.setStreet(street);
        haus.setCity(city);
        haus.setNumber(number);

         haus.setNumberOfRooms(numberOfRooms);
         haus.setNumberOfBalcony(numberOfBalcony);
         haus.setNumberOfBed(numberOfBed);
         haus.setNumberOfBath(numberOfBath);

        haus.setDuplex(isDuplex);
        haus.setHasFurniture(hasFurniture);
        haus.setHasCarPark(hasCarPark);
        haus.setHasKindPark(hasKindPark);
        haus.setHasPool(hasPool);

        return haus;
    }

    public HausBuilder setCity(String city)
    {
        this.city = city;
        return this;
    }

    public HausBuilder setStreet(String street)
    {
        this.street = street;
        return this;
    }

    public HausBuilder setNumber(String number)
    {
        this.number = number;
        return this;
    }

    public HausBuilder setNumberOfRooms(int numberOfRooms)
    {
        this.numberOfRooms = numberOfRooms;
        return this;
    }

    public HausBuilder setNumberOfBath(int numberOfBath)
    {
        this.numberOfBath = numberOfBath;
        return this;
    }

    public HausBuilder setNumberOfBed(int numberOfBed)
    {
        this.numberOfBed = numberOfBed;
        return this;
    }

    public HausBuilder setNumberOfBalcony(int numberOfBalcony)
    {
        this.numberOfBalcony = numberOfBalcony;
        return this;
    }

    public HausBuilder setDuplex(boolean duplex)
    {
        isDuplex = duplex;
        return this;
    }

    public HausBuilder setHasFurniture(boolean hasFurniture)
    {
        this.hasFurniture = hasFurniture;
        return this;
    }

    public HausBuilder setHasCarPark(boolean hasCarPark)
    {
        this.hasCarPark = hasCarPark;
        return this;
    }

    public HausBuilder setHasKindPark(boolean hasKindPark)
    {
        this.hasKindPark = hasKindPark;
        return this;
    }

    public HausBuilder setHasPool(boolean hasPool)
    {
        this.hasPool = hasPool;
        return this;
    }
}
