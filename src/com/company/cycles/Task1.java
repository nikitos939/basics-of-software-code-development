package com.company.cycles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Напишите программу, где пользователь вводит любое целое положительное число.
А программа суммирует все числа от 1 до введенного пользователем числа.
 */
public class Task1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите целое положительное число");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int s = Integer.parseInt(reader.readLine());
        int sum = 0;
        if (s <= 0) {
            System.out.println("Вы ввели отрицательное число либо ноль");
        } else  {
            for (int i = 1; i <= s; i++) {
                sum += i;
            }
                System.out.println(sum);

        }
    }
}
