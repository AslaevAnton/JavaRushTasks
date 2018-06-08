package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader file = new BufferedReader(new FileReader(reader.readLine()));
        int count =0;

        while (file.ready()) {
            String[] arr = file.readLine().split("\\W");
            count = count + Collections.frequency(new ArrayList<String>(Arrays.asList(arr)), "world");
        }

        System.out.println(count);
        reader.close();
        file.close();
    }
}
