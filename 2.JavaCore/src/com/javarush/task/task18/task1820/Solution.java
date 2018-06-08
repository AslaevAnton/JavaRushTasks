package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        InputStream inFile = new FileInputStream(reader.readLine());
        OutputStream outFile = new FileOutputStream(reader.readLine());
        int c;
        String st = "";
        while((c=inFile.read())>-1){
            if(c!=(int)' '){
                st=st+(char)c;
            }
            else{
                outFile.write((Integer.toString((int) Math.round(Double.parseDouble(st)))).getBytes());
                outFile.write(' ');
                st="";
            }
        }
        if(st.length()>0){
            outFile.write((Integer.toString((int) Math.round(Double.parseDouble(st)))).getBytes());
        }
        inFile.close();
        outFile.close();
        reader.close();

    }
}
