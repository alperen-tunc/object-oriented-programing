package Vorlesung;

import java.util.*;
import java.util.function.Consumer;

public class StreamUseCase
{
    public  static List<String> nameList = Arrays.asList("Stefan", "Anton", "Gustov", "Berta", "Richard");

    public static void main(String[] args)
    {
        System.out.println("============================================================");
        imperative();

        System.out.println("\nfunctionalWithLambda:");
        functionalWithLambda();

        System.out.println("\nfunctionalWithMethoden:");
        functionalWithMethoden();

        System.out.println("\nfunctionalWithMethodenReference");
        functionalWithMethodenReference();
        System.out.println();

        System.out.println("Consumer Use Case: ");
        consumerBasics();
        System.out.println();
        useCases();

        antThenTest();


    }

    public static void antThenTest()
    {
        Consumer<String> consumer1 = str -> System.out.print(str + "=> " );
        Consumer<String> consumer2 = str -> System.out.println(str.length());
        Consumer<String> ergebnisConsumer = consumer1.andThen(consumer2);

        nameList.forEach(ergebnisConsumer);

    }

    private static void consumerBasics() {
        // Consumer<T>    void accept(T t)   // T -> void
        // Consumer<String> consumer = (String name) -> System.out.println(name);
        Consumer<String> consumer = System.out::println; // Alternative mit Methodenreferenz
        consumer.accept("Consumer Basic: Peter");
    }

    private static void useCases() {
        List<String> nameList = Arrays.asList("Peter", "Hans", "Roland", "Thomas", "Stefan");
        System.out.println("Mit List: ");
        for (String name : nameList) {
            System.out.println(name);
        }

        System.out.println("============================================================");
        //Consumer<String> consumer1 = str -> System.out.println(str);
        Consumer<String> consumer1 = s -> System.out.println(s+ "!");
        nameList.forEach( consumer1 );   // Vereinfachte Version
        System.out.println("============================================================");
        Consumer<String> consumer2 = str -> System.out.println("(" + str + ")");
        nameList.forEach( consumer2 );   // Vereinfachte Version
        System.out.println("============================================================");
        Consumer<String> consumer3 = str -> System.out.println("[" + str + "]");
        nameList.forEach( consumer3 );   // Vereinfachte Version
        System.out.println("============================================================");
    }

    private static void functionalWithLambda()
    {
        nameList.stream()
                .filter(name -> name.length() > 5)
                .map(str -> str + " * ")
                .sorted()
                .forEach(System.out::println);
    }

    private static void functionalWithMethoden()
    {
        nameList.stream()
                .filter(name -> StringUtil.mehrAlsZeichen(name)) // Alt + Shift + m
                .map(str -> StringUtil.addiereStern(str))
                .sorted()
                .forEach(System.out::println);
    }

    private static void functionalWithMethodenReference()
    {
        nameList.stream()
                .filter(StringUtil::mehrAlsZeichen) // Alt + Shift + m
                .map(StringUtil::addiereStern)
                .sorted()
                .forEach(System.out::println);

        String[] nameArray = {"Stefan", "Anton", "Gustov", "Berta", "Richard"};
        Arrays.stream(nameArray); // Kann alle andere Stream methode benutzt werden.
    }


    private static void imperative()
    {
        List<String> outputList = new ArrayList<>();
        for (String s : nameList)
        {
            if (s.length() > 5)
            {
                s = s + "* ";
                outputList.add(s);
            }
        }

        Collections.sort(outputList);
        outputList.forEach(System.out::println);
    }

}

class StringUtil
{
    public static String addiereStern(String str)
    {
        return str + " * ";
    }

    public static boolean mehrAlsZeichen(String name)
    {
        return name.length() > 5;
    }
}
