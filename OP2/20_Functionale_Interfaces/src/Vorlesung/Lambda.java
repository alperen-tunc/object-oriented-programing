package Vorlesung;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class Lambda
{
    public static void main(String[] args)
    {
        System.out.println("============================================================");

        Startable1 s1 = new Waschmaschine();
        s1.start();

        Startable1 s2 = new Startable1()
        {
            @Override
            public void start()
            {
                System.out.println("Anonym wird gestartet");
            }
        };
        s2.start();

        /* Funktionale Programmierung: das wichtigste Mittel ist Lambda.
        * Interface mit GENAU einer abstrackte Methode
        */
        Startable1 s3 = () -> {
            System.out.println("Lambda wird gestartet.");
        };
        s3.start();

        Startable1 s4 = () -> System.out.println("Wir sind wieder in Lambda");
        s4.start();

        /* mit einer Klasse nicht gemacht werden.
        Waschmaschine w1 = () -> {
            System.out.println("Class Waschmaschine kann nicht gemacht werden");
        };
         */

        System.out.println("\nMontag");
        BiIntOperator add = (int a, int b) -> a + b;
        System.out.println("add Funktion: a+b = " + add.calculate(12, 23));
        
        BiIntOperator substract = (a,b) -> a-b;
        System.out.println("substract a-b = " + substract.calculate(12,5));
        
        BiIntOperator multiplay = (a, b) -> a * b;
        System.out.println("multiplay a * b = " + multiplay.calculate(5,5));
        
        BiIntOperator divide = (a,b) -> a/b;
        System.out.println("divide a / b = " + divide.calculate(15,3));
        
        BiIntOperator modulo = (a, b) -> a % b;
        System.out.println("modulo a % b = " + modulo.calculate(15,4));

        System.out.println();
        Condition istGerade = a -> a % 2 == 0;
        System.out.println("istGerade.check(13): " + istGerade.check(13));
        
        Condition istUngerade = a -> a % 2 == 1;
        System.out.println("istUngerade.check(13): " + istUngerade.check(13));
        
        
        ConditionString str = s -> s.length() > 4;
        System.out.println("str ist groesser als 4: " + str.check("Alperen"));

        System.out.println();
        List<Integer> zahlen = List.of(1,2,3,4,5);
        System.out.println("getGeradeZahlen(zahlen): " + getGeradeZahlen(zahlen));

        System.out.println("getUngeradeZahlen(zahlen): " + getUngeradeZahlen(zahlen));

        // Lösung mit vor Java 8
        List<Integer> result1 = getFilter(zahlen, new Filter()
        {
            @Override
            public boolean check(Integer a)
            {
                return a % 2 == 0;
            }
        });

        System.out.println("Gerade Zahlen Mit Anonyme Klasse: " + result1);

        List<Integer> result2 = getFilter(zahlen, zahl -> zahl % 2 == 0);
        System.out.println("Gerade Zahlen Mit lambda Klasse: " + result2);
        
        List<Integer> result3 = getFilter(zahlen, zahl-> zahl%2 ==1);
        System.out.println("Ungerade Zahlen Mit lambda Klasse: " + result3);

        List<Integer> resultmitStream = zahlen.stream()
                .filter(zahl -> zahl % 2 == 0).toList();
        System.out.println("Gerade Zahlen Mit Stream Klasse: " + resultmitStream);

        zahlen.forEach(zahl -> System.out.print(zahl + " ")); // Lambda [t -> void]
        zahlen.forEach(System.out::print); // Method Reference

        BiFunction<String, Integer, String> sub1 = (str1, from) -> str1.substring(from);
        BiFunction<String, Integer, String> sub2 = String::substring;

        TriFunction<String, Integer, Integer, String> sub3 = (str1, from, to) -> str1.substring(from, to);
        TriFunction<String, Integer, Integer, String> sub4 = String::substring;

        System.out.println("\n");
        System.out.println(sub1.apply("Alperen", 3));
        System.out.println(sub2.apply("Alperen", 2));
        System.out.println(sub3.apply("Alperen", 2,5));
        System.out.println(sub4.apply("Alperen", 1,6));


    } // end of main.

    public static List<Integer> getFilter(List<Integer> inputList, Filter filter)
    {
        List<Integer> outputList = new ArrayList<>();
        for (Integer i : inputList)
            if (filter.check(i))
                outputList.add(i);
        return outputList;

    }

    public static List<Integer> getGeradeZahlen(List<Integer> inputList)
    {
        List <Integer> outputList = new ArrayList<>();

        for (Integer i : inputList)
            if (i % 2 == 0)
                outputList.add(i);
        return outputList;
    }

    public static List<Integer> getUngeradeZahlen(List<Integer> inputList)
    {
        List <Integer> outputList = new ArrayList<>();

        for (Integer i : inputList)
            if (i % 2 == 1)
                outputList.add(i);
        return outputList;
    }
}
interface TriFunction<T, U,V,R>
{
    R apply(T t, U u, V v);
}
@FunctionalInterface
interface Filter
{
    boolean check(Integer a);
}

@FunctionalInterface
interface Condition
{
    boolean check(int a);
}

@FunctionalInterface
interface ConditionString
{
    boolean check(String s);
}

class LaengerAls4 implements  ConditionString
{
    @Override
    public boolean check(String str)
    {
        return str.length() > 4;
    }
}

@FunctionalInterface
interface Startable1
{
    void start();

    //void stop();
    //void stop(); falls wir so schreiben würden, können wir Lambda nicht benutzen, weil es abstract ist.
    // public oder default kann sein.
}

@FunctionalInterface
interface BiIntOperator
{
    int calculate(int a, int b);
}

class Waschmaschine implements Startable1
{
    @Override
    public void start()
    {
        System.out.println("Waschmaschine wird gestartet");
    }

    public void scchleudern()
    {
        System.out.println("Waschmaschine wird geschleudert");
    }
}
