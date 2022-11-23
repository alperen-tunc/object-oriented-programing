/*
Aufgabe_01_01_01

Zu Beginn des Programmes wird der Variable a der Wert 1000 zugewiesen.

Anschließend wird in der Variable b das Ergebnis der Rechnung „a geteilt durch 10“ abgespeichert.

Daraufhin wird die Variable c mit dem Ergebnis der Rechnung „b geteilt durch 10“gefüllt.

Schließlich wird der Variablen d das Ergebnis aus „c geteilt durch 10“ zugewiesen.

Zum Schluss werden die Werte von a, b, c und d ausgegeben und das Programm endet.
 */

package Aufgaben;

public class Aufgabe_1
{
    public static void main(String[] args)
    {
        int a = 1000;
        int b = a / 10;
        int c = b / 10;
        int d = c / 10;

        System.out.println(a + ", " + b + ", " + c + ", " + d);

        System.out.printf("%d, %d, %d, %d\n", a, b, c, d);

        System.out.println(a + b); // Hier ist Ergebnis wie Normal ein Integer.
        System.out.println("" + a + b); // Hier handelt es sich um ein String.

    }
}
