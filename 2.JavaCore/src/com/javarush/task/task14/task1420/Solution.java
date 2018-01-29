package com.javarush.task.task14.task1420;

/* 
НОД
*/


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1=0, num2=0, nod=0;
        num1=Integer.parseInt(reader.readLine());
        num2=Integer.parseInt(reader.readLine());

        if (num1 < 1 || 1 > num2) throw new Exception();
        // NOD
        while (num1 != 0 && num2 != 0) {
            if (num1 > num2) {
                num1 %= num2;
            } else {
                num2 %= num1;
            }
        }
        nod=num1+num2;

        System.out.println(nod);

    }
}
