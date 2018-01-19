package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream inFile;
        //OutputStream outFile;
        String text="";
        char c;
        try {
            inFile =  new FileInputStream(reader.readLine());;

            while (inFile.available() > 0)
            {
                //text += String.valueOf(inFile.read()); //читаем один байт из потока для чтения
                c= (char) inFile.read();
                text +=c;
            }


            inFile.close(); //закрываем потоки
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(text);

     }
}