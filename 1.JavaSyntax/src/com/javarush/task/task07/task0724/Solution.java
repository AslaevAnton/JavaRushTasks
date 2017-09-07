package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human gfather1 = new Human("Ded1", true, 60);
        Human gfather2 = new Human("Ded2", true, 61);
        Human gmother1 = new Human("Babushka1", true, 50);
        Human gmother2 = new Human("Babushka2", true, 51);
        Human father = new Human("Papa", true, 30, gfather1, gmother1);
        Human mother = new Human("Mama", true, 25, gfather2, gmother2);
        Human daughter1 = new Human("Docha1", true, 5, father, mother);
        Human son = new Human("Sinok", true, 3, father, mother);
        Human daughter2 = new Human("Docha2", true, 1, father, mother);

        System.out.println(daughter1.toString());
        System.out.println(son.toString());
        System.out.println(daughter2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(gfather1.toString());
        System.out.println(gmother1.toString());
        System.out.println(gfather2.toString());
        System.out.println(gmother2.toString());
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















