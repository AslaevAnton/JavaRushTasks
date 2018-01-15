package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        int[] nums = new int[5];
        for (int i = 0; i < 5; i++) {
            nums[i]=Integer.parseInt(reader.readLine());
        }
        int tempNum=0;
        for (int i = 0; i < 4; i++) {
            if(nums[i]>nums[i+1]) {
                tempNum = nums[i];
                nums[i]=nums[i+1];
                nums[i+1]=tempNum;
                i=-1;
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(nums[i]);
        }
    }
}
