package template.fläche;

public class Kreis implements HatFläche
{
    private double radius;

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public Kreis(double radius)
    {
        this.radius = radius;
    }

    @Override
    public double berechneFläche()
    {
        return (Math.PI * (Math.pow(radius, 2)));
    }
}
