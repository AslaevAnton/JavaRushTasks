package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file = new FileInputStream(reader.readLine());
        ArrayList<Integer> listChars = new ArrayList<>();
        int fileByte=0;

        while(file.available()>0) {
            fileByte=file.read();
            if(!listChars.contains(fileByte)) {
                if (listChars.size() == 0) {
                    listChars.add(fileByte);
                } else if (listChars.size() == 1) {
                    if (listChars.get(0) < fileByte) {
                        listChars.add(fileByte);
                    } else {
                        listChars.add(0, fileByte);
                    }
                }
                if (fileByte < listChars.get(0)) {
                    listChars.add(0, fileByte);
                } else if (fileByte > listChars.get(listChars.size() - 1)) {
                    listChars.add(fileByte);
                }
                for (int i = 1; i < listChars.size(); i++) {
                    if (fileByte > listChars.get(i - 1) && fileByte < listChars.get(i)) {
                        listChars.add(i, fileByte);
                        break;
                    }
                }
            }
        }
        for (int ich: listChars) {
            System.out.print(ich+" ");
        }

        file.close();
        reader.close();
    }
}
