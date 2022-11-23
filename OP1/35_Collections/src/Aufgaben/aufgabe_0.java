package Aufgaben;
/* Aufgabe 0 (Basics)
 * Eine Einkaufsliste:
 * Im Main erzeugen Sie eine Liste vom Typ String und fügen ihr fünf Dinge (Brot, Butter, Käse, Rasierschaum, Schokolade) hinzu.
 * Lassen Sie anschließend alle Strings der Liste über eine Foreach-Schleife ausgeben.
 */


import java.util.ArrayList;
import java.util.Collections;

public class aufgabe_0
{
    public static void main(String[] args)
    {
        ArrayList<String> einkaufsListe = new ArrayList<>();
        Collections.addAll(einkaufsListe, "Brot", "Butter", "Käse", "Rasierschaum", "Schokolade");
        for (String s : einkaufsListe)
        {
            System.out.println(s);
        }
    }
}
