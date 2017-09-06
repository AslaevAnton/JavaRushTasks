package com.javarush.task.task04.task0424;

/* 
Три числа
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
        int tempnum=0, tempi=-1, chek=0;
        for(int i=0; i<3; i++)
            for(int j=0;j<3; j++)
                if(a[i]==a[j]&&i!=j) {
                    tempnum = a[i];
                    chek=1;
                }
        for(int i=0;i<3&&chek==1;i++)
            if(a[i]!=tempnum)
                tempi=i;
        if(tempi>-1)
            System.out.println(tempi+1);
    }
}
