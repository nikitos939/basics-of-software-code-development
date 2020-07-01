package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 Приветствовать любого пользователя при вводе его имени через командную строку.

 */
public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        System.out.println("Hello " + s);
    }
}
