package com.company.arraysOfArrays;
/*
Сформировать квадратную матрицу порядка N по правилу:
A[I,J] = sin((I² - J²) / N)
И подсчитать количество положительных элементов в ней
 */
public class Task7 {
    public static void main(String[] args) {

        int n = 5;

        double[][] array = new double[n][n];
        for (int i = 0; i < n; i++, System.out.println()) {
            for (int j = 0; j < n; j++) {
                array[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / n); // формула
                System.out.print(array[i][j] + "  ");
            }
        }
        System.out.println("Количество положительных элементов: " + elements(array));
    }

    private static int elements(double[][] array) {
        int elem = 0;
        for (double[] m : array) {
            for (double v : m) {
                if (v > 0)
                    elem++;
            }
        }
        return elem;
    }
}
