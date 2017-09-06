package com.javarush.task.task05.task0527;

/* 
Том и Джерри
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);

        //напишите тут ваш код
        Cat tomCat = new Cat("Tom", 25,"grey");
        Dog boolDog = new Dog("Booldog", 50, 'm');
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    //напишите тут ваш код
    public static class Cat{
        String name, color;
        int height;

        public Cat(String name, int height, String color){
            this.name=name;
            this.height=height;
            this.color=color;
        }
    }
    public static class Dog{
        String name;
        int height;
        char sex;

        public Dog(String name, int height, char sex){
            this.name=name;
            this.height=height;
            this.sex=sex;
        }
    }
}
