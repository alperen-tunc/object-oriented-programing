package Aufgaben;
/*
Schreiben Sie bitte ein Java-Programm, das
a) eine Integer-Variable i einführt (deren Wert sie selbst bestimmen können)
b) eine Float-Variable f einführt (deren Wert sie selbst bestimmen können)
c) eine Char-Variable c einführt (deren Wert sie selbst bestimmen können)
d) einen String s einführt, der durch eine for-Schleife wie folgt initialisiert werden soll:
	- die Schleife soll i-mal durchlaufen werden
	- bei jedem Durchlauf soll s um c und f verlängert werden
e) eine for-Schleife startet, die 3-mal durchlaufen wird und pro Durchlauf s (mit Umbruch) ausgibt
*/

public class Aufgabe_04
{
    public static void main(String[] args)
    {
        int i = 5;
        float f = 2.2F;
        char c = 'ä';
        String s = "";

        for (int a=0; a<i; a++)
        {
            s = s + c + f;
        }

        for (int q=0; q<3; q++)
        {
            System.out.println(s);
        }

    }
}
