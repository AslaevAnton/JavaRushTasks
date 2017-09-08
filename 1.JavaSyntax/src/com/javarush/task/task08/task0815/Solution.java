package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put("lastName"+i, "name");
        }
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int countName=0;
        Iterator<HashMap.Entry<String, String>> i = map.entrySet().iterator();
        while(i.hasNext()){
            if(i.next().getValue().equals(name))
                countName++;
        }
        return countName;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        int countLastName=0;
        Iterator<HashMap.Entry<String, String>> i = map.entrySet().iterator();
        while(i.hasNext()){
            if(i.next().getKey().equals(lastName))
                countLastName++;
        }
        return countLastName;

    }

    public static void main(String[] args) {

    }
}
