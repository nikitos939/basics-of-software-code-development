package com.company.branches;
/*3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3).
Определить, будут ли они расположены на одной прямой.
 */
public class Task3 {
    public static void main(String[] args) {
        int x1 = 100;
        int y1 = 101;
        int x2 = 100;
        int y2 = 101;
        int x3 = 100;
        int y3 = 100;
        /* Условие, при котором три данные точки лежат на одной прямой:
        Точка С лежит на этой прямой только в том случае,
        когда ее координаты  удовлетворяют уравнению прямой
        Таким образом, искомым условием будет:*/

        if (((x3 - x1) * (y2 - y1)) == ((x2 - x1) * (y3 - y1))) {
            System.out.print("Точки лежат на одной прямой");
        } else {
            System.out.print("Точки не лежат наодной прямой");

        }
    }
}
