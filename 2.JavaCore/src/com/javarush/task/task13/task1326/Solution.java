package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader inFile = new BufferedReader(new InputStreamReader(new FileInputStream(reader.readLine())));

        String text="";
        ArrayList<Integer> numList = new ArrayList<>();

        /*
        while (inFile.available()>0){
            text+=(char)inFile.read();
            if(text.contains("\n")){
                if(Integer.parseInt(text.substring(0,text.length()-2))%2==0)
                    numList.add(Integer.parseInt(text.substring(0,text.length()-2)));
                text="";

            }
        }
        */
        if(text.length()>0&&Integer.parseInt(text)%2==0)
            numList.add(Integer.parseInt(text));
        while ((text=inFile.readLine())!=null){
            if(Integer.parseInt(text)%2==0)
                numList.add(Integer.parseInt(text));
        }

        Collections.sort(numList);
        for (int i: numList) {
            System.out.println(i);
        }
        //System.out.println(text);

        reader.close();
        inFile.close();
    }
}
