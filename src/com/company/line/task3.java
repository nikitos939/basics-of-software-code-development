package com.company.line;
/*Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 (𝑠𝑖𝑛 𝑥 + 𝑐𝑜𝑠 𝑦)/(𝑐𝑜𝑠 𝑥 − 𝑠𝑖𝑛 𝑦) ∗ 𝑡𝑔 xy
*/

public class task3 {
    public static void main(String[] args) {
        double x = 30;
        double y = 45;
        double result = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x*y);
        System.out.printf("%.2f", result);
    }
}
