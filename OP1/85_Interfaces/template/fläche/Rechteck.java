package template.fläche;

public class Rechteck implements HatFläche
{
    private double a;
    private double b;

    public double getA()
    {
        return a;
    }

    public void setA(double a)
    {
        this.a = a;
    }

    public double getB()
    {
        return b;
    }

    public void setB(double b)
    {
        this.b = b;
    }

    public Rechteck(double a, double b)
    {
        this.a = a;
        this.b = b;
    }

    @Override
    public double berechneFläche()
    {
        return a * b;
    }
}
