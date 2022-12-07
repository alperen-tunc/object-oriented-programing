package Tutorial.src._30_Design_Patterns._06_Builder;

public class ImmobilienMakler
{
    public static void main(String[] args)
    {
        Haus haus1 = new Haus();
        haus1.setCity("istanbul");
        haus1.setStreet("Anneler");
        haus1.setNumber("12");

        Haus haus2 = new Haus("Wuppertal", "Freedrich", "23", 3, 2, 2, 1, false, false, false, true, false);

        printHaus(haus1);
        printHaus(haus2);



        System.out.println("\n\nEnd of Main..");
    }

    protected static void printHaus(Haus haus)
    {
        System.out.println();
        System.out.println("Haus wurde gefügt -> " + haus);
    }
}
