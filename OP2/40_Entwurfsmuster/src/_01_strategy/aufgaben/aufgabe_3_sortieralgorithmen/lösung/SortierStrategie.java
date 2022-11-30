package op2.t04_entwurfsmuster.t01_strategy.aufgaben.aufgabe_3_sortieralgorithmen.lösung;
// Beispiel mit Sortieralgorithmen
// Das Strategieinterface ist allen konkreten Strategien bekannt. Es deklariert eine Methode, welche die Kontextklasse verwendet, um
// die Strategie auszuführen.
public interface SortierStrategie {
    public abstract int[] sortiere(int[] list);
}

// Die Kontextklasse verwendet das bei seiner Instanziierung übergebene Strategie-Objekt und kann diese bei einer Neuinstanziierung
// oder über die SetSortierStrategie Methode zur Laufzeit wechseln.
// Die Kontextklasse kommuniziert mit den Strategieobjekten nur über das Strategieinterface. Sie weiß nichts über die
// implementierten Strategien oder wie diese ausgeführt werden.
