package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = 0;

        //напишите тут ваш код

        int N=Integer.parseInt(reader.readLine());
        int temp_int;
        if(N>0)
            maximum=Integer.parseInt(reader.readLine());
        for (int i = 0; i < N-1; i++) {
            temp_int=Integer.parseInt(reader.readLine());
            if(maximum<temp_int)
                maximum=temp_int;
        }

        System.out.println(maximum);
    }
}
