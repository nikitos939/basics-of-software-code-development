package com.company.algorithmization.arrays;
/*
Дан массив действительных чисел, размерность которого N.
Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.
 */
public class Task3 {
    public static void main(String[] args) {
        double[] array = {-1, -10, 0, 0, 10, 20};
        int countOfNegativeNumbers = 0;
        int countOfPositiveNumbers = 0;
        int countOfZero = 0;

        for(int i = 0; i < array.length; i ++){ // проходим по элементам массива
            if(array[i] < 0){
                countOfNegativeNumbers++;
            } else if (array[i] == 0) {
                countOfZero++;
            }else if(array[i] > 0) {
                countOfPositiveNumbers++;
            }
        }
        System.out.println("Количество отрицательных элементов = " + countOfNegativeNumbers);
        System.out.println("Количество нулевых элементов = " + countOfZero);
        System.out.println("Количество положительных элементов = " + countOfPositiveNumbers);
    }
}
