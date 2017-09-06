package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        int[] a =new int[3];
        int positiv=0, negativ=0;
        for(int i=0; i<3;i++) {
            a[i] = Integer.parseInt(reader.readLine());
            if(a[i]>0)
                positiv++;
            if(a[i]<0)
                negativ++;
        }
        System.out.println("количество отрицательных чисел: "+negativ);
        System.out.println("количество положительных чисел: "+positiv);
    }
}
