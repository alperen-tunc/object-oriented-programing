package Aufgaben;
/*
    Gegeben ist folgende String-Variable:
    String s = "Lohn eines Mitarbeiters: 2.017,00 €\n";
    s += "Gehalt eines Vorgesetzten: 4.665,00 €\n";
    s += "Honorar eines Vorstandsvorsitzenden: 11.992,56 €";

    Entnehmen Sie per String-Methoden alle Informationen aus dem String und geben Sie diese einzeln aus.
    Damit ist gemeint, dass z.B. "Lohn eines Mitarbeiters:" per print() ausgegeben wird,
     gefolgt von einer zusätzlichen ausgabe von "2.017,00 €" in einer weiteren print()-Anweisung.
      Sie müssen also durch entsprechende Methoden den vorhandenen String auseinandernehmen und verarbeiten.
 */

public class aufgabe_2
{
    public static void main(String[] args)
    {
        String s = "Lohn eines Mitarbeiters: 2.017,00 €\n";
        String s1 = "Gehalt eines Vorgesetzten: 4.665,00 €\n";
        String s2 = "Honorar eines Vorstandsvorsitzenden: 11.992,56 €\n";

        String[] sArr = s.split(":");
        System.out.print(sArr[0] + ":" + sArr[1]);

        sArr = s1.split(":");
        System.out.print(sArr[0] + ":" + sArr[1]);

        sArr = s2.split(":");
        System.out.print(sArr[0] + ":" + sArr[1]);
    }
}
