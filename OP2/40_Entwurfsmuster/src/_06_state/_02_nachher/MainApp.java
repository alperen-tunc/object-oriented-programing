package _06_state._02_nachher;

public class MainApp
{
    public static void main(String[] args)
    {

        KaugummiAutomat kaugummiAutomat = new KaugummiAutomat(2);

        System.out.println(kaugummiAutomat);

        kaugummiAutomat.münzeEinwerfen();
        kaugummiAutomat.hebelDrehen();

        System.out.println(kaugummiAutomat);

        kaugummiAutomat.münzeEinwerfen();
        kaugummiAutomat.hebelDrehen();
        kaugummiAutomat.münzeEinwerfen();
        kaugummiAutomat.hebelDrehen();

        kaugummiAutomat.nachfüllen(5);
        kaugummiAutomat.münzeEinwerfen();
        kaugummiAutomat.hebelDrehen();

        System.out.println(kaugummiAutomat);

        System.out.println("\n\nEnd of Main..");
    }

}
