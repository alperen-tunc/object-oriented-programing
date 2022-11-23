package templade;

import java.util.*;

public class collektions
{
    public static void main(String[] args)
    {
        System.out.println("------Listen--------");
        // LISTEN : ArrayList, LinkedList, Vector, Stack
        // Listen (Interface List): geordnete Datenstrukturen auf die man wie auf Felder mit einem numerischen Index zugreifen kann.
        // Im Unterschied zu Feldern (Array) erlauben sie das Einfügen an einer beliebigen Stelle.
		/*
		 * Einige wichtige Methoden
		    size()
			add()
			remove()
			contains()
			Iterator iterator()
			get()
			set()
		 */

        // ARRAYLIST:
		/*
		 * ArrayList realisiert eine lineare Liste als dynamisches Array.
		   Wahlfreier Zugriff ist schneller als bei LinkedList, Einfügen und Löschen dagegen langsamer.
		   ArrayList ist besonders bei überwiegend lesendem Zugriff oder bei kleinen Listen vorzuziehen.
		   Funktion: Wenn ein Element hinzugefügt wird, wird es im Array platziert.
		   			 Wenn das Array nicht groß genug ist, wird ein neues, größeres Array erstellt, um das alte zu ersetzen, und das alte wird entfernt.
		 */
        System.out.println("------ArrayList--------");
        ArrayList<String> autoList = new ArrayList<String>(); // In den spitzen Klammern <> steht der Datentyp der Liste. Dies können alle komplexen Datentypen sein.
        autoList.add("BMW");
        autoList.add("Audi");
        autoList.add("Ford");
        autoList.add("Hyundai");
        autoList.add("Peugeot");

        // Abfragen der ganzen Liste der Autos
        System.out.println(autoList); // Anders als bei Arrays ist hier kein "Arrays.toString()" erforderlich.

        // Ausgabe eines Eintrages (Elements) aus der Liste Auto mit Angabe des Index in diesem Beispiel Index 0 entspricht dem ersten Eintrag also "BMW"
        System.out.println(autoList.get(0));

        // Ausgabe der Anzahl der Einträge (Elemente) in der Liste Auto:
        System.out.println(autoList.size());

        // Ändern eines Eintrages (Elements) mit .set() Methode
        autoList.set(2, "Opel");  // Autos.set(Index des Elements was geändert werden soll, der neue Wert der eingetragen werden soll);
        // Abfrage der ganzen Liste um die Änderung zu sehen:
        System.out.println(autoList);

        // Löschen eines Eintrages(Elements) der Liste Auto mit Angabe des Index:
        autoList.remove(3);
        // Abfrage der ganzen Liste und die Anzahl der Einträge (Elemente) um die Änderung zu sehen:
        System.out.println(autoList + " Anzahl Elemente: " + autoList.size());

        // Abfrage, ob ein bestimmter Eintrag / Wert in der Liste ist mit der Methode .contains();
        Boolean inDerListe = autoList.contains("Audi"); // die Methode gibt einen Boolean true zurück falls vorhanden ansonsten false
        System.out.println(inDerListe); // Ausgabe des Wertes den wir im Boolean InderListe gespeichert haben

        autoList.add("Mazda");
        System.out.println(autoList);

        System.out.println();
        // Wichtig: Collections können nur Objekte aufnehmen.
        // Um eine Liste von Integer erstellen zu können, müssen Wrapperklassen verwendet werden. Zu jedem primitiven Datentyp gibt es eine Wrapperklasse.
        //ArrayList<int> intList = new ArrayList<int>(); // Geht nicht!
        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(15); // die Add-Methode nimmt Objekte vom Typ Integer. Hierbei wird der primitive Typ automatisch von der Wrapperklasse umhüllt. Dies nennt sich "boxing".
        intList.add(Integer.valueOf(42)); // Hier ist der Befehl vollständig ausgeschrieben. Da das Boxing automatisch stattfindet, können wir das "Integer.valueOf()" auch weglassen.
        Integer I = 100; // Automatisches Boxing.
        intList.add(I);
        System.out.println(intList);

        // 	***********************************************************************************************************************
        System.out.println("COLLECTIONS-KLASSE");

        // Sortieren:
        Collections.sort(autoList);
        System.out.println(autoList);

        // Mischen:
        Collections.shuffle(autoList);
        System.out.println(autoList);

        /*
            Weitere wichtige Methoden:
            addAll();
            binarySearch();
            swap();
        */

        // 	***********************************************************************************************************************
        System.out.println("\n------Mengen--------");
        // MENGEN: HashSet, TreeSet
        // Mengen (abstrakte Klasse Set): Eine Implementierung mathematischer Mengen. Objekte können nur einmal in einer Menge vorkommen. Man kann prüfen, ob
        // bestimmte Objekte in einer Menge enthalten sind. Eine Reihenfolge oder Ordnung in der Menge ist nicht relevant.
		/*
		 * Einige wichtige Methoden:
		 * 	size()
			add()
			remove()
			contains()
			Iterator iterator()
		 */

        // HASHSET:
		/*
		 *HashSet realisiert eine ungeordnete Menge von Elementen, auf die mit Mengenoperationen zugegriffen werden kann.
		  Die Reihenfolge der Iteration ist ungeordnet und muss nicht reproduzierbar sein.
		  Ein HashSet ist eine Sammlung von Elementen, bei denen jedes Element einzigartig ist
		 */

        System.out.println("------HashSet--------");
        HashSet<String> autoSet = new HashSet<String>();
        autoSet.add("BMW");
        autoSet.add("Audi");
        autoSet.add("Ford");
        autoSet.add("BMW");
        autoSet.add("Hyundai");
        autoSet.add("Peugeot");
        autoSet.add("Hyundai");
        autoSet.add("Peugeot");

        System.out.println(autoSet); // Dadurch das jedes Element einzigartig ist, werden alle gleichen Werte nicht eingetragen
        System.out.println(autoSet.contains("Mazda")); // Auch wie bei Listen mit contains() Suche nach einem Element in der Menge
        autoSet.remove("Ford"); // Auch wie bei Listen mit remove() jedoch nicht über den Index, sondern über den Wert
        System.out.println(autoSet);
        // ***********************************************************************************************************************

        System.out.println("\n------Verzeichnisse--------");
        // VERZEICHNISSE: HashMap, TreeMap
        /*
         * Map repräsentiert eine Menge von Objekt-Paaren, wobei jeweils ein Objekt den Schlüssel zum Zugriff auf das dazugehörige andere Objekt darstellt.
         */
        // Wichtige Methoden HashMap :
        /*
         * 	size()
            get()
            put()
            containsKey()
            containsValue()
            Set keySet()
            Collection values()
            Set entrySet()
         */

        // HASHMAP:
        /*
         * Bei ArrayList haben Sie gelernt, dass Elemente als geordnete Sammlung gespeichert werden und Sie mit einer Indexnummer (int) darauf zugreifen können.
         * Bei einer HashMap jedoch speichern Sie Elemente als "Schlüssel / Wert" -Paare, und Sie können sie durch einen Index eines anderen Typs (zB. String) abfragen.
         */
        System.out.println("------HashMap--------");
        HashMap<String, Integer> zahlen1 = new HashMap<String, Integer>();
        zahlen1.put("Eins", 1);
        zahlen1.put("Zwei", 2);
        zahlen1.put("Drei", 3);

        System.out.println(zahlen1.size());
        System.out.println(zahlen1.get("Drei")); // Gibt die Zahl aus die in Verbindung mit dem Schlüssel "Drei" gespeichert wurde
        System.out.println(zahlen1.containsKey("Eins")); // Abruf, ob ein Schlüssel mit "Eins" existiert gibt bool zurück true oder false
        System.out.println(zahlen1.containsValue(2)); // Abruf, ob ein Wert mit 2 existiert gibt bool zurück true oder false
    }
}
