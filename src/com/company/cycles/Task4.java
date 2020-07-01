package com.company.cycles;

// Составить программу нахождения произведения квадратов первых двухсот чисел.

public class Task4 {
    public static void main(String[] args) {
       int sum = 0;
       for (int i = 1; i < 201; i++) {
            sum += Math.pow(i, 2);
       }
       System.out.println(sum);
    }
}
