package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text;
        while(!(text=reader.readLine()).equals("exit")){
            if(text.matches("((-|\\+)?[0-9]+(\\.[0-9]+)?)+")){//num
                if(text.matches("(-|\\+)?[0-9]+")){//int
                    if(Integer.parseInt(text)>0&&Integer.parseInt(text)<128)
                        print((short)Integer.parseInt(text));
                    else
                        print(Integer.parseInt(text));
                }
                else
                    print(Double.parseDouble(text));
            }
            else
                print(text);
            System.out.println(text.matches("((-|\\+)?[0-9]+(\\.[0-9]+)?)+"));
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
