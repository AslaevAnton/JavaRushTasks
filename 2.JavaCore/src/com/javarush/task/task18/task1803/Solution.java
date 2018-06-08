package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file = new FileInputStream(reader.readLine());
        ArrayList<Integer> listChars = new ArrayList<>();
        ArrayList<Integer> listCharCounts = new ArrayList<>();
        int max=0, fileByte=0;

        while(file.available()>0) {
            fileByte=file.read();
            if(listChars.contains(fileByte))
                listCharCounts.set(listChars.indexOf(fileByte),listCharCounts.get(listChars.indexOf(fileByte))+1);
            else{
                listChars.add(fileByte);
                listCharCounts.add(1);
            }
        }

        for (int ich: listCharCounts) {
            max=ich<max?max:ich;
        }

        for (int ich: listChars) {
            if(listCharCounts.get(listChars.indexOf(ich))==max)
                System.out.print(ich+" ");
        }

        file.close();
        reader.close();
    }
}
