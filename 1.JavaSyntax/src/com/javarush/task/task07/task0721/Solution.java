package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum;
        int minimum;

        //напишите тут ваш код
        int[] intmass = new int[20];
        for (int i = 0; i < 20; i++) {
            intmass[i]=Integer.parseInt(reader.readLine());
        }
        maximum=intmass[0];
        minimum=intmass[0];
        for (int i = 0; i < 20; i++) {
            if(maximum<intmass[i])
                maximum=intmass[i];
            if(minimum>intmass[i])
                minimum=intmass[i];
        }

        System.out.print(maximum);
        System.out.print(" ");
        System.out.println(minimum);
    }
}
