package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String[] stringMass = new String[10];
        for (int i = 0; i < 8; i++) {
            stringMass[i]=(new BufferedReader(new InputStreamReader(System.in))).readLine();
        }
        for (int i = 0; i < stringMass.length; i++) {
            System.out.println(stringMass[stringMass.length-i-1]);
        }
    }
}