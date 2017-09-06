package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        String temp;
        for (int i = 0; i < 5; i++) {
            list.add(new Scanner(System.in).nextLine());
        }
        for (int i = 0; i < 13; i++) {
            temp=list.get(list.size()-1);
            list.remove(list.size()-1);
            list.add(0,temp);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
