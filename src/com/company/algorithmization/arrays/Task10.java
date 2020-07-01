package com.company.algorithmization.arrays;

import java.util.Arrays;

/*
Дан целочисленный массив с количеством элементов п.
Сжать массив, выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями).
Примечание. Дополнительный массив не использовать.
 */
public class Task10 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        int size = array.length % 2 == 0 ? array.length / 2 : array.length / 2 + 1; // размер сжатого массива

        for (int i = 1; i < size; i++) { // перемещение элементов внутри массива
            array[i] = array[2 * (i)];
        }
        for (int j = size; j < array.length; j++) { // заполнение пустых ячеек нулями
            array[j] = 0;
        }

        System.out.println(Arrays.toString(array));
    }
}
