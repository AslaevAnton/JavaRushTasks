package com.javarush.task.task06.task0606;

import java.io.*;
import java.util.Scanner;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while (a>0) {
            if (a%2==0)
                even++;
            else
                odd++;
            a=(a-a%10)/10;
        }
        System.out.println("Even: " +even+" Odd: "+odd);

    }
}
