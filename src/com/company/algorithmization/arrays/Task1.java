package com.company.algorithmization.arrays;
/*
 В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
 */
public class Task1 {
    public static void main(String[] args) {
        int[] array = {1, 5, 10, 15, 50};
        int k = 2;
        int sum = 0;

        for( int i : array) { // проходим по каждому элементу массива
            if (i % k == 0) { // остаток от деления
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
