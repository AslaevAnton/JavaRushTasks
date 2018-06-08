package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1=reader.readLine();
        String file2=reader.readLine();
        String file3=reader.readLine();
        BufferedWriter outputFile1 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file1)));
        BufferedReader inputFile2 = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
        BufferedReader inputFile3 = new BufferedReader(new InputStreamReader(new FileInputStream(file3)));
        int temp;

        while ((temp=inputFile2.read())>0) {
            outputFile1.write(temp);
            //outputFile1.newLine();
            //System.out.println(temp);
        }
        //outputFile1.newLine();
        while ((temp=inputFile3.read())>0) {
            outputFile1.write(temp);
            //outputFile1.newLine();
        }
        outputFile1.close();
        inputFile2.close();
        inputFile3.close();
    }
}
