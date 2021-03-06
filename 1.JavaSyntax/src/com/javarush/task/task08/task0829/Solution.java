package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
        //List<String> addresses = new ArrayList<String>();
        HashMap<String, String> addresses = new HashMap<String, String>();
        while (true) {
            String family = reader.readLine();

            if (family.isEmpty()) break;

            String city = reader.readLine();

            addresses.put(city, family);
        }

        //read home number
        String address = reader.readLine();

        for (Map.Entry<String, String> pair: addresses.entrySet()
                ) {
            if(address.equals(pair.getValue()))
                System.out.println(pair.getKey());
        }
    }
}
