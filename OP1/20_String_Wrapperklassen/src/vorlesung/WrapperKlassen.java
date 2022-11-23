package vorlesung;

public class WrapperKlassen
{
    // Wrapper-Klassen
    /*
     * zu jedem primitiven Datentyp in Java gibt es eine korrespondierende Wrapper-Klasse. Diese kapselt die primitive Variable in einer objektorientierten
     * Hülle und stellt eine Reihe von Methoden zum Zugriff auf die Variable zur Verfügung. Zwar wird man bei der Programmierung meist die primitiven Typen
     * verwenden, doch gibt es einige Situationen, in denen die Anwendung einer Wrapper-Klasse sinnvoll sein kann:
     */

    public static void main(String[] args)
    {
        System.out.println("WRAPPERKLASSEN");

        System.out.println("Integer");
        int i = 23; // der primitive Typ "int"
        Integer I = i; // int i wird hier automatisch in Integer I gewickelt. Dies wird auch Boxing genannt. Der primitive Typ wird dabei in eine Box gelegt. Die Box ist der komplexe Typ, welcher nun den primitiven Typ beinhaltet.

        //Integer I = new Integer(i); // Die Zeile oben entspricht genau dieser Zeile. Der Aufruf über Konstruktoren ist ab Java 9 deprecated (veraltet) und sollte nicht mehr verwendet werden.
        Integer I2 = Integer.valueOf(i); // Diese Zeile entspricht auch der von oben und wird anstelle des Konstruktors verwendet.

        Integer I3 = Integer.valueOf("42"); // Einen String direkt in einen Integer konvertieren.
        //Integer I3 = Integer.parseInt("42"); // Entspricht dem Aufruf von parseInt()

        System.out.println(I3.toString()); // Ausgabe über toString().
        System.out.println(I3.intValue()); // Abfrage des im Objekt gespeicherten int-Wertes.

        System.out.println("Long");
        long l = 44;
        Long L = l; // Der primitive Typ wird vom komplexen Typ umwickelt.
        System.out.println(L.longValue());

        System.out.println("Float");
        float f = 23.55F;
        Float F = f; // In diesen Beispielen sind die Variablenbezeichner der Wrapperklassen großgeschrieben. dies dient hier nur der Veranschaulichung.

        System.out.println("Boolean");
        boolean b = true;
        Boolean B = b;
        System.out.println(B.booleanValue());

        System.out.println();
        System.out.println("METHODEN DER WRAPPER");
        // In Wrapperklassen gibt es noch weitere Methoden zum Arbeiten mit den primitiven Typen. Zum Beispiel:
        System.out.println(Integer.toBinaryString(i));
        System.out.println(Integer.toHexString(i));


        System.out.println();
        System.out.println("KONSTANTEN DER WRAPPER-KLASSEN");
        /*
         * Die numerischen Wrapper-Klassen stellen Konstanten zur Bezeichnung spezieller Elemente zur Verfügung. So gibt es in jeder der Klassen Byte, Short,
         * Integer, Long, Float und Double die Konstanten MIN_VALUE und MAX_VALUE, die das kleinste bzw. größte Element des Wertebereichs darstellen.
         * In den Klassen Float und Double gibt es zusätzlich die Konstanten NEGATIVE_INFINITY, POSITIVE_INFINITY und NaN. Sie stellen die Werte minus unendlich,
         * plus unendlich und undefiniert dar.
         */

        System.out.println("Integer:");
        System.out.println(Integer.MIN_VALUE + "<-->" + Integer.MAX_VALUE); // Ausgabe kleinster und größter Wert
        System.out.println("Long:");
        System.out.println(Long.MIN_VALUE + "<-->" + Long.MAX_VALUE);
        System.out.println("Float:");
        System.out.println(Float.MIN_VALUE + "<-->" + Float.MAX_VALUE + "; " + Float.MIN_EXPONENT + "<-->" + Float.MAX_EXPONENT);
        System.out.println(Float.NEGATIVE_INFINITY + "; " + Float.POSITIVE_INFINITY + "; " + Float.NaN);
        System.out.println(Boolean.FALSE + "<-->" + Boolean.TRUE);

        // So wie Strings sind auch die Wrapper hier immutable. Der Inhalt lässt sich also nicht direkt verändern, sondern nur, indem neue Objekte erzeugt werden.
        //I.set... // Es existieren keine Setter für den Inhalt dieser Wrapper.
    }
}
