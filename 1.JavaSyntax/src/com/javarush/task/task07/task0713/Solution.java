package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Integer> intList = new ArrayList<>();
        ArrayList<Integer> intList3 = new ArrayList<>();
        ArrayList<Integer> intList2 = new ArrayList<>();
        ArrayList<Integer> intListother = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            intList.add(new Scanner(System.in).nextInt());
        }
        for (int i = 0; i < intList.size(); i++) {
            if(intList.get(i)%2==0 || intList.get(i)%3==0) {
                if (intList.get(i) % 2 == 0)
                    intList2.add(intList.get(i));
                if (intList.get(i) % 3 == 0)
                    intList3.add(intList.get(i));
            }
            else
                intListother.add(intList.get(i));
        }
        printList(intList3);
        printList(intList2);
        printList(intListother);
    }

    public static void printList(List<Integer> list) {
        //напишите тут ваш код
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
