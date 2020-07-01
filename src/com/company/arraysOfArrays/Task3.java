package com.company.arraysOfArrays;
/*
Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 */
public class Task3 {
    public static void main(String[] args) {
        int[][] array = {{6, 5, 3, 6},
                        {2, 3, 3, 9},
                        {4, 5, 4, 8},
                        {3, 4, 3, 2}};

        int k = 1; // строка
        int p = 3; // столбец

        for (int i = 0; i < array.length; i++, System.out.println()) {
            System.out.print(array[k-1][i] + " "); // вывод строки, 1ая строка имеет индекс 0
        }

        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j][p-1] + " "); // вывод столбца, 1ый столбец имеет индекс 0
            }
    }
}
