package com.company.cycles;
/*
Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
 */
public class Task6 {
    public static void main(String[] args) {
        int x = 20000; // инициализация кол-ва значений
        char c;
        for (int i = 0; x >= i; i++) {
            c = (char) i; //приведения типа int к типу char
            System.out.println(i + " соответствует символу " + c);
        }
    }
}
