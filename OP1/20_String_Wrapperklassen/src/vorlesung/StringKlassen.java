package vorlesung;

public class StringKlassen
{
    // Datentyp String:
    /* Ein String ist eine Zeichenkette. Der Datentyp String hat als Wertebereich die Menge aller Zeichenketten.
     * Der Datentyp String ist in Java kein einfacher Datentyp wie etwa int oder double oder boolean, sondern eine Klasse. Eine Variable vom Typ String
     * enthält daher nicht den String selbst, sondern sie enthält einen Verweis auf ein Objekt der Klasse String.
     *
     * Strings sind IMMUTABLE. Das heißt: Ihr Wert kann nicht verändert werden.
     * Der Variable kann ich zwar einen neuen String zuweisen, aber ich kann nicht einzelne Zeichen im String verändern.
     * So liefert replace() zum Beispiel immer einen neuen String zurück, anstatt den ursprünglichen String selbst zu verändern.
     */
    public static void main(String[] args)
    {
        System.out.println("STRING");
        String s = new String(); // Neuen String erstellen.
        //String s = ""; // Entspricht genau dieser Zeile.
        System.out.println(s);

        String zweiundvierzig = String.valueOf(42);
        System.out.println(zweiundvierzig);

        s = new String("Hallo Welt"); // Neuen String aus "Hallo Welt" erstellen.
        //s = "Hallo Welt"; // Entspricht genau dieser Zeile.
        System.out.println(s);

        // Wir verzichten in der Regel auf new String() und schreiben einfach folgendes:
        String string1 = "Halloooo Welttttt!";
        System.out.println(string1);

        // String ist ein komplexer Datentyp, daher kann ein String auch Methoden haben.
        int länge = string1.length(); // Die Anzahl der Zeichen (Unicode Units)
        System.out.println(länge);

        System.out.println(string1.charAt(4)); // Das Zeichen an Index 4.
        System.out.println(string1.substring(6,10)); // Die Zeichen zwischen Index 6 und 10. (Zeichen an Position 6, 7, 8 und 9)
        System.out.println(string1.indexOf("lo")); // Der Index des ersten Vorkommens der Zeichen "lo";
        System.out.println(string1.lastIndexOf('t')); // Der letzte index des Zeichens 't'

        String[] teilstrings = string1.split(" "); // mit split() können wir einen String in mehrere Teile zerlegen. Dazu übergeben wir ein Zeichen, an dem der String getrennt werden soll. Das Ergebnis davon ist ein Array.
        System.out.println(teilstrings[0] + " " + teilstrings[1]);

        String replaced = string1.replace("o", "öäü"); // Replace ersetzt alle angegebenen Zeichen durch neue Zeichen.
        System.out.println(replaced); // Das Ergebnis ist ein neuer String.
        System.out.println(string1); // Der alte String wird dabei nicht verändert.

        System.out.println();

        // Strings vergleichen
        // Strings werden nicht über ==, sondern mithilfe der Methode "equals()" verglichen, die bei Objekten anwendung findet.
        String bsp1 = "Hallo";
        String bsp2 = "Hallo";

        System.out.printf("Vergleiche String bsp1 %s und String bsp2 %s: \n", bsp1, bsp2);
        System.out.println("Sind die Strings gleich? " + bsp1.equals(bsp2));
        // equals() vergleicht den Inhalt der Objekte.
        // == vergleicht bei Objekten die Speicheradresse.

        // Hinweis:
        // Gleiche String-Literale erhalten zur Compile-Zeit dieselbe Speicheradresse:
        System.out.println(bsp1 == bsp2);

        StringBuilder sb = new StringBuilder("Hallo");
        System.out.println("== zwischen String und StringBuilder: " + (bsp1 == sb.toString())); // Der String und der String im StringBuilder haben unterschiedliche Adressen.
        System.out.println("equals zwischen String und StringBuilder: " + bsp1.equals(sb.toString())); // Der Inhalt beider Strings ist aber gleich.


        System.out.println("STRINGBUFFER");
        // StringBuffer:
        // Der StringBuffer stellt eine Charakter-Sequenz dar, die beliebig verändert werden und
        // zum Schluss dann mit der toString() Methode in ein String-Objekt umgewandelt werden kann.
        // Während bei Neubelegung einer String-Variable jedes Mal ein neues String-Objekt erzeugt wird,
        // kann man beim StringBuffer immer am selben Objekt arbeiten. Der StringBuffer ist daher MUTABLE.

        // Wichtige Methoden des StringBuffer sind insert() und append()

        StringBuffer stringBuffer = new StringBuffer("guten Morgen"); // Erstellt ein Objekt vom Typ StringBuffer mit dem Inhalt "guten Morgen".
        System.out.println(stringBuffer.toString()); // Über Aufruf von toString() erhalten wir den String-Inhalt des StringBuffers.

        stringBuffer.append(" an Euch alle."); // Fügt dem StringBuffer den String "an Euch alle." hinzu.
        System.out.println(stringBuffer); // Der Aufruf von toString() ist implizit und kann hier auch weggelassen werden.

        stringBuffer.insert(0, "Einen wunderschönen "); // Fügt an Stelle 0 einen String hinzu.
        System.out.println(stringBuffer);

        stringBuffer.insert(stringBuffer.indexOf("an") - 1, ". Grüße"); // Fügt am angegebenen Index eine Zeichenkette hinzu.
        System.out.println(stringBuffer);

        String ergebnis = stringBuffer.toString(); // Mit toString() fragen wir den String-Wert im StringBuffer ab.
        System.out.println(ergebnis);

        System.out.println();
        System.out.println("STRINGBUILDER");
        // StringBuilder:
        // Ist dem StringBuffer sehr ähnlich. Er stellt ebenfalls eine veränderliche Folge von Zeichen dar.
        // Der Unterschied liegt in der Synchronisation. Der StringBuffer ist "Thread-Safe".
        // Daher wird empfohlen, den StringBuffer bei Multi-Threading zu verwenden.
        // Für unsere Zwecke reicht aber meistens der StringBuilder.

        StringBuilder stringBuilder = new StringBuilder("Hallo Welt!");

        // Gleiche Methoden wie beim StringBuffer
        stringBuilder.append(" Guten").append(" Morgen.").append("\n"); // Befehle verketten. Das wird "chaining" genannt.
        System.out.println(stringBuilder.toString()); // toString() gibt den String-Inhalt des Builders zurück. Der Aufruf von toString() bei Objekten und println ist immer automatisch und kann daher weggelassen werden.

        StringBuilder stringBuilder2 = new StringBuilder(100); // Anfangskapazität des StringBuilders setzen. Damit wird das interne Array auf die entsprechende Größe festgelegt.
        System.out.println("Kapazität des Builders: " + stringBuilder2.capacity());
        System.out.println("Kapazität des ersten Builders: " + stringBuilder.capacity());

    }
}
