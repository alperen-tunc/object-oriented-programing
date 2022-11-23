package Aufgaben;

import java.util.Scanner;

/*
 *  Erstellen Sie ein Java-Programm, in dem Sie
 *  - den enum Kyu fortlaufend nummeriert { Braun = 1, Blau, Grün, OrangeGrün, Orange, GelbOrange, Gelb, WeißGelb, Weiß } einführen
 *  - dem Benutzer in einer Schleife eine Auswahl präsentieren
 *      - Kyu-Grad (1)
 *      - Gürtel-Farbe (2)
 *      - Nächste Prüfung (3)
 *  - Bei der ersten Auswahl gibt der Benutzer seinen Kyu-Grad (zwischen 1 und 9) ein und bekommt die Gürtelfarbe ausgegeben
 *  - Bei der zweiten Auswahl sollen dem Benutzer die möglichen Gürtelfarben ausgegeben werden.
 *      - anschließend gibt der Benutzer eine Farbe ein und bekommt den Kyu-Grad als Ausgabe.
 *  - Bei der dritten Auswahl sollen dem Benutzer wieder die möglichen Gürtelfarben ausgegeben werden.
 *      - Der Benutzer gibt seine aktuelle Gürtelfarbe ein und bekommt als Ausgabe die Farbe des nächsten Gürtels.
 *
 *  Hinweis: Kyu sind die Ränge in japanischen Kampfkünsten, hier speziell die Ränge des deutschen Judo-Bundes.
 *  Der höchste Rang ist der braune Gürtel (also der 1. Kyu) der niedrigste der weiße (der 9. Kyu).
 */
public class aufgabe_2
{
    enum Kyu
    {
        BRAUN(1),
        BLAU(2),
        GRÜN(3),
        ORANGEGRÜN(4),
        ORANGE(5),
        GELBORANGE(6),
        GELB(7),
        WEIßGELB(8),
        WEIß(9);

        private final int gürtelfarben;

        public int getFarben(int antwortInt)
        {
            return gürtelfarben;
        }
        private Kyu(int gürtelfarbe)
        {
            this.gürtelfarben = gürtelfarbe;
        }

        public static Kyu valueOf(int gürtelfarbe)
        {
            Kyu[] gürtelfarben = Kyu.values();
            for (Kyu f : gürtelfarben)
            {
                if (f.gürtelfarben == gürtelfarbe)
                {
                    return f;
                }
            }
            return null;
        }

    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int antwortInt=0;
        String antwortString = null;
        boolean controller = false;

        for (Kyu kyu_grad : Kyu.values())
            System.out.println("Kyu-Graden sind: " + kyu_grad.name());
        System.out.println();

        while (!controller)
        {
            System.out.print("Geben Sie bitte Ihres Niveau als Zahl ein: ");
            try
            {
                antwortInt = Integer.parseInt(scanner.nextLine());
                controller = true;
            }
            catch (NumberFormatException ex)
            {
                System.err.println(ex.getMessage() + "Bitte geben Sie richtige Zahl ein: ");
            }
            if(antwortInt < 1 || antwortInt > 9)
            {
                System.out.println("Bitte geben Sie eine Zahl zwischen 1 und 9 ein: ");
                controller = false;
            }
        }

        /*
            Kyu[] kyu_grad = Kyu.values();
            System.out.println("Ihre Kyu-Grad ist : " + kyu_grad[antwortInt-1]);
        */

        System.out.println("Ihre Kyu-Grad als Farbe ist : " + Kyu.valueOf(antwortInt));


        while (controller)
        {
            System.out.print("Geben Sie bitte Ihres Niveau als Farbe ein: ");
            try
            {
                antwortString = scanner.nextLine();
            }
            catch (Exception ex)
            {
                System.err.println(ex.getMessage() + "Bitte geben Sie richtige Zahl ein: ");
            }
            assert antwortString != null;
            for(Kyu f : Kyu.values())
            {
                if (antwortString.equalsIgnoreCase(f.name()))
                {
                    System.out.println("Ihre Niveau ist: " + f.gürtelfarben);
                    controller = false;
                    break;
                }
            }
        }
        System.out.println();

        for (Kyu kyu_grad : Kyu.values())
            System.out.print(kyu_grad.name() + ", ");
        System.out.println();

        Kyu[] kyu_grad = Kyu.values();

        while (!controller)
        {
            System.out.print("Geben Sie bitte Ihres Niveau als Farbe ein, um nächste Niveau zu sehen: ");
            try
            {
                antwortString = scanner.nextLine();
            }
            catch (Exception ex)
            {
                System.err.println(ex.getMessage() + "Bitte geben Sie richtige Zahl ein: ");
            }
            assert antwortString != null;
            for(Kyu f : Kyu.values())
            {
                if (antwortString.equalsIgnoreCase(f.name()))
                {
                    System.out.println("Ihre nächste Kyu-Grad ist : " + Kyu.valueOf(f.gürtelfarben -1));
                    controller = true;
                    break;
                }
            }
        }

    }
}
