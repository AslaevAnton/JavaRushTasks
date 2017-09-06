package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] intMass = new int[10];
        for (int i = 0; i < intMass.length; i++) {
            intMass[i]=(new Scanner(System.in)).nextInt();
        }
        int intTemp=0;
        for (int i = 0; i < intMass.length/2; i++) {
            intTemp=intMass[i];
            intMass[i]=intMass[intMass.length-1-i];
            intMass[intMass.length-1-i]=intTemp;
        }
        for (int i = 0; i < intMass.length; i++) {
            System.out.println(intMass[i]);
        }
    }
}

