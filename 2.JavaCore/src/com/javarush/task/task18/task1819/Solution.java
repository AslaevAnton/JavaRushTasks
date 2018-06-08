package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sFile1=reader.readLine();
        String sFile2=reader.readLine();
        ArrayList<Integer> chFile1 = new ArrayList<>();
        int tchar;
        InputStream isFile1 = new FileInputStream(sFile1);

        while((tchar=isFile1.read())>0){
            chFile1.add(tchar);

        }
        OutputStream osFile1 = new FileOutputStream(sFile1);
        InputStream isFile2 = new FileInputStream(sFile2);
        while((tchar=isFile2.read())>0){
            osFile1.write(tchar);
        }

        for (int i = 0; i < chFile1.size(); i++) {
            osFile1.write(chFile1.get(i));

        }
        reader.close();
        isFile1.close();
        osFile1.close();
        isFile2.close();

    }
}
