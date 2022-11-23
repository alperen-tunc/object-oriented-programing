package Aufgaben;
/* Aufgabe 0
 * Sie möchten Ihre Musiksammlung verwalten.
 * Erstellen Sie ein 2-Dimensionales Array "Album" vom Typ String mit der Größe 5 und 2 (Es ist ein kleines Album).
 * Fügen Sie dem Album nun 5 Songs hinzu. In der ersten Dimension stehen die Interpreten oder die Komponisten, in der zweiten die Songs. Zum Beispiel:
	Album[0][0] = "Cello Suite No. 1 in G Major"; Album[0][1] = "Johann Sebastian Bach"; (oder "Yo-Yo Ma" als Interpret)
 * In einer For-Schleife sollen dann alle Songs des Albums ausgegeben werden. Verwenden Sie GetLength() für die Schleifenbedingung.
 */

import java.util.Arrays;

public class aufgabe_0
{
    public static void main(String[] args)
    {
        String[][] album = new String[][]
                {
                        {"Nesat Ertas: ", "yolcu", "Yalan Dünya", "Gönül Dagi", "Sen Benimsin ben senin"},
                        {"Musa Eroglu: ", "Mihriban", "Candan ileri", "Yolun Sonu", "Telli Turna"}
                };

        for (int i=0; i<album.length; i++)
        {
            for (int j=0; j<album[i].length; j++)
                System.out.println(album[i][j]);
        }
        System.out.println();

        System.out.println(Arrays.deepToString(album));
        System.out.println();

        for (String[] i : album)
        {
            System.out.println(Arrays.toString(i));
        }

    }
}
