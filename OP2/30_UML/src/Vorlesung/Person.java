package Vorlesung;

public abstract class Person
{
    private String vorname;
    private String nachname;

    public Person()
    {

    }

    public void printData()
    {
        System.out.println(vorname + " " + nachname);
    }
}
