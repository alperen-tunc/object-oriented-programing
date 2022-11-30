package _01_strategy.aufgaben.aufgabe_3_sortieralgorithmen.lösung;
public class BubbleSortVarianteA implements SortierStrategie {
    @Override
    public int[] sortiere(int[] zahlen) {
        int smaller;
		int bigger;
		boolean run = true;
		
        for (int i = 0; i < zahlen.length && run == true; i++) {
			run = false;

			for (int j = 0; j < zahlen.length - 1; j++) {
				if (zahlen[j] > zahlen[j + 1]) {
					bigger = zahlen[j];
					smaller = zahlen[j + 1];
					zahlen[j] = smaller;
					zahlen[j + 1] = bigger;
					run = true;
				}
			}
		}
        return zahlen;
    }
}

//  Quicksort gehört zu den rekursiven Sortieralgorithmen und verwendet das Teile und Herrsche Prinzip (Divide and Conquer).
//  Wir waehlen ein beliebiges Element aus einer Liste von Zahlen und bezeichnen diese Zahl als Pivotelement.
//  Wir verwenden das Pivotelement um die Liste in zwei Unterlisten aufzuteilen.
//  Wir ordnen alle Zahlen so an, dass die niedrigeren Zahlen vor dem Pivotelement gesetzt werden und die
//  höheren ordnen wir nach dem Pivotelement ein.
//  Das Pivotelement befindet sich nun an der richtigen Stelle. Wir wenden diese Schritte rekursiv auf beide Unterlisten
//  an.

