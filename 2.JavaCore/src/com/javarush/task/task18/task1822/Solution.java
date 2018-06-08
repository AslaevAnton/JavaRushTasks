package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader inFile = new BufferedReader(new FileReader(reader.readLine()));
        String stTenp;
        String[] stArray = new String[4];
        while (inFile.ready()){
            stTenp=inFile.readLine();
            stArray=stTenp.split(" ");
            if(stArray[0].equals(args[0])){
                System.out.print(stArray[0]);
                System.out.print(" "+stArray[1]);
                System.out.print(" "+stArray[2]);
                System.out.println(" "+stArray[3]);

                break;
            }

        }
        inFile.close();
        reader.close();
    }
}
