package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код   5, 2, 4, 7, 0
        ArrayList<int[]> list = new ArrayList<>();
        int[] int5 = new int[5];
        int[] int2 = new int[2];
        int[] int4 = new int[4];
        int[] int7 = new int[7];
        int[] int0 = new int[0];

        for (int i = 0; i < 5; i++) {
            int5[i]=i;
        }
        list.add(int5);
        for (int i = 0; i < 2; i++) {
            int2[i]=i;
        }
        list.add(int2);
        for (int i = 0; i < 4; i++) {
            int4[i]=i;
        }
        list.add(int4);
        for (int i = 0; i < 7; i++) {
            int7[i]=i;
        }
        list.add(int7);

        list.add(int0);

        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
