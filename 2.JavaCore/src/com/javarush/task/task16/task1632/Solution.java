package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);
    static{
        threads.add(new Thread1());
        threads.add(new Thread2());
        threads.add(new Thread3());
        threads.add(new Thread4());
        threads.add(new Thread5());
    }

    public static void main(String[] args) {
    }
    public static class Thread1 extends Thread{
        @Override
        public void run() {
            while(true){
                super.run();
            }
        }
    }
    public static class Thread2 extends Thread{
        @Override
        public void run() {

            super.run();
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }


        }
    }
    public static class Thread3 extends Thread{
        @Override
        public void run() {
            while(!this.isInterrupted()) {
                System.out.println("Ура");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static class Thread4 extends Thread implements Message{
        @Override
        public void run() {
            while(!this.isInterrupted())
                super.run();
        }

        @Override
        public void showWarning() {
            if(this.isAlive())
                this.interrupt();
        }
    }
    public static class Thread5 extends Thread{


        @Override
        public void run() {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String text="";
            int sum=0;
            try {
                while(!(text=reader.readLine()).equals("N")){
                    sum+=Integer.parseInt(text);
                }
                System.out.println(sum);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}