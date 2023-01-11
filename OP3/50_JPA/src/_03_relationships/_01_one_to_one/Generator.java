package _03_relationships._01_one_to_one;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Generator {

    public static Person getPerson( int i ) {
        return switch (i) {
            case 1 -> new Person("Peter", "Schmidt");
            case 2 -> new Person("Hans", "Meyer");
            case 3 -> new Person("Thomas", "Heine");
            case 4 -> new Person("Salah", "Lejmi");
            default -> throw new RuntimeException("Index unbekannt");
        };
    }

    public static List<Person> getPersonList() {
        // Alle Personen zurückgeben
        return new ArrayList<>(IntStream.of(1,2,3).mapToObj(Generator::getPerson).toList());
    }

    public static Ausweis getAusweis( int i ) {
        return switch (i) {
            case 1 -> new Ausweis("S458AB452", LocalDate.parse("2021-02-15"), LocalDate.parse("2031-02-14"));
            case 2 -> new Ausweis("P581UR943", LocalDate.parse("2018-04-29"), LocalDate.parse("2028-04-28"));
            case 3 -> new Ausweis("R555QQ777", LocalDate.parse("2025-11-03"), LocalDate.parse("2035-11-02"));
            case 4 -> new Ausweis("N147NN369", LocalDate.parse("2020-02-24"), LocalDate.parse("2030-02-23"));
            default -> throw new RuntimeException("Index unbekannt");
        };
    }

    public static List<Ausweis> getAusweisList() {
        // Alle Ausweise zurückgeben
        return new ArrayList<>(IntStream.of(1, 2, 3).mapToObj(Generator::getAusweis).toList());
    }
}

