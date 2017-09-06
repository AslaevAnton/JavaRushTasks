package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum=0, count=0, num=Integer.parseInt(reader.readLine());
        double result;
        while(num!=-1){
            count++;
            sum+=num;
            num=Integer.parseInt(reader.readLine());
        }
        result=(double)sum/count;
        System.out.println(result);
    }
}

