package com.company.cycles;
/*
Вычислить значения функции на отрезке [а,b] c шагом h:
y=x, x>2  y=-x, x>=2
*/
public class Task2 {
    public static void main(String[] args) {
        double a = 1;
        double b = 50;
        double h = 1;
        double x;
        double y;
        for (x = a; x <= b; x += h) {
            if (x <= 2) {
                y = -x;
                System.out.println("y = " + y);
            } else {
                y = x;
                System.out.println("y = " + y);
            }
        }
    }
}
