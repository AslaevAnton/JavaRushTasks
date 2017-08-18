package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;
import java.nio.Buffer;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scaner = new Scanner(System.in);
        int a=scaner.nextInt();
        int b=scaner.nextInt();
        int c=scaner.nextInt();

        if(a==b)
            if(b==c)
                System.out.println(a+" "+b+" "+c);
            else
                System.out.println(a+" "+b);
        else
            if(b==c)
                System.out.println(b+" "+c);
            else
                if(a==c)
                    System.out.println(a+" "+c);
    }
}