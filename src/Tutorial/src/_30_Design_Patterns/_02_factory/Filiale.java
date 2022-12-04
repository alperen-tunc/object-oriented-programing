package Tutorial.src._30_Design_Patterns._02_factory;

public class Filiale
{
    public static void main(String[] args)
    {
        Handy s8 = Factory.getHandy("s8", "4000-MA", "22cm", "12cm");
        Handy note8 = Factory.getHandy("Note8", "5000-MA", "25cm", "15cm");

        System.out.println("S8 eingenschaften: ");
        System.out.println(s8);

        System.out.println("Note8 Eingenschaften: ");
        System.out.println(note8);

    }
}
