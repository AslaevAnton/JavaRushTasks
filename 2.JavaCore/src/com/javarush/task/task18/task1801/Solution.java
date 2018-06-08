package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file = new FileInputStream(reader.readLine());
        int max=0, fileByte=0;
        if(file.available()>0)
            max=file.read();
        while(file.available()>0)
            max=max>(fileByte=file.read())?max:fileByte;
        file.close();
        reader.close();
        System.out.println(max);
    }
}
