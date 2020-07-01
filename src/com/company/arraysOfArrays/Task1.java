package com.company.arraysOfArrays;

import java.util.Scanner;

/*
 Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
 */
public class Task1 {
    public static void main(String[] args) {
        int[][] array;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Высота матрицы: ");
        int m = scanner.nextInt();
        System.out.println("Ширина матрицы: ");
        int n = scanner.nextInt();
        array = new int[m][n];
        for (int i = 0; i < m; i++) {
            System.out.println("Заполните " + (i + 1) + "-ю строку");
            for (int j = 0; j < n; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println();
        System.out.println("Требуемые по условию столбцы матрицы:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j += 2) {
                if (array[0][j] > array[m - 1][j]) {
                    System.out.print(array[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }
}
