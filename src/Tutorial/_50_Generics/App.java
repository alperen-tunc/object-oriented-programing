package Tutorial._50_Generics;

import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        Koerper<Double, Double> koerper = new Koerper<>();

        //System.out.println(koerper.getA() + " " + koerper.getB());

        Rechner<Double, Koerper<Double, Double>> rechner = new Rechner<Double, Koerper<Double, Double>>()
        {
            @Override
            public Double rechne(Koerper<Double, Double> doubleDoubleKoerper)
            {
                double bmi = doubleDoubleKoerper.getB() / (doubleDoubleKoerper.getA() * doubleDoubleKoerper.getA());
                return bmi;
            }
        };

        try(Scanner scanner = new Scanner(System.in))
        {
            System.out.println("Groesse: ");
            koerper.setA(scanner.nextDouble());

            System.out.println("Gewicht: ");
            koerper.setB(scanner.nextDouble());

            System.out.println("BMI-Wert = " + rechner.rechne(koerper));
        }

        System.out.println("\n\nEnd of Main..");
    }
}
