package com.javarush.task.task08.task0816;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));

        //напишите тут ваш код
        for (int i = 0; i < 9; i++) {
            Date date = new Date();
            date.setMonth(i+1);
            map.put("Name"+i, date);
        }
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код
        Iterator <HashMap.Entry<String, Date>> i = map.entrySet().iterator();
        while (i.hasNext()){
            HashMap.Entry<String, Date> pair = i.next();
            if(pair.getValue().getMonth()>4 && pair.getValue().getMonth()<8)
                i.remove();
        }
    }
    public static void main(String[] args) {

    }
}
