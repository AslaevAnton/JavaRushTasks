package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        strings = new ArrayList<>();
        int maxSize=0;
        for (int i = 0; i < 5; i++) {
            strings.add(new Scanner(System.in).nextLine());
            if(strings.get(i).length()>maxSize)
                maxSize=strings.get(i).length();
        }
        for (int i = 0; i < 5; i++) {
            if(strings.get(i).length()==maxSize)
                System.out.println(strings.get(i));
        }
    }
}
