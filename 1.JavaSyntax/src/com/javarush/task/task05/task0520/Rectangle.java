package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
*/


public class Rectangle {
    //напишите тут ваш код
    private int top, left, width, height;

    public Rectangle(int left, int top, int width, int height) {
        this.left=left;
        this.top = top;
        this.width=width;
        this.height=height;
    }
    public Rectangle(int left, int top, int width) {
        this.left=left;
        this.top = top;
        this.width=width;
        this.height=width;
    }
    public Rectangle(int left, int top) {
        this.left=left;
        this.top = top;
        this.width=0;
        this.height=0;
    }
    public Rectangle(Rectangle rec) {
        this.left=rec.left;
        this.top = rec.top;
        this.width=rec.width;
        this.height=rec.height;
    }

    public static void main(String[] args) {

    }
}
