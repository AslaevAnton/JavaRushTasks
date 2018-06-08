package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName;
        while(!(fileName=reader.readLine()).equals("exit")){
            new ReadThread(fileName).start();
        }
        /*
        for (Map.Entry<String, Integer> i: resultMap.entrySet()) {
            System.out.println(i.getKey().getBytes()+" "+i.getValue());
        }
        */
        reader.close();

    }

    public static class ReadThread extends Thread {
        InputStream inFile;
        String fileName;
        int c;
        HashMap<Integer,Integer> charList = new HashMap<>();
        int max=0, charMax;
        public ReadThread(String fileName) throws FileNotFoundException {
            //implement constructor body
            inFile = new FileInputStream(fileName);
            this.fileName=fileName;
        }

        // implement file reading here - реализуйте чтение из файла тут
        @Override
        public void run() {
            //super.run();
            try {
                while((c=inFile.read())>-1){
                    if(!charList.containsKey(c)){
                        charList.put(c,1);
                    }
                    else{
                        charList.replace(c,charList.get(c)+1);
                        if(charList.get(c)>max) {
                            max=charList.get(c);
                            charMax=c;
                        }
                    }
                }
                resultMap.put(fileName,charMax);
                inFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
