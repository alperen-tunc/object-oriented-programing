package _01_strategy.aufgaben.aufgabe_3_sortieralgorithmen.Lösung_2;

import java.util.List;

public class Mergesort implements Strategy
{
    @Override
    public int[] operation(int[] list)
    {
        int length = list.length;
        int[] sorted = mergeSort(list, 0, length - 1);
        System.arraycopy(sorted, 0, list, 0, length);


        return sorted;
    }

    private int[] mergeSort(int[] elements, int left, int right) {
        // End of recursion reached?
        if (left == right) return new int[]{elements[left]};

        int middle = left + (right - left) / 2;
        int[] leftArray = mergeSort(elements, left, middle);
        int[] rightArray = mergeSort(elements, middle + 1, right);
        return merge(leftArray, rightArray);
    }

    int[] merge(int[] leftArray, int[] rightArray) {
        int leftLen = leftArray.length;
        int rightLen = rightArray.length;

        int[] target = new int[leftLen + rightLen];
        int targetPos = 0;
        int leftPos = 0;
        int rightPos = 0;

        // As long as both arrays contain elements...
        while (leftPos < leftLen && rightPos < rightLen) {
            // Which one is smaller?
            int leftValue = leftArray[leftPos];
            int rightValue = rightArray[rightPos];
            if (leftValue <= rightValue) {
                target[targetPos++] = leftValue;
                leftPos++;
            } else {
                target[targetPos++] = rightValue;
                rightPos++;
            }
        }
        // Copy the rest
        while (leftPos < leftLen) {
            target[targetPos++] = leftArray[leftPos++];
        }
        while (rightPos < rightLen) {
            target[targetPos++] = rightArray[rightPos++];
        }
        return target;
    }
}
