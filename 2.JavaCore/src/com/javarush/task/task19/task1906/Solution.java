package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fileIn = new FileReader(reader.readLine());
        FileWriter fileOut = new FileWriter(reader.readLine());
        int c;
        c=fileIn.read();
        while((c=fileIn.read())>-1){
            fileOut.write(c);
            fileIn.read();
        }
        fileIn.close();
        fileOut.close();
        reader.close();
    }
}
