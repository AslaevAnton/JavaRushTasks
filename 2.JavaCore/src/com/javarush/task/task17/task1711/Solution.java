package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //start here - начни тут

        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        switch (args[0]) {
            case "-c": synchronized (allPeople){
                for (int i = 1; i < args.length; i += 3) {
                    if (args[i + 1].equals("м"))
                        allPeople.add(Person.createMale(args[i], f.parse(args[i + 2])));
                    if (args[i + 1].equals("ж"))
                        allPeople.add(Person.createFemale(args[i], f.parse(args[i + 2])));
                    System.out.println((allPeople.size() - 1));
                }
            }
            break;
            case "-u": synchronized (allPeople){
                for (int i = 1; i < args.length; i += 4) {
                    if (args[i + 2].equals("м"))
                        allPeople.set(Integer.parseInt(args[i]), Person.createMale(args[i + 1], f.parse(args[i + 3])));
                    if (args[i + 2].equals("ж"))
                        allPeople.set(Integer.parseInt(args[i]), Person.createFemale(args[i + 1], f.parse(args[i + 3])));
                }
            }
            break;
            case "-d": synchronized (allPeople){
                Person p = Person.createFemale(null, null);
                p.setSex(null);
                for (int i = 1; i < args.length; i++) {
                    allPeople.set(Integer.parseInt(args[i]), p);
                }
            }
            break;
            case "-i": synchronized (allPeople){
                for (int i = 1; i < args.length; i++) {
                    System.out.println(allPeople.get(Integer.parseInt(args[i])).getName() + " "
                            + (allPeople.get(Integer.parseInt(args[i])).getSex().equals(Sex.MALE) ? "м" : "ж") + " "
                            + new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH).format(allPeople.get(Integer.parseInt(args[i])).getBirthDay()));
                }
            }
            break;
        }

    }
}
