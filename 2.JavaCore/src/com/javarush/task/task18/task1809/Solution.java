package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream=new FileInputStream(reader.readLine());
        FileOutputStream fileOutputStream = new FileOutputStream(reader.readLine());
        if(fileInputStream.available()>0) {
            byte[] byteFile = new byte[fileInputStream.available()];
            byte[] mirrorByteFile = new byte[byteFile.length];
            int fileSize=fileInputStream.read(byteFile);
            for (int i = 0; i < byteFile.length; i++) {
                mirrorByteFile[i]=byteFile[byteFile.length-1-i];
            }
            fileOutputStream.write(mirrorByteFile);
        }
        fileInputStream.close();
        fileOutputStream.close();

    }
}
