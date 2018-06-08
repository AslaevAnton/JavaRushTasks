package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        InputStream inFile = new FileInputStream(args[1]);
        OutputStream outFile = new FileOutputStream(args[2]);
        int c;

        if(args[0].equals("-e")){
            while((c=inFile.read())>-1){
                outFile.write(c+1);
            }
        }
        if(args[0].equals("-d")){
            while((c=inFile.read())>-1){
                outFile.write(c-1);
            }
        }
        inFile.close();
        outFile.close();
    }

}
