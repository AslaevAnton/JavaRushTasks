package com.javarush.task.task15.task1525;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static com.javarush.task.task15.task1525.Statics.FILE_NAME;

/* 
Файл в статическом блоке
*/

public class Solution {
    //final static String FILE_NAME="C:\\Users\\AslaevAR\\Desktop\\1.txt";
    public static List<String> lines = new ArrayList<String>();
    static {
        try {
            BufferedReader file = new BufferedReader(new InputStreamReader(new FileInputStream(FILE_NAME)));
            String text;
            while ((text=file.readLine())!=null){
                lines.add(text);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        System.out.println(lines);
    }
}
