package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //start here - начни тут

        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        if(args[0].equals("-c")){
            if(args[2].equals("м"))
                allPeople.add(Person.createMale(args[1], f.parse(args[3])));
            if(args[2].equals("ж"))
                allPeople.add(Person.createFemale(args[1], f.parse(args[3])));
            System.out.println((allPeople.size()-1));
        }
        if(args[0].equals("-u")){
            if(args[3].equals("м"))
                allPeople.set(Integer.parseInt(args[1]),Person.createMale(args[2], f.parse(args[4])));
            if(args[3].equals("ж"))
                allPeople.set(Integer.parseInt(args[1]),Person.createFemale(args[2], f.parse(args[4])));
        }
        if(args[0].equals("-d")){
            Person p = Person.createFemale(null,null);
            p.setSex(null);
            allPeople.set(Integer.parseInt(args[1]),p);
        }
        if(args[0].equals("-i")){
            String text=allPeople.get(Integer.parseInt(args[1])).getName()+" "
                    +(allPeople.get(Integer.parseInt(args[1])).getSex().equals(Sex.MALE)?"м":"ж")+" "
                    +new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH).format(allPeople.get(Integer.parseInt(args[1])).getBirthDay());
            System.out.println(text);
        }
    }
}
