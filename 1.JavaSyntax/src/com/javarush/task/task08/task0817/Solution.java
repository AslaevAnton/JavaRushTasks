package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            if ((i < 5)) {
                map.put("lastName" + i, "name");
            } else {
                map.put("lastName" + i, "name" + i);
            }
        }
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        //напишите тут ваш код
        HashMap<String, String> mapLocal = new HashMap<String, String>(map);
        for (Iterator<Map.Entry<String, String>> it = mapLocal.entrySet().iterator(); it.hasNext();) {
            HashMap.Entry<String, String> pairI = it.next();
            for (Iterator<Map.Entry<String, String>> jt = mapLocal.entrySet().iterator(); jt.hasNext();) {
                HashMap.Entry<String, String> pairJ = jt.next();
                if (pairI.getValue().equals(pairJ.getValue())  && !pairI.getKey().equals(pairJ.getKey()))
                    removeItemFromMapByValue(map, pairJ.getValue());
            }
        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
