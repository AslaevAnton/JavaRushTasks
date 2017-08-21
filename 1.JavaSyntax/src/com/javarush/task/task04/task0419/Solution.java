package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a, b, c, d;
        a=Integer.parseInt(reader.readLine());
        b=Integer.parseInt(reader.readLine());
        c=Integer.parseInt(reader.readLine());
        d=Integer.parseInt(reader.readLine());
/*
        if(a>b)
            if(a>c)
                if(a>d)
                    System.out.println(a);
                else
                    System.out.println(d);
            else
                if(c>d)
                    System.out.println(c);
                else
                    System.out.println(d);
        else
            if(b>c)
                if(b>d)
                    System.out.println(b);
                else
                    System.out.println(d);
            else
                if(c>d)
                    System.out.println(c);
                else
                    System.out.println(d);
                    */
    if(max(a,b)>max(c,d))
        System.out.println(max(a,b));
    else
        System.out.println(max(c,d));

    }
    public static int max(int a, int b){
        if(a>b)
            return a;
        else
            return b;
    }
}
