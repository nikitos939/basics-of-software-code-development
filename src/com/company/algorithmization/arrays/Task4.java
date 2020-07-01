package com.company.algorithmization.arrays;

import java.util.Arrays;

/*
Даны действительные числа а1 ,а2 ,..., аn .
Поменять местами наибольший и наименьший элементы.
 */
public class Task4 {
    public static void main(String[] args) {
        double[] array = {-5, -10, 0, 40, 1000};
        double min = 0;
        double max = 0;
        int indexOfMin = 0;
        int indexOfMax = 0;

        for(int i = 0; i < array.length; i++) {
            if(array[i] < min) { // находим наименьший элемент
                min = array[i];  // присваиваем значение наименьшего элемента переменной min
                indexOfMin = i;  // устанавливаем индекс наименьшего элемента и приваиваем его переменной indexOfMin
            } else if (array[i] > max) { // находим наибольший элемент
                max = array[i];     // присваиваем значение наибольшего элемента переменной min
                indexOfMax = i;    //устанавливаем индекс наимбольшего элемента и приваиваем его переменной indexOfMax
            }
        }
            array[indexOfMax] = min;
            array[indexOfMin] = max;

            System.out.println(Arrays.toString(array));
    }
}
