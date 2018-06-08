package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> fileList = new ArrayList<>();
        String fileName="", temp;
        while(!(temp=reader.readLine()).equals("end")){
            if(fileName.equals(""))
                fileName=temp.substring(0,temp.indexOf(".part"));
            fileList.add(temp.substring(temp.indexOf(".part"),temp.length()));
        }
        Collections.sort(fileList);
        BufferedWriter outFile = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName)));
        for (String s:fileList) {
            BufferedReader inFile = new BufferedReader(new InputStreamReader(new FileInputStream(fileName+s)));
            while(inFile.ready()){
                outFile.write(inFile.read());
            }
            //System.out.println(fileName+s);
            inFile.close();
        }
        outFile.close();
        reader.close();
    }
}
