package _20_Stream_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Teil1
{
    public static void main(String[] args)
    {
        // Stream List
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 12,23,34,45,56);

        Stream<Integer> streamList = list.stream();

        // Stream Array
        Integer[] arr = {12,23,34,45,56};
        Stream<Integer> streamArray = Arrays.stream(arr);

        System.out.println(berechneAverage(list));
        System.out.println(berechneAverageStream(list));

        System.out.println("\n\nEnd of Main..");
    }

    public static double berechneAverageStream(List<Integer> list)
    {
        double counter = list.stream().reduce(0, (a,b) -> a+b);
        return counter / list.size();
    }

    public static double berechneAverage(List<Integer> list)
    {
        double counter=0;
        for (Integer i : list)
        {
            counter += i;
        }
        counter /= list.size();
        return counter;
    }
}
