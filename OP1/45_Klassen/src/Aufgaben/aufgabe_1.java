package Aufgaben;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/*
(- und + hier in der Aufgabenstellung dienen nur zur Auflistung der einzelnen Punkte und haben nichts mit den Zugriffsmodifizierern im UML-Diagramm zu tun)
 Schreiben Sie bitte ein Programm, in dem ...
 - eine Klasse Firma definiert wird
   + die Member der Klasse sind:
     - String: name
     - Double-Liste: konten
     - Methode: getSumme
       + Funktion: berechnet den Gesamtbetrag aller Listenelemente
       + Rückgabewert: Gesamtbetrag
     - Getter und Setter für die Attribute.

 - In der Main erstellen Sie zwei Firmen und geben die Werte testweise aus.

 Erstellen Sie zu der Klasse ein UML Klassendiagramm.
*/
class Firma
{
    private String name;
    private ArrayList<Double> doubleArrayList = new ArrayList<>();
    private double summe;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setDoubleArrayList(ArrayList<Double> doubleArrayList)
    {
        this.doubleArrayList = doubleArrayList;
    }

    public double getSumme()
    {
        for (Double f : doubleArrayList)
        {
            summe += f;
        }
        return summe;
    }

}
public class aufgabe_1
{
    public static void main(String[] args)
    {
        Firma f1 = new Firma();
        Firma f2 = new Firma();

        f1.setName("Google");
        f1.setDoubleArrayList(new ArrayList<>(Arrays.asList(12.2, 23.3, 45.4)));

        f2.setName("SAP");
        f2.setDoubleArrayList(new ArrayList<>(Arrays.asList(12.2, 23.3, 45.4)));

        ArrayList<Firma> firmen = new ArrayList<>();
        firmen.add(f1);
        firmen.add(f2);

        for (Firma f : firmen)
        {
            System.out.println("Firmen name: " + f.getName() + "Summe von Konten: " + f.getSumme());
        }

    }
}