package Tutorial._30_Design_Patterns._06_Builder;

public class Haus
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

    public Haus()
    {
    }

    public Haus(String city, String street, String number, int numberOfRooms, int numberOfBath, int numberOfBed, int numberOfBalcony, boolean isDuplex, boolean hasFurniture, boolean hasCarPark, boolean hasKindPark, boolean hasPool)
    {
        this.city = city;
        this.street = street;
        this.number = number;
        this.numberOfRooms = numberOfRooms;
        this.numberOfBath = numberOfBath;
        this.numberOfBed = numberOfBed;
        this.numberOfBalcony = numberOfBalcony;
        this.isDuplex = isDuplex;
        this.hasFurniture = hasFurniture;
        this.hasCarPark = hasCarPark;
        this.hasKindPark = hasKindPark;
        this.hasPool = hasPool;
    }
    @Override
    public String toString()
    {
        return "Haus{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", number='" + number + '\'' +
                ", numberOfRooms=" + numberOfRooms +
                ", numberOfBath=" + numberOfBath +
                ", numberOfBed=" + numberOfBed +
                ", numberOfBalcony=" + numberOfBalcony +
                ", isDuplex=" + isDuplex +
                ", hasFurniture=" + hasFurniture +
                ", hasCarPark=" + hasCarPark +
                ", hasKindPark=" + hasKindPark +
                ", hasPool=" + hasPool +
                '}';
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public String getStreet()
    {
        return street;
    }

    public void setStreet(String street)
    {
        this.street = street;
    }

    public String getNumber()
    {
        return number;
    }

    public void setNumber(String number)
    {
        this.number = number;
    }

    public int getNumberOfRooms()
    {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms)
    {
        this.numberOfRooms = numberOfRooms;
    }

    public int getNumberOfBath()
    {
        return numberOfBath;
    }

    public void setNumberOfBath(int numberOfBath)
    {
        this.numberOfBath = numberOfBath;
    }

    public int getNumberOfBed()
    {
        return numberOfBed;
    }

    public void setNumberOfBed(int numberOfBed)
    {
        this.numberOfBed = numberOfBed;
    }

    public int getNumberOfBalcony()
    {
        return numberOfBalcony;
    }

    public void setNumberOfBalcony(int numberOfBalcony)
    {
        this.numberOfBalcony = numberOfBalcony;
    }

    public boolean isDuplex()
    {
        return isDuplex;
    }

    public void setDuplex(boolean duplex)
    {
        isDuplex = duplex;
    }

    public boolean isHasFurniture()
    {
        return hasFurniture;
    }

    public void setHasFurniture(boolean hasFurniture)
    {
        this.hasFurniture = hasFurniture;
    }

    public boolean isHasCarPark()
    {
        return hasCarPark;
    }

    public void setHasCarPark(boolean hasCarPark)
    {
        this.hasCarPark = hasCarPark;
    }

    public boolean isHasKindPark()
    {
        return hasKindPark;
    }

    public void setHasKindPark(boolean hasKindPark)
    {
        this.hasKindPark = hasKindPark;
    }

    public boolean isHasPool()
    {
        return hasPool;
    }

    public void setHasPool(boolean hasPool)
    {
        this.hasPool = hasPool;
    }
}
