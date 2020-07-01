package com.company.arraysOfArrays;
/*
Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
             1  2   3   .... n
             n  n-1 n-2 .... n
             1  2   3   .... n
             n  n-1 n-2 .... n
             .................
             n  n-1 n-2 .... n
 */
public class Task4 {
    public static void main(String[] args) {
        int n = 6;

        if (n % 2 == 0) { //четность значения элемента

            int[][] array = new int[n][n];

            for (int i = 0; i < n; i++,System.out.println()) {
                for (int j = 0; j < n; j++) {

                    if (i % 2 == 0) {
                        array[i][j] = j + 1;
                        System.out.print(array[i][j] + " ");
                    } else {
                        array[i][j] = n - j;
                        System.out.print(array[i][j] + " ");
                    }
                }
            }
        }
    }
}
