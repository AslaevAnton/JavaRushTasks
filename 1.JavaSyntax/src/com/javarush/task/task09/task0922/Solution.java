package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("MM/dd/yyyy");
        SimpleDateFormat dateFormat2 = new SimpleDateFormat("MMM dd, yyyy", Locale.US);
        String sDate= new Scanner(System.in).nextLine();
        Date date = dateFormat1.parse(sDate);
        System.out.println(dateFormat2.format(date).toUpperCase());

    }
}
