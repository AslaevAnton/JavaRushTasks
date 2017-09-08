package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        //напишите тут ваш код
        String[] ss = s.split(" ");
        s="";
        for (int i = 0; i < ss.length; i++) {
            ss[i]=ss[i].replace(" ", "");
            if(!ss[i].equals(""))
                ss[i]=ss[i].substring(0,1).toUpperCase()+ss[i].substring(1,ss[i].length());
            s+=ss[i];
            if(i+1<ss.length)
                s+=" ";
        }
        System.out.println(s);
    }
}
