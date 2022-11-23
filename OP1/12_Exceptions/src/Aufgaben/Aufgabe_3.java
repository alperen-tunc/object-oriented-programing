package Aufgaben;
/*
Schreiben Sie ein Programm, bei dem ein Array mittels Schleife befüllt wird und zu viele Elemente hinzugefügt werden.
Fangen Sie den dabei auftretenden Fehler ab.
 */

public class Aufgabe_3
{
    public static void main(String[] args)
    {
        int[] arr = new int[5];

        try
        {
            for (int i=0; i<7; i++)
            {
                arr[i] = i*i;
                System.out.println(arr[i]);
            }
        }
        catch (Exception ex)
        {
            System.out.println("Fehler! " + ex.getMessage());
        }
    }
}
