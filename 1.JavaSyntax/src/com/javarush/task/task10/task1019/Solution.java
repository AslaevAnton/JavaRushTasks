package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String,Integer> map = new HashMap<>();

        String id = reader.readLine();
        String name=null;
        while (!id.isEmpty()){
            name = reader.readLine();
            map.put(name, Integer.parseInt(id));
            id=reader.readLine();

        }

        for (Map.Entry<String,Integer> pair : map.entrySet()) {
            System.out.println(pair.getValue() + " " + pair.getKey());
        }

    }
}
