package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        //напишите тут ваш код
        String lastString=null;
        String lastNum=null;
        int iLastString=0, iLastNum=0;
        for (int i = 0; i < array.length; i++) {
            if(lastString==null&&!isNumber(array[i])) {
                lastString = array[i];
                iLastString=i;
            }
            if(lastNum==null&&isNumber(array[i])) {
                lastNum = array[i];
                iLastNum=i;
            }

            if(isNumber(array[i])){
                if(Integer.parseInt(array[i])>Integer.parseInt(lastNum)){
                    array[iLastNum]=array[i];
                    array[i]=lastNum;
                    lastNum=null;
                    i=-1;
                }
                else {
                    lastNum = array[i];
                    iLastNum = i;
                }

            }
            else{
                if(isGreaterThan(lastString,array[i])){
                    array[iLastString]=array[i];
                    array[i]=lastString;
                    lastString=null;
                    i=-1;
                }
                else {
                    lastString = array[i];
                    iLastString = i;
                }
            }

        }
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-')) // не цифра и не начинается с '-'
            {
                return false;
            }
        }
        return true;
    }
}
