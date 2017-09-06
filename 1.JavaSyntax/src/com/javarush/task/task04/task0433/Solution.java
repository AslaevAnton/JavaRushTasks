package com.javarush.task.task04.task0433;


/* 
Гадание на долларовый счет
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int j=0, i=0;
        while(i<10) {
            while (j < 10) {
                System.out.print("S");
                j++;
            }
            System.out.println();
            i++;
            j=0;
        }
    }
}
