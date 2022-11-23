package komposition.Vorlesung;

public class Komposition
{
    public static void main(String[] args)
    {
        Gebäude gebäude = new Gebäude("Schule", 1);
        gebäude.addRaum(2);
        gebäude.addRaum(3);
        gebäude.addRaum(4);

        System.out.println("Raumnummer des Gebäudes: ");
        System.out.println(gebäude.getRäume());
    }
}
