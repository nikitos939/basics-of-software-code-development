package com.company.line;

/*
2. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
  (b+√(b²+4ac))/2a - a³с + b⁻ ²
 */
public class task2 {
    public static void main(String[] args) {
        double a = 12;
        double b = 10;
        double c = 2;
        double result = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) - (Math.pow(a, 3) * c) + Math.pow(b, -2);
        System.out.printf("%.2f", result);

    }
}
