package com.company.branches;

/* 2. Найти max{min(a, b), min(c, d)}.

 */
public class Task2 {
    public static void main(String[] args) {
        int a = 39, b = 50, c = 30, d = 29;

        System.out.println(max(min(a, b), min(c, d)));
    }

    private static int min(int a, int b) {
        return a < b ? a : b;
    }

    private static int max(int a, int b) {
        return a > b ? a : b;
    }
}

