package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scaner = new Scanner(System.in);
        int a, b;
        a=scaner.nextInt();
        b=scaner.nextInt();
        if(a<b)
            System.out.println(a);
        else
            System.out.println(b);
    }
}