package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String[] stringsMass = new String[10];
        int[] intMass = new int[10];
        for (int i = 0; i < stringsMass.length; i++) {
            stringsMass[i]=(new BufferedReader(new InputStreamReader(System.in))).readLine();
            intMass[i]=stringsMass[i].length();
        }
        for (int i = 0; i < intMass.length; i++) {
            System.out.println(intMass[i]);
        }
    }
}
