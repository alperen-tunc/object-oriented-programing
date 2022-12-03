package _01_strategy.aufgaben.aufgabe_3_sortieralgorithmen.Lösung_2;

import java.util.List;

public class Bubblesort implements Strategy
{
    int temp;
    @Override
    public int[] operation(int[] zusortieren)
    {
        for (int i = 1; i < zusortieren.length; i++)
        {
            for (int j = 0; j < zusortieren.length - i; j++)
            {
                if (zusortieren[j] > zusortieren[j + 1])
                {
                    temp = zusortieren[j];
                    zusortieren[j] = zusortieren[j + 1];
                    zusortieren[j + 1] = temp;
                }
            }
        }
        return zusortieren;
    }
}
