package Tutorial.src._30_Design_Patterns._06_Builder;

public class ImmobilienMakler2
{
    public static void main(String[] args)
    {
        Haus haus2 = HausBuilder.startBuild()
                        .setCity("Konya")
                                .setNumber("34")
                                        .setNumberOfBalcony(1)
                                                .setNumberOfBed(2)
                                                        .setStreet("Bilge")
                                                                .setHasFurniture(true)
                                                                        .setNumberOfRooms(3)
                                                                                .build();

        printHaus(haus2);

        System.out.println("\n\nEnd of Main..");
    }

    protected static void printHaus(Haus haus)
    {
        System.out.println();
        System.out.println("Haus wurde gefügt -> " + haus);
    }
}
