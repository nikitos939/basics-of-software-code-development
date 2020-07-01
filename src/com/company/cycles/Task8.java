package com.company.cycles;
/*
 Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
 */
public class Task8 {
    public static void main(String[] args) {
        int a = 123;
        int b = 456;

        divide(a);
        divide(b);
    }
    private static void divide(int number) {
        System.out.print(number + " = ");

        while (number != 0) {
            int digit = number % 10; // остаток от деления
            number /= 10;
            System.out.print(digit + " ");
        }
        System.out.println(" ");
    }
}
