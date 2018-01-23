package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text=reader.readLine();

        FileOutputStream fileOutputStream = null;

        fileOutputStream = new FileOutputStream(text);

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(fileOutputStream, "UTF-8"));

        while (!text.equals("exit")){
            text=reader.readLine();
            writer.write(text);
            writer.newLine();
        }
        writer.close();
        reader.close();

    }
}
