package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<Integer> list = new ArrayList<>();
        int n=0, nMax=0;
        /*int[] templist = new int[] {2, 4, 4, 4, 8, 8, 9, 12, 12, 14};
        for (int i = 0; i < 10; i++) {
            list.add(templist[i]);
        }*/
        for (int i = 0; i < 10; i++) {
            list.add(new Scanner(System.in).nextInt());
        }
        for (int i = 1; i < list.size(); i++) {
            if(list.get(i-1).equals(list.get(i))) {
                n++;
                if(n>nMax)
                    nMax = n;
            }
            else
                n=0;
        }
        System.out.println(++nMax);
    }
}