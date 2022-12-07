package _06_state._01_vorher;

public class MainApp
{
    public static void main(String[] args)
    {
        KaugummiAutomat kaugummiautomat = new KaugummiAutomat(5);

        System.out.println(kaugummiautomat); // kaugummiautomat.toString()
        System.out.println("============================================================");
        kaugummiautomat.münzeEinwerfen();
        kaugummiautomat.hebelDrehen();  // Anzahl = 4
        System.out.println("============================================================");
        System.out.println(kaugummiautomat);
        System.out.println("============================================================");
        kaugummiautomat.münzeEinwerfen();
        kaugummiautomat.münzeAuswerfen();
        kaugummiautomat.hebelDrehen(); // Anzahl = 4 (Keine Änderung)
        System.out.println("============================================================");
        System.out.println(kaugummiautomat);
        System.out.println("============================================================");
        kaugummiautomat.münzeEinwerfen();
        kaugummiautomat.hebelDrehen(); // Anzahl = 3
        System.out.println("============================================================");
        kaugummiautomat.münzeEinwerfen();
        kaugummiautomat.hebelDrehen(); // Anzahl = 2
        System.out.println("============================================================");
        kaugummiautomat.münzeAuswerfen(); // Keine Wirkung
        System.out.println("============================================================");
        System.out.println(kaugummiautomat);
        System.out.println("============================================================");
        kaugummiautomat.münzeEinwerfen();
        kaugummiautomat.münzeEinwerfen();
        kaugummiautomat.hebelDrehen(); // Anzahl = 1
        kaugummiautomat.münzeEinwerfen();
        kaugummiautomat.hebelDrehen(); // Anzahl = 0 (Leer)
        kaugummiautomat.münzeEinwerfen();
        kaugummiautomat.hebelDrehen();
        System.out.println("============================================================");
        System.out.println(kaugummiautomat);
        System.out.println("============================================================");
        kaugummiautomat.nachfüllen(3);
        System.out.println("============================================================");
        System.out.println(kaugummiautomat);
        System.out.println("\n\nEnd of Main..");
    }
}
