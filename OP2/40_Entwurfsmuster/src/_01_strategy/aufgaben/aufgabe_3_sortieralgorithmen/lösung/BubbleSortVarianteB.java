package op2.t04_entwurfsmuster.t01_strategy.aufgaben.aufgabe_3_sortieralgorithmen.lösung;
public class BubbleSortVarianteB implements SortierStrategie {
    @Override
    public int[] sortiere(int[] zahlen) {
        int buffer;
        for (int i = 0; i < zahlen.length - 1; i++) {
            if (zahlen[i] < zahlen[i + 1]) {
                continue;
            }
            buffer = zahlen[i];
            zahlen[i] = zahlen[i + 1];
            zahlen[i + 1] = buffer;
            sortiere(zahlen);
        }
        return zahlen;
    }
}

// Bubblesort ist der einfachste, aber auch einer der langsamsten Sortieralgorithmen.
// Bubblesort vergleicht alle benachbarten Elemente in einer Liste und tauscht diese
// in die richtige Reihenfolge.
