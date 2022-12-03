package _01_strategy.aufgaben.aufgabe_3_sortieralgorithmen.Lösung_2;

import java.util.List;

public class Quicksort implements Strategy
{
    public int[] intArr;

    @Override
    public int[] operation(int[] arr)
    {
        intArr = arr;
        arr = sort(0, intArr.length - 1);
        return arr;
    }

    public int[] sort(int l, int r) {
        int q;
        if (l < r) {
            q = partition(l, r);
            sort(l, q);
            sort(q + 1, r);
        }
        return intArr;
    }

    private int partition(int l, int r) {
        int i, j, x = intArr[(l + r) / 2];
        i = l - 1;
        j = r + 1;

        do {
            i++;
        } while (intArr[i] < x);

        do {
            j--;
        } while (intArr[j] > x);

        if (i < j) {
            int k = intArr[i];
            intArr[i] = intArr[j];
            intArr[j] = k;
        } else {
            return j;
        }
        return -1;
    }
}
