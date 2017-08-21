package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[3];
        for(int i=0;i<3;i++)
            a[i]=scanner.nextInt();

        boolean sort=false;
        while(!sort) {
            for (int i = 0; i < 2; i++) {
                if (a[i] < a[i + 1]) {
                    int c = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = c;
                }
            }
            for(int i=0; i<2; i++)
                if(a[i]>=a[i+1])
                    sort=true;
                else {
                    sort = false;
                    i=2;
                }
        }
        for(int i=0;i<3;i++)
            System.out.print(a[i]+" ");

    }
}
