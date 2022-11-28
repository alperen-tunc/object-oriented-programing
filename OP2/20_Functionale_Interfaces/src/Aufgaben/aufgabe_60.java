package Aufgaben;

//Aufgabe SL_1
//        ============
//        Aus einer Zahlenliste eine andere generieren mit den Zahlen, die eine bestimmte
//        Bedingung erfüllen:
//
//
//public List<Integer> filter(List<Integer> inputList, Condition condition) {
//        List<Integer> outputList = new ArrayList<>();
//        // ....
//        return outputList;
//        }

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.Function;

@FunctionalInterface
interface Condition1
{
   boolean test(List<Integer> list);
}

public class aufgabe_60
{
    static List<Integer> integerList = new ArrayList<>();

    public static void main(String[] args)
    {
        füllenList();
        
        integerList.forEach(System.out::println);

        System.out.println();
        getGeradeZahlen(integerList);

        Function<List<Integer>, List<Integer>> function = aufgabe_60::getGeradeZahlen;
        //function = function.andThen(aufgabe_6::getUngeradeZahlen);

        System.out.println(function.apply(integerList));

        filter(integerList,
                (List<Integer> s) ->
                {
                    for(Integer a: s)
                        if (a%2==0)
                            return true;
                    return false;
                }
        );

        System.out.println(filter(integerList,
                                                (List<Integer> s) ->
                                                {
                                                    for(Integer a: s)
                                                        if (a%2==0)
                                                            return true;
                                                    return false;
                                                }
                            )   );

        
        System.out.println("\nEnd of Main");
    }

    public static List<Integer> filter(List<Integer> list, Condition1 condition)
    {
        List<Integer> outputList = new ArrayList<>();
        for (Integer i : list)
        {
            if (condition.test(Collections.singletonList(i)))
            {
                outputList.add(i);
            }
        }
        return outputList;
    }

    public static void ausgabe(List<Integer> list)
    {
        for (Integer i : list)
        {
            System.out.println(i);
        }
    }
    
    public static List<Integer> getGeradeZahlen(List<Integer> list)
    {
        List<Integer> outputList = new ArrayList<>();
        for (Integer i : list)
        {
            if (i%2==0)
            {
                outputList.add(i);
            }
        }
        return outputList;
    }
    
    public static List<Integer> getUngeradeZahlen(List<Integer> list)
    {
        List<Integer> outputList = new ArrayList<>();
        for (Integer i : list)
        {
            if (i%2==1)
            {
                outputList.add(i);
            }
        }
        return outputList;
    }
    
    public static void füllenList()
    {
        Random rand = new Random();
        for (int i=0; i<10; i++)
        {
            integerList.add(rand.nextInt(100)+1);
        }
    }
}
