package com.company.line;
/*Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
Вывести данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc.
*/
public class task5 {
    public static void main(String args[]) {
        int entrySec = 36000;

        int hour = entrySec / 3600;
        int min = (entrySec % 3600) / 60;
        int sec = (entrySec % 3600) % 60;
        System.out.println(hour + "ч " + min + "мин " + sec + "с");
    }
}