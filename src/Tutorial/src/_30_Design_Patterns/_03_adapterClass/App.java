package Tutorial.src._30_Design_Patterns._03_adapterClass;

public class App
{
    public static void main(String[] args)
    {
        Steckdose steckdose = new Steckdose();
        Kühlschrank kühlschrank = new Kühlschrank(220);
        Bügeleisen bügeleisen = new Bügeleisen(220);

        steckdose.gibElectric(kühlschrank);
        steckdose.gibElectric(bügeleisen);

        SamsungHandy samsungHandy = new SamsungHandy(5);
        HandyAdapter handyAdapter = new HandyAdapter(samsungHandy);

        steckdose.gibElectric(handyAdapter);

        System.out.println("\n\nEnd of Main..");
    }
}
