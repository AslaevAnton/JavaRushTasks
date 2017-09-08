package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<Human> childrenEmpty = new ArrayList<>();
        ArrayList<Human> children = new ArrayList<>();
        children.add(new Human("NameChild1", false,5,childrenEmpty));
        children.add(new Human("NameChild2", false,3,childrenEmpty));
        children.add(new Human("NameChild3", false,1,childrenEmpty));
        ArrayList<Human> father = new ArrayList<>();
        father.add(new Human("NameFather", true,32,children));
        ArrayList<Human> mother = new ArrayList<>();
        mother.add(new Human("NameMother", false,28,children));
        ArrayList<Human> gfather = new ArrayList<>();
        gfather.add(new Human("NameGrandFather1", true,60,father));
        gfather.add(new Human("NameGrandFather2", true,59,mother));
        ArrayList<Human> gmother = new ArrayList<>();
        gmother.add(new Human("NameGrandMother1", false,55,father));
        gmother.add(new Human("NameGrandMother2", false,51,mother));
        for (Human h: gfather
             ) {
            System.out.println(h.toString());
        }
        for (Human h: gmother
                ) {
            System.out.println(h.toString());
        }
        for (Human h: father
                ) {
            System.out.println(h.toString());
        }
        for (Human h: mother
                ) {
            System.out.println(h.toString());
        }
        for (Human h: children
                ) {
            System.out.println(h.toString());
        }

    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
