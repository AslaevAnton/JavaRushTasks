package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] a = new int[3];
        for(int i=0;i<3;i++)
            a[i]=Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());

        if(a[0]<=a[1] && a[0]<=a[2])
            System.out.println((a[1] < a[2]) ? a[1] : a[2]);
        else
            if(a[1]<=a[0] && a[1]<=a[2])
                System.out.println((a[0] < a[2]) ? a[0] : a[2]);
            else
                if(a[2]<=a[1] && a[2]<=a[0])
                    System.out.println((a[1] < a[0]) ? a[1] : a[0]);
    }
}
