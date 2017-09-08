package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> result = new HashSet<Cat>();

        //напишите тут ваш код
        for (int i = 0; i < 4; i++) {
            result.add(new Cat());
        }

        return result;
    }

    public static Set<Dog> createDogs() {
        //напишите тут ваш код
        HashSet<Dog> result = new HashSet<Dog>();

        //напишите тут ваш код
        for (int i = 0; i < 3; i++) {
            result.add(new Dog());
        }

        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //напишите тут ваш код
        Set<Object> pets = new HashSet<Object>();
        Iterator<Dog> iDogs = dogs.iterator();
        while(iDogs.hasNext()){
            pets.add(iDogs.next());
        }
        Iterator<Cat> iCats = cats.iterator();
        while(iCats.hasNext()){
            pets.add(iCats.next());
        }

        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //напишите тут ваш код
         pets.removeAll(cats);


    }

    public static void printPets(Set<Object> pets) {
        //напишите тут ваш код
        Iterator<Object> i = pets.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }

    //напишите тут ваш код
    public static class Cat{

    }
    public static class Dog{

    }
}
