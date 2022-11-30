package Aufgaben;
/*
    - Führen Sie bitte die 3 folgenden Methoden ein:
        a) Name:            Sortiere
           Übergabewerte:   String-Array und ein Delegat vom Typ PrüfeStrings
           Funktion:        Sortiert das Array nach dem Bubblesort-Verfahren mit Hilfe einer übergebenen Methode
           Rückgabewert:    keiner
        b) Name:            Ausgabe
           Übergabewerte:   String-Array
           Funktion:        Konsolenausgabe aller Felder
           Rückgabewert:    keiner

    'PrüfeStrings' ist ein funktionales Interface mit der boolean-Methode 'prüfe(String s1, String s2)'

    Im Main
       Führen Sie bitte zunächst ein String-Array 'strings' ein, gefüllt mit den folgenden drei Strings: "Autobahnpolizist", "Grundstücksverkehrsgenehmigungszuständigkeitsübertragungsverordnung", "Ja"
       Lassen Sie den aktuellen Inhalt des Arrays bitte auf der Konsole ausgeben
       Rufen Sie die Methode Sortiere auf (Übergabewerte 'strings' und eine Lambda-Expression - die Lambda-Expression soll zwei Strings vergleichen und true zurück geben, wenn der erste länger als der zweite ist, sonst false)
       Lassen Sie bitte erneut den aktuellen Inhalt des Arrays auf der Konsole ausgeben
*/
public class aufgabe_40
{
    public static void main(String[] args)
    {
        String[] strings = {"Autobahnpolizist", "Grundstücksverkehrsgenehmigungszuständigkeitsübertragungsverordnung","Ja", "Alperen", "Timo", "Was ich hier schreibe"};

        System.out.println("Vor dem Sortieren:\n");
        Ausgabe(strings);

        System.out.println("\nNach dem Sortieren:\n");
        
        Sortiere(strings, (s1,s2) -> s1.length()>s2.length());
        Ausgabe(strings);
    }

    public static void Sortiere(String[] arr, PrüfeStrings ps)
    {
        String hilfe;
        for (int i=0; i<arr.length; i++)
        {
            for (int j=0; j<i; j++)
            {
                if(ps.prüfe(arr[i], arr[j]))
                {
                    hilfe = arr[j];
                    arr[j] = arr[i];
                    arr[i] = hilfe;
                }

            }
        }
    }

    public static void Ausgabe(String[] arr)
    {
        for (String s : arr)
        {
            System.out.println(s);
        }
    }
}

interface PrüfeStrings
{
    boolean prüfe(String s1, String s2);
}
