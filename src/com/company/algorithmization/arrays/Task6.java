package com.company.algorithmization.arrays;
/*
 Задана последовательность N вещественных чисел.
 Вычислить сумму чисел, порядковые номера которых являются простыми числами.
 */

public class Task6 {
    public static void main(String[] args) {
        double[] array = {1, 2, 3, 4, 5, 6.1, 7.1, 8.1, 9.1};
        double sum = 0;

        next:
        for (int i = 2; i < array.length; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    continue next;
                }
            }
            sum += array[i];
        }
        System.out.println(sum);
    }
}
