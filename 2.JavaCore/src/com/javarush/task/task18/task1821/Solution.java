package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        InputStream inFile = new FileInputStream(args[0]);
        ArrayList<Integer> charList = new ArrayList<>();
        HashMap<Integer, Integer> charsMap = new HashMap<>();
        int c;
        while((c=inFile.read())>-1){
            if(!charsMap.containsKey(c)){
                charsMap.put(c,1);
                charList.add(c);
            }
            else{
                charsMap.replace(c,(charsMap.get(c)+1));
            }
        }
/*
        charsMap.remove(13);
        charList.remove(charList.indexOf(13));
        charsMap.remove(10);
        charList.remove(charList.indexOf(10));
        */
        Collections.sort(charList);
        for (int i: charList) {
            System.out.println((char)i+" "+charsMap.get(i));
        }
        inFile.close();
    }
}
