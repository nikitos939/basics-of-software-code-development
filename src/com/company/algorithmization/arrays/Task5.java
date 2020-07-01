package com.company.algorithmization.arrays;
/*
 Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
 */
public class Task5 {
    public static void main(String[] args) {
        int[] array = {60, 20, 0, 40, 50, 1};

        for (int i = 0; i < array.length; i++) {
            if (array[i] > i) {
                System.out.println(array[i]);
            }
        }
    }
}
