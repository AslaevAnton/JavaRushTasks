package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileIn = new BufferedReader(new FileReader(reader.readLine()));
        BufferedWriter fileOut = new BufferedWriter(new FileWriter(reader.readLine()));
        String st;

        while (fileIn.ready()) {
            String line = fileIn.readLine();
            String[] words = line.toString().split(" ");
            for (String s : words) {
                String s2=s.replaceAll("\\D","");
                System.out.println(s+" "+s2+" "+s.length()+" "+s2.length());
                if(s.length()==s2.length()&&s.length()>0)
                    fileOut.write(s+" ");
            }
        }
        reader.close();
        fileIn.close();
        fileOut.close();

    }
}
