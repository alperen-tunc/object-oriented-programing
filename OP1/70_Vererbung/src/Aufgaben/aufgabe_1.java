package Aufgaben;
/* Basisklasse Robot
 *  - Attribute: name, isHostile
 * Subklasse Terminator, erbt von Robot
 *  - Attribute: targetName
 * Subklasse Transformer, erbt von Robot
 *  - Attribute: faction
 * Subklasse Android, erbt von Robot
 *  - Attribute: isHuman
 *
 * Erstellen Sie von jeder Klasse ein Objekt und weisen sie den Attributen über die Konstruktoren beliebige Werte zu.
 * Testen Sie die Attribute durch Konsolenausgaben
 */
class Robot
{
    private String name;
    private boolean isHostile;

    public String getName()
    {
        return name;
    }

    public boolean isHostile()
    {
        return isHostile;
    }

    public Robot(String name, boolean isHostile)
    {
        this.name = name;
        this.isHostile = isHostile;
    }

    public void ausgabe()
    {
        System.out.println("Ich bin ein Roboter");
    }
}
class Terminator extends Robot
{
    private String targetName;

    public Terminator(String name, boolean isHostile, String targetName)
    {
        super(name, isHostile);
        this.targetName = targetName;
    }

    @Override
    public void ausgabe()
    {
        super.ausgabe();
        System.out.println("Ich bin ein Terminator");
    }
}
class Transformer extends Robot
{
    private String faction;

    public Transformer(String name, boolean isHostile, String faction)
    {
        super(name, isHostile);
        this.faction = faction;
    }

    @Override
    public void ausgabe()
    {
        super.ausgabe();
        System.out.println("Ich bin ein Transformers");
    }
}
class Android extends Robot
{
    private boolean isHuman;

    public boolean isHuman()
    {
        return isHuman;
    }

    public Android(String name, boolean isHostile, boolean isHuman)
    {
        super(name, isHostile);
        this.isHuman = isHuman;
    }

    @Override
    public void ausgabe()
    {
        if (isHuman)
        {
            System.out.println("Ich bin ein Mensch");
        }
        else
        {
            super.ausgabe();
            System.out.println("Ich bin ein Android");
        }
    }

}

public class aufgabe_1
{
    public static void main(String[] args)
    {
        Robot terminator = new Terminator("Arnold", false, "tx1");

        Android android = new Android("droid", true, true);

        Transformer transformer = new Transformer("Optimus", false, "Autobots");

        terminator.ausgabe();

        android.ausgabe();

        System.out.println(transformer.getName() + " ist ein Feind? " + transformer.isHostile());

    }
}
