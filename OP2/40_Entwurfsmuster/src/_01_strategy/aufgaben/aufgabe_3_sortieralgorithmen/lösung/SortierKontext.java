package _01_strategy.aufgaben.aufgabe_3_sortieralgorithmen.lösung;
public class SortierKontext {
    private SortierStrategie strategie;

     public SortierKontext(SortierStrategie strategie){
         this.strategie = strategie;
     }

     // Wir implementieren diesmal eine Set-Methode um die Strategie aendern zu können, ohne die Klasse neu instanziieren zu müssen.
    public void SetSortierStratgie(SortierStrategie strategie){
        this.strategie = strategie;
    }

    // Das Klassenverhalten bzw. sein Algorithmus kann zur Laufzeit geaendert werden.
    public int[] sortiere(int[] zahlen){
        return strategie.sortiere(zahlen);
    }
}

// Bubblesort ist der einfachste, aber auch einer der langsamsten Sortieralgorithmen.
// Bubblesort vergleicht alle benachbarten Elemente in einer Liste und tauscht diese
// in die richtige Reihenfolge.
