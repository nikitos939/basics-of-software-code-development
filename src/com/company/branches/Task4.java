package com.company.branches;
/*4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
 Определить, пройдет ли кирпич через отверстие.
 */
public class Task4 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int x = 3;
        int y = 4;
        int z = 5;
        // сравниваем размеры сечения кирпича с размерами отверстия, меньше - пройдет, большое - не пройдет
        if ((x <= a) && (y <= b) ||
           (y <= a) && (x <= b) ||
           (x <= a) && (z <= b) ||
           (z <= a) && (x <= b) ||
           (z <= a) && (y <= b) ||
           (y <= a) && (z <= b))  {
            System.out.print("Пройдёт");
        } else {
            System.out.print("Не пройдет");
        }
    }
}
