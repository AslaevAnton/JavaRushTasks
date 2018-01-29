package com.javarush.task.task14.task1419;

import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        //напишите тут ваш код

        try {
            int[] arr = new int[1];
            arr[2]=1;

        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            int[] arr = new int[-1];
            arr[0]=0;

        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new ArrayStoreException();

        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new ClassNotFoundException();

        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new NumberFormatException();

        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new RuntimeException();

        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new ClassCastException();

        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new CloneNotSupportedException();

        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new IllegalArgumentException();

        } catch (Exception e) {
            exceptions.add(e);
        }

    }
}











