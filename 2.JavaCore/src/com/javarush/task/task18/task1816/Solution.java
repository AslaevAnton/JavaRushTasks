package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        int b;
        int count=0;
        while((b= reader.read())>0){
            if(((char)b>='A'&&(char)b<='Z')||((char)b>='a'&&(char)b<='z'))
                count++;
        }
        System.out.println(count);
        reader.close();
    }
}
