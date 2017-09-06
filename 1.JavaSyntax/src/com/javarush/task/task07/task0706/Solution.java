package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] mass = new int[15];
        int evenCount=0,oddCount=0;
        for (int i=0; i<mass.length; i++ ) {
            mass[i]=(new Scanner(System.in)).nextInt();
            if(i%2==0)
                evenCount+=mass[i];
            else
                oddCount+=mass[i];
        }
        System.out.println(evenCount>oddCount?"В домах с четными номерами проживает больше жителей.":"В домах с нечетными номерами проживает больше жителей.");
    }
}
