package _01_strategy.aufgaben.aufgabe_4_Buchung;

import java.time.LocalDateTime;

/* Sie entwickeln eine Software zur Buchung von Reisen. Die Reisenden können ihre gebuchte Reise vor Reiseantritt stornieren. Dazu sollen zwei Algorithmen implementiert werden
- ein kulanter Algorithmus und ein strenger Algorithmus. Beim Buchen der Reise wird einer der Algorithmen für die Stornogebühren ausgesucht,
der Algorithmus könnte sich aber auch nachträglich noch ändern. Damit der Algorithmus leicht austauschbar ist, verwenden Sie das Strategy-Muster.
 *
 * Jede Reise hat einen Grundpreis und einen Reisebeginn.
 * Es können für alle Reise-Arten die Anzahl der Tage bis zur Abreise bestimmt werden.
 * Jede Reise-Art berechnet den Preis auf unterschiedliche Art.
 * Die Reise wird in zwei Arten unterteilt. Die günstige Bronze-Reise und die teure Gold-Reise.
 * Die Bronze-Reise kostet Grundpreis * 1.25, die Gold-Reise kostet Grundpreis * 1.75
 *
 * Jede Reise hat einen bestimmten Storno-Algorithmus.
 * Da der Algorithmus beliebig getauscht werden können soll, ist er von der Reise entkoppelt.
 * Es gibt den strengen Storno Algorithmus und den kulanten Storno Algorithmus.
 * Eine IStornoAlgorithmus der Reise mit dem strengen Algorithmus kostet 25% der Reisekosten, wenn die Tage bis zur Abreise > 10 sind, sonst 75%.
 * Die IStornoAlgorithmus mit dem kulanten Algorithmus kostet 25% der Reisekosten, wenn es noch mehr als ein Tag bis zur Reise sind, sonst 50%.
 * Eine Bronze-Reise verwendet standardmäßig den strengen Algorithmus, eine Gold-Reise verwendet standardmäßig den kulanten Algorithmus.
 *
 * Erstellen Sie ein Klassendiagramm und testen Sie das Programm mit Java-Code.
 */
public class MainApp
{
    public static void main(String[] args)
    {
        Reise bronzeReise = new BronzeReise(LocalDateTime.now().plusDays(8), 100);
        Reise goldReise = new GoldReise(LocalDateTime.now().plusDays(8), 200);

        System.out.println("Standardreise Preis: " + bronzeReise.berechnePreis());
        System.out.println("Standardreise Tage: " + bronzeReise.bestimmeTage());
        System.out.println("Standardreise Storno: " + bronzeReise.berechneStorno());

        IStornoAlgorithmus stornoAlgorithmus = new KulantenAlgorithmus();
        bronzeReise.setStornoAlgorithmus(stornoAlgorithmus);
        System.out.println("Auf Kulanter Algorithmus wechseln...");
        System.out.println("Standardreise Storno: " + bronzeReise.berechneStorno());

        System.out.println("Premiumreise Preis: " + goldReise.berechnePreis());
        System.out.println("Premiumreise Storno: " + goldReise.berechneStorno());

        System.out.println("\n\nEnd of Main..");
    }
}
