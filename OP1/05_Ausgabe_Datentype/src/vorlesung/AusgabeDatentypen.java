package vorlesung;

import java.util.Scanner;

public class AusgabeDatentypen
{
    // HIER sind Funktionen und Variablen erlaubt (innerhalb einer Klasse)
    // Variablen und Funktionen werden zusammengefasst "Klassen-Member" genannt.

    // "Globale" Variablen, auch Felder genannt, (Attribute der Klasse), die innerhalb jeder der Funktionen in dieser
    // Klasse bekannt sind.
    int var1 = 11; // Nicht statisch -> Nur über Objekte aufrufbar (Instanz-Variable).

    static int var2 = 22; // Statisch -> "für sich alleine lebensfähig" d.h. ohne Objekt-Verweis.

    static void ausgabe() // Parameterlose void Methode. Keine Parameter und keine Rückgabe.
    {
        System.out.println("Hallo Welt! " + var2);
    }

    static int summe(int a, int b) // statische int-Methode mit zwei int-Parametern.
    {
        return a + b;
    }

    public static void main(String[] args)
    {
        System.out.println("ALLGEMEINES");
        //var1 = 22; // Kann nicht auf die Variable zugreifen, da sie nicht statisch ist.
        AusgabeDatentypen objekt = new AusgabeDatentypen(); // Erzeugt ein Objekt der Klasse AusgabeDatentypen.
        objekt.var1 = 22; // Hier kann ich nun auf die nicht-statische Variable zugreifen.

        var2 = 33; // Direkter Zugriff auf die statische Variable.

        ausgabe(); // Aufruf der statischen Methode.

        // 'ergebnis' ist eine lokale Variable
        // Lokale Variablen können nicht statisch sein.
        int ergebnis = summe(5, 15);
        System.out.println(ergebnis);

        System.out.println("AUSGABE");
        int zahl1 = 10;
        int zahl2 = 20;
        // Ausgabe mit String-Konkatenation:
        System.out.println("Der Wert der Variable zahl1 lautet: " + zahl1 + " und zahl2: " + zahl2 + " <- Ausgabe durch String-Konkatenation");
        System.out.print("\n"); // Zeilenumbruch durch \n

        // Ausgabe mit String.format
        // Formatierungszeichen unter https://www.javatpoint.com/java-string-format
        String s = String.format("Der Wert der Variable zahl1 lautet: %s und zahl2: %s <- mit String.format()", zahl1, zahl2);
        System.out.println(s);
        // Variante mit printf()
        System.out.printf("Der Wert der Variable zahl1 lautet: %s und zahl2: %s <- mit printf() %n", zahl1, zahl2); // Zeilenumbruch durch %n

        // Ausgabe mit StringBuilder
        StringBuilder sb = new StringBuilder(); // Ein Objekt des StringBuilders erzeugen
        sb.append("Der Wert der Variable zahl1 lautet: ");
        sb.append(zahl1);
        sb.append(" und zahl2: ").append(zahl2);
        sb.append(" <- mit StringBuilder");
        System.out.println(sb);

        System.out.println();
        System.out.println("DATENTYPEN");

        // Primitive Datentypen
        //                      // Wertebereich                             // Standardwert         // Größe [Bit]
        boolean bool = true;    // true, false                              // false                // 1
        byte b8 = 1;            // -128...+127                              // 0                    // 8
        short short16 = 2;      // -2^15...+2^15-1                          // 0                    // 16
        int int32 = 3;          // -2^31...+2^31-1                          // 0                    // 32
        long long64 = 4L;       // -2^63...+2^63-1                          // 0                    // 64
        float float32 = 3.5F;   // +-1.2*10^-38...+-3.4*10^38               // 0                    // 32
        double double64 = 50.5; // +-2.2*10^-308...+-1.8*10^308             // 0                    // 64
        char character = 'C';   // \u0000 ... \uFFFF (Unicode Zeichen)      // \u0000 (NULL)        // 16

        long l = 100000000000000000L; // Bei Zahlen größer als knapp 2 Milliarden (int) muss ich L für long angeben!
        //float f = (float)3.41; // Casten!
        float f = 3.41F; // Oder F hinter die Zahl schreiben.

        // Ausgabe der ganzzahligen Datentypen:
        System.out.println(b8 + " " + short16 + " " + int32 + " " + long64);

        // Falls ich ausschließlich einen Variablenwert ausgeben möchte, dann reicht die folgende Notation:
        System.out.println(int32);

        // Mögliches Problem:
        System.out.println("Die Summe von int32 und short16 ist: " + int32 + short16);
        // Die Werte wurden fälschlich konkateniert.

        // GRUND: Konkatenation "gewinnt" gegen Addition. Befehle werden von links nach rechts aufgelöst.
        // LÖSUNG: Wir verwenden Klammern! Die Klammern haben eine höhere Priorität und werden daher vor dem +-Operator ausgewertet.
        System.out.println("Die Summe von int32 und short16 ist: " + (int32 + short16));
        // Rangfolge der Operatoren: https://www.javatpoint.com/highest-precedence-in-java

        System.out.println("BEISPIEL WRAPPER-KLASSEN");
        // Integer-Klasse (Wrapper-Klasse: existieren zu allen primitiven Typen)
        int int32min = Integer.MIN_VALUE; // Speichern des MIN_VALUE Wertes aus der Klasse Integer in einer int-Variable.
        int int32max = Integer.MAX_VALUE;
        System.out.println(int32min + " " + int32max);

        //Integer I32 = Integer.valueOf(42);
        Integer I32 = 42; // Integer-Klasse: verpackt einen primitiven Datentyp in eine Klasse
        System.out.println(I32);

        System.out.println("CHARACTER UND STRING");
        // Zeichen
        char c = 'q';
        System.out.println(c);

        // String-Klasse
        String s1 = "Dies ist ein String";  // Die String-Klasse repräsentiert Zeichenketten.
        String s1LowerCase = s1.toLowerCase();

        // Problem: Konkatenation von Character
        //String s2 = c + c + c;
        // Fehlermeldung: Der Typ eines Characters (intern als Integer, bzw. ASCII-Position abgespeichert)
        // kann NICHT implizit in einen String konvertiert werden.

        // Lösung:
        String s2 = "" + c + c + c;
        System.out.println(s2);

        // Strings in Java sind besondere Datentypen. Sie sind Klassen (komplexe Typen), verhalten sich aber oft eher wie primitive Typen.
        // Darüber werden wir in den kommenden Wochen noch mehr erfahren.

        System.out.println();
        System.out.println("BOOLEAN");

        // Boolesche Werte: Wahr oder Falsch, bzw. True or False
        boolean eingabeOk = false;

        Scanner scanner = new Scanner(System.in); // Instanziierung des Scanners. Heißt: Wir haben ein Objekt der Klasse Scanner erzeugt.

        do
        {
            System.out.println("Geben Sie bitte die wahre Identität von Spider-Man ein: ");
            String name = scanner.nextLine(); // Meine Eingabe wird in der Variable "name" gespeichert.

            //if (name.compareTo("Peter Parker") == 0) // Vergleich von Strings über compareTo()
            if (name.equals("Peter Parker")) // Vergleich von Strings über equals()
            {
                eingabeOk = true; // Eingabe war korrekt, also ist eingabeOk == true;
                System.out.println("Ihre Eingabe war korrekt.");
            }
            else
            {
                System.out.println("Ihre Eingabe war nicht korrekt.");
            }

        } while(!eingabeOk); // Das '!' lesen wir als "nicht" oder "not".
        // Führe die Schleife so lange aus, wie NICHT eingabeOk. Oder anders formuliert: Führe die Schleife so lange aus, wie eingabeOk == false

    }
}
