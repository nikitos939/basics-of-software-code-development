package com.company.algorithmization.arrays;
/*
Дана последовательность действительных чисел а1 ,а2 ,..., аn.
Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен.
 */
public class Task2 {
    public static void main(String[] args) {
        double[] array = {10, 20, 30, 40, 50};
        double z = 35;
        int count = 0;

        for(int i = 0; i < array.length; i++) {
            if (array[i] > z) {
                array[i] = z;
                count++;
            }
        }
        System.out.println("Количество замен = " + count);
    }
}
