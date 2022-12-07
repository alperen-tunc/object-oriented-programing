package Tutorial.src._30_Design_Patterns._05_abstactfactory;

public class Filiale
{
    public static void main(String[] args)
    {
        S8Factory s8Factory = new S8Factory();
        Handy s8 = s8Factory.getHandy("s8, Blue", "3500MaH", "11", "18");

        Note8Factory note8Factory = new Note8Factory();
        Handy note8 = note8Factory.getHandy("Note8, grey", "4500", "12", "23");

        System.out.println(s8 + "\n" + note8);


        System.out.println("\n\nEnd of Main..");
    }
}
