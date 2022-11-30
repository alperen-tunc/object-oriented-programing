package op2.t04_entwurfsmuster.t01_strategy.aufgaben.aufgabe_3_sortieralgorithmen.lösung;
public class QuickSort implements SortierStrategie {
    private int laenge;
    private int[] zahlen;
    @Override
    public int[] sortiere(int[] zahlen) {

        if(zahlen==null || zahlen.length==0){
            return zahlen;
        }

        this.zahlen = zahlen;
        laenge = zahlen.length;
        quicksort(0, laenge -1);
        return this.zahlen;
    }

    private void quicksort(int niedrig, int hoch){
        int i = niedrig, j = hoch;

        // Wir holen uns das Pivot Element aus der Mitte der Liste:
        int pivot = zahlen[niedrig + (hoch - niedrig)/2];

        // Wir teilen die Liste in zwei Listen auf:
        while(i <= j){
            // Ist das linke Element niedriger als das Pivotelement, dann prüfen wir das naechste Element in der linken Liste.
            while(zahlen[i] < pivot){
                i++;
            }

            // Ist das rechte Element größer als das Pivotelement, dann prüfen wir das naechste Element in der rechten Liste.
            while (zahlen[j] > pivot){
                j--;
            }

            // Haben wir Zahlen in beiden Listen gefunden, die nicht richtig sortiert sind, dann tauschen wir diese.
            if(i <= j){
                tausche(i, j);
                i++;
                j--;
            }
        }

        // Rekursiver Aufruf:
        if (niedrig < j){
            quicksort(niedrig, j);
        }

        if(i < hoch){
            quicksort(i, hoch);
        }
    }

    private void tausche(int i, int j){
        int temp = zahlen[i];
        zahlen[i] = zahlen[j];
        zahlen[j] = temp;
    }
}

// Beim MergeSort handelt es sich, wie beim Quicksort, um ein Teile und Herrsche (Divide and Conquer) Algorithmus.
// Es teilt die empfangene Liste in zwei Teillisten und ruft sich rekursiv auf beide Teillisten auf. Anschließend
// werden beide Listen wieder zu einer zusammengeführt.
// TODO: Ist noch copy paste, muss JH noch anpassen und besser verstehen:
