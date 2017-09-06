package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[3];
        int plus=0;
        for(int i=0;i<3;i++) {
            a[i] = scanner.nextInt();
            if(a[i]>0)
                plus++;
        }
        System.out.println(plus);

    }
}
