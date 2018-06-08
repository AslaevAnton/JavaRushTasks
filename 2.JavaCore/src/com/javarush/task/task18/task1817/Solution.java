package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        int b;
        float result= (float) 0.00;
        int countAll=0, countSpase=0;
        while((b= reader.read())>0){
            if(b==' ')
                countSpase++;
            countAll++;
        }
        result=(float)countSpase/countAll*100;
        result = Math.round(result*100)/100.0f;
        System.out.println(result);
        reader.close();

    }
}
