package assoziationen.vorlesung;

import java.time.LocalDateTime;

public class Assoziationen
{
    public static void main(String[] args)
    {
        // a) Auto -> Person (Eine 1:n Beziehung, bei der wir vom Auto auf den Besitzer (Person) schließen können, aber nicht umgekehrt.
        // Lösung: wir führen ein Attribut 'besitzer' vom Typ Person in der Klasse 'Auto' ein.

        // Instanziierung einer Person:
        Person person1 = new Person(1, "Ivanov");
        // Instanziierung eines Autos:
        Auto auto1 = new Auto(1, "Opel", person1); // → Wir übergeben das Objekt 'person1' als 'besitzer' an den Konstruktor 'Auto'

        // Nun kann ich vom Auto zur Person navigieren, indem ich über das Attribut 'Besitzer' auf dessen Member zugreifen kann.
        // Beispiel: Wie heißt der Besitzer von Auto auto1 mit Nachnamen?
        System.out.println("Nachname des Besitzers von auto1: " + auto1.getBesitzer().getNachname());

        new Auto(2, "BMW"); // Ein Auto ohne Besitzer erstellen.

        System.out.println();
        // ABER: Navigation von Person zu Auto gelingt uns nicht (unmittelbar).
        // Eine mögliche Lösung wäre, alle Autos abzuklappern und nach einem passenden Besitzer zu suchen.
        for (Auto a : Auto.autoListe)
        {
            System.out.print("Auto-ID: " + a.getId());
            if (a.getBesitzer() == person1)
                // Die Objekt-Referenzen aus a.besitzer und person1 miteinander vergleichen
                System.out.println(" Dieses Auto gehört " + person1.getNachname());
            else
                System.out.println();

        }

        System.out.println();
        // b) Auto <-> Person (Eine m:n Beziehung. Wir können von Auto zu Person navigieren und von Person zu Auto)
        Auto auto3 = new Auto(3, "Ford", person1);
        auto1.getFahrerListe().add(person1); // person1 als Fahrer dem Auto hinzufügen
        auto3.getFahrerListe().add(person1); // person1 als Fahrer dem Auto hinzufügen
        person1.getDarfFahren().add(auto1); // auto1 als Auto mit Fahr-Erlaubnis der Person hinzufügen
        person1.getDarfFahren().add(auto3); // auto3 als Auto mit Fahr-Erlaubnis der Person hinzufügen

        for (Person p : Person.personListe)
        {
            System.out.println("Diese Autos darf " + p.getNachname() + " fahren:");
            for (Auto a : p.getDarfFahren())
                System.out.print(a.getId() + " ");
        }

        System.out.println();
        System.out.println();
        // c) Person -> Haustier (1:n Beziehung, bei der wir von der Person auf alle dessen Haustiere schließen können)
        // Lösung: Eine Haustier-Liste in Person

        // Instanziierung von 2 Haustieren
        Haustier haustier1 = new Haustier(1, "Bello");
        Haustier haustier2 = new Haustier(2, "Kitty");

        // Instanziierung einer neuen Person und Hinzufügen der Haustiere in die Liste.
        Person person2 = new Person(2, "Gonzales");
        person2.getHaustierListe().add(haustier1);
        person2.getHaustierListe().add(haustier2);

        // Ich kann nun von Person zu allen Haustieren dieser Person navigieren:
        // Beispiel: Name aller Haustiere von 'person2':
        System.out.println("Name aller Haustiere von person2:");
        for (Haustier h : person2.getHaustierListe())
            System.out.println(h.getName());

        System.out.println();

        // d) Beispiel für eine Assoziation-Klasse (Produkt-Kunde)
        // m:n Beziehung, denn ein Produkt kann von mehreren Personen gekauft werden und eine Person kann mehrere Produkte kaufen.
        // Hier besteht eine Aggregation, denn ein Einkauf besteht aus Käufer (Person) und Ware (Produkt).

        Produkt produkt1 = new Produkt(1, 3.50, "Äpfel");
        Produkt produkt2 = new Produkt(2, 4.70, "Kartoffeln");

        new Einkauf(1, LocalDateTime.now(), person1, produkt1);
        new Einkauf(2, LocalDateTime.now(), person1, produkt2);
        new Einkauf(3, LocalDateTime.now(), person2, produkt1);

        System.out.println("Liste aller Produkte, die von person1 gekauft wurden: ");
        for (Einkauf e : Einkauf.einkaufListe)
        {
            if (e.getKäufer() == person1) // Objektreferenz vergleichen
                System.out.println(e.getWare().getBezeichnung());
        }

    }
}
