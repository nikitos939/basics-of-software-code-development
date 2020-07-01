package com.company.arraysOfArrays;
/*
Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
              1 1 1 1 .... 1
              2 2 2 2 .... 0
              3 3 3 0 .... 0
              ..............
              n 0 0 0 .... 0
 */
public class Task5 {
    public static void main(String[] args) {
        int n = 6;

        if (n % 2 == 0) { // четность значения элемента

            int[][] array = new int[n][n];

            for (int i = 0; i < n; i++, System.out.println()) {
                for (int j = 0; j < n - i; j++) {
                    array[i][j] = i + 1;
                    System.out.print(array[i][j] + " ");
                }
                for (int j = n - i; j < n; j++) {
                    array[i][j] = 0;
                    System.out.print(array[i][j] + " ");
                }
            }
        }
    }
}
