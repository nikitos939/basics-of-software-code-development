package com.company.line;
/*
6. Для данной области составить линейную программу, которая печатает true,
если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае:
 */
public class task6 {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        boolean z = y <= 4 && x >= -2 && x < 0 ||
                x <= 4 && y >= -3 && y < 0     ||
                y <= 4 && x <= 2 && x > 0 && y > 0 ||
                x >= -4 && y >= -3 && x < 0 && y < 0;
        System.out.print(z);

    }
}
