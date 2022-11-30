package _01_strategy.aufgaben.aufgabe_3_sortieralgorithmen.lösung;
public class Main {
    public static void main(String[] args) {

        // Beispiel mit Suchalgorithmen:
        int[] unsortierteZahlen = {3, 1, 6, 5, 4, 2};
        int[] zahlen = unsortierteZahlen;

        // Wir verwenden als Sortier Strategie einen Bubblesort.
        SortierKontext sortierKontext = new SortierKontext(new BubbleSortVarianteA());
        // sortierKontext.SetSortierStratgie(new BubbleSort());

        int[] ergebnis = sortierKontext.sortiere(zahlen);

        System.out.println("Bubblesort: ");
        for(int zahl : ergebnis){
            System.out.println(zahl);
        }

        zahlen = unsortierteZahlen;

        // Wir aendern zur Laufzeit, die Sortierstrategie zu Quicksort.
        sortierKontext.SetSortierStratgie(new QuickSort());
        ergebnis = sortierKontext.sortiere(zahlen);

        System.out.println("\nQuicksort:");
        for(int zahl : ergebnis){
            System.out.println(zahl);
        }

        zahlen = unsortierteZahlen;

        // Wir aendern zur Laufzeit, die Sortierstrategie zu Mergesort.
        sortierKontext.SetSortierStratgie(new MergeSort());
        ergebnis = sortierKontext.sortiere(zahlen);

        System.out.println("\nMergesort:");
        for(int zahl : ergebnis){
            System.out.println(zahl);
        }
    }
}