package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file1 = new FileInputStream(reader.readLine());
        FileOutputStream file2 = new FileOutputStream(reader.readLine());
        FileOutputStream file3 = new FileOutputStream(reader.readLine());
        if(file1.available()>0){
            byte[] block = new byte[file1.available()];
            int fileSize=file1.read(block, 0, (file1.available()/2+file1.available()%2));
            file2.write(block,0,fileSize);
            fileSize=file1.read(block);
            file3.write(block,0,fileSize);
        }
        file1.close();
        file2.close();
        file3.close();

    }
}
