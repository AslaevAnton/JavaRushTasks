package com.javarush.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/* 
Слова в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(new Scanner(System.in).nextLine());
        }
        list.remove(2);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(list.size()-1-i));
        }
    }
}


