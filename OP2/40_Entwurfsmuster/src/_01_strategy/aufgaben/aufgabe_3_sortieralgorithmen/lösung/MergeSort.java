package _01_strategy.aufgaben.aufgabe_3_sortieralgorithmen.lösung;
public class MergeSort implements SortierStrategie {
    @Override
    public int[] sortiere(int[] zahlen){
        // Teile:
        if (zahlen.length > 1){
            int mitte = (int)(zahlen.length/2);

            int[] l = new int[mitte];
            for (int i = 0; i <= mitte -1; i++){
                l[i] = zahlen[i];
            }

            int[] r = new int[zahlen.length - mitte];
            for(int i = mitte; i <= zahlen.length -1; i++){
                r[i-mitte] = zahlen[i];
            }

            l = sortiere(l);
            r = sortiere(r);

            return merge(l, r);
        }
        else{
            return zahlen;
        }
    }

    public int[] merge(int[] l, int[] r){

        int[] neul = new int[l.length + r.length];
        int indexl = 0;
        int indexr = 0;
        int indexergebnis = 0;
        while (indexl < l.length && indexr < r.length) {
            if (l[indexl] < r[indexr]) {
                neul[indexergebnis] = l[indexl];
                indexl += 1;
            } else {
                neul[indexergebnis] = r[indexr];
                indexr += 1;
            }
            indexergebnis += 1;
        }
        while (indexl < l.length) {
            neul[indexergebnis] = l[indexl];
            indexl += 1;
            indexergebnis += 1;
        }
        while (indexr < r.length) {
            neul[indexergebnis] = r[indexr];
            indexr += 1;
            indexergebnis += 1;
        }
        return neul;
    }
}

// Das Strategy-Muster
// Allgemeines: Ist ein Verhaltensmuster, welches dir erlaubt eine Familie von Algorithmen zu definieren und jeden Algorithmus in eine seperate Klasse
// steckt und ihre Objekte austauschbar macht.
// Motivation: Wir verwenden das Strategie Muster, wenn wir verschiedene Varianten (Strategien) eines Algorithmus in einem Objekt brauchen und diese zur
// Laufzeit austauschen möchten.
// Erklaerung: Im Strategy-Muster kann das Verhalten einer Klasse oder deren Algorithmen zur Laufzeit ausgetauscht werden. Wir kreieren Objekte, die
// verschiedene Strategien repraesentieren und ein Kontextobjekt, dessen Verhalten sich nach je nach eingesetzter Strategie, aendert.

// Vorteile:
// - Algorithmen, die in einem Objekt verwendet werden, können zur Laufzeit ausgetauscht werden.
// - Wir können die Implementationsdetails der Strategien isolieren von dem Code, der die Strategien ausführt.
// - Open/Closed Prinzip: Es können einfach neue Strategien hinzugefügt werden (Open: offen für Erweiterungen), ohne bestehenden Code abaendern zu müssen (Closed: geschlossen für Aenderungen).

// Nachteile:
// - Hat das Programme nur wenige Algorithmen, die sich selten aendern, gibt es keinen ausreichenden Grund das Programm mit neuen Klassen und Interfaces zu verkomplizieren.
// - Der Client muss um die Unterschiede der Algorithmen wissen, um den angemessenen auszuwaehlen.
// - Einige moderne Computersprachen unterstützen funktionale Programmierung und können dieselbe Funktionalitaet, ohne zusaetzliche Klassen und Interfaces, einfacher umsetzen.

// Implementierungsschritte Strategy-Muster
// 1. Erstelle ein Interface mit einer abstrakten Methode.
// 2. Erstelle konkrete Klassen, die das Interface implementieren. Für jede konkrete Strategie eine Klasse.
// 3. Erstelle eine Kontextklasse. Eine Kontextklasse muss ein Attribut bereithalten um eine Referenz zu einer Strategie abspeichern zu können.
// Die Kontextklasse funktioniert mit allen Strategien durch dasselbe Interface, welches nur eine Methode bereitstellt, um die gewaehlte Strategie
// auszuführen. Durch das Strategypattern wird die Kontextklasse unabhaengig von konkreten Strategien und der Entwickler kann beliebig neue Algorithmen / Strategien
// hinzufügen oder bestehende aendern, ohne die Kontextklasse oder bestehende Strategieklasssen anpassen zu müssen.

