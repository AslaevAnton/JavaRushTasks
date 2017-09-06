package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] masBig = new int[20];
        int[] massSmal1 = new int[10];
        int[] massSmal2 = new int[10];
        for (int i = 0; i < masBig.length; i++) {
            masBig[i]=(new Scanner(System.in)).nextInt();
        }
        for (int i = 0; i < massSmal1.length; i++) {
            massSmal1[i]=masBig[i];
            massSmal2[i]=masBig[massSmal1.length+i];
        }
        for (int i = 0; i < massSmal2.length; i++) {
            System.out.println(massSmal2[i]);
        }
    }
}
