package com.company.arraysOfArrays;
/*
 Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
 */
public class Task2 {
    public static void main(String[] args) {
        int[][] list = {{10, 12, 13, 14},
                        {71, 92, 10, 81},
                        {19, 15, 32, 14},
                        {11, 22, 33, 44}};
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i][i]); // вывод элементов с совпадающим номером строки и столца
        }
    }
}

