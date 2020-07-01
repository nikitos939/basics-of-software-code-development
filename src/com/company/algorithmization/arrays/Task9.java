package com.company.algorithmization.arrays;

import java.util.Arrays;

/*
 В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
 Если таких чисел несколько, то определить наименьшее из них.
 */
public class Task9 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 5, 6, 1, 1, 7, 1, 9};
        System.out.println(detect(array));
    }

    private static int detect(int[] array2) {
        int[] array = Arrays.copyOf(array2, array2.length);
        int muchRepeat = -1;
        int maxCount = -1;

        for (int i = 0; i < array.length; i++) {
            if (i != 0 && array[i] == array[0]) continue;
            int count = 1;
            if (i < array.length - 1) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        count = count + 1;
                        array[j] = array[0];
                    }
                }
            }

            if (maxCount < count) {
                maxCount = count;
                muchRepeat = array[i];
            } else if (maxCount == count && muchRepeat > array[i]) {
                muchRepeat = array[i];
            }
        }

        return muchRepeat;

    }
}
