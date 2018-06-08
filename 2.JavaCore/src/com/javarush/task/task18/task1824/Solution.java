package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName="";
        ReadThread thread;
        while(true){
            try {
                thread = new ReadThread((fileName=reader.readLine()));
                thread.start();
                thread.join();
            } catch (FileNotFoundException e) {
                System.out.println(fileName);
                break;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        reader.close();

    }

    public static class ReadThread extends Thread {
        InputStream inFile;
        String fileName;
        int c;
        public ReadThread(String fileName) throws FileNotFoundException {
            //implement constructor body
            inFile = new FileInputStream(fileName);
            this.fileName=fileName;
        }

        // implement file reading here - реализуйте чтение из файла тут
        @Override
        public void run() {
            try {
                while(inFile.read()>-1){
                    inFile.read();
                }
                inFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}
