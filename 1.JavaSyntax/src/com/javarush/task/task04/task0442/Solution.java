package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num=0, sum=0;
        while(num!=-1){
            sum+=num;
            num=Integer.parseInt(reader.readLine());

        }
        System.out.println(sum+num);
    }
}
