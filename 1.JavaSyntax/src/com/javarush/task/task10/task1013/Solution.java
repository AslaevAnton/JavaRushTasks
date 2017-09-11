package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // напишите тут ваши переменные и конструкторы
        private String name;
        private String lastName;
        private boolean sex;
        private int weigt;
        private int length;
        private int age;

        public Human() {
            this.name = "name";
            this.lastName = "lastName";
            this.sex = true;
            this.weigt = 60;
            this.length = 160;
            this.age = 35;
        }
        public Human(String name) {
            this.name = name;
        }

        public Human(String name, String lastName) {
            this.name = name;
            this.lastName = lastName;
        }

        public Human(String name, String lastName, boolean sex) {
            this.name = name;
            this.lastName = lastName;
            this.sex = sex;
        }

        public Human(String name, String lastName, boolean sex, int weigt) {
            this.name = name;
            this.lastName = lastName;
            this.sex = sex;
            this.weigt = weigt;
        }

        public Human(String name, String lastName, boolean sex, int weigt, int length) {
            this.name = name;
            this.lastName = lastName;
            this.sex = sex;
            this.weigt = weigt;
            this.length = length;
        }

        public Human(String name, String lastName, boolean sex, int weigt, int length, int age) {
            this.name = name;
            this.lastName = lastName;
            this.sex = sex;
            this.weigt = weigt;
            this.length = length;
            this.age = age;
        }

        public Human(String name, String lastName, int age) {
            this.name = name;
            this.lastName = lastName;
            this.age = age;
        }

        public Human(String lastName, boolean sex, int weigt, int length, int age) {
            this.lastName = lastName;
            this.sex = sex;
            this.weigt = weigt;
            this.length = length;
            this.age = age;
        }

        public Human(String lastName, boolean sex, int weigt, int length) {
            this.lastName = lastName;
            this.sex = sex;
            this.weigt = weigt;
            this.length = length;
        }
    }

}
