package com.company.algorithmization.arrays;

import java.util.Arrays;

/*
 Дана последовательность целых чисел (a₁,a₂,...,aₙ).
 Образовать новую последовательность, выбросив из данной min(a₁,a₂,...,aₙ)
 */
public class Task8 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] array2 = newValues(array);
        System.out.println(Arrays.toString(array2));
    }

    private static int[] newValues(int[] array) {
        int min = min(array);
        int[] array2 = new int[array.length - delMin(array, min)];
        int index = 0;

        for (int i : array) {
            if (i != min) {
                array2[index] = i;
                index++;
            }
        }
        return array2;
    }

    private static int min(int[] array) {
        int min = array[0];

        for (int i : array)
            if (i < min)
                min = i;
        return min;
    }

    private static int delMin(int[] a, int min) {
        int count = 0;

        for (int i : a)
            if (i == min)
                count++;
        return count;
    }
}
