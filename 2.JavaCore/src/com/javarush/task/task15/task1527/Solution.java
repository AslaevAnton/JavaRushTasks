package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String strURL=reader.readLine();
        String objValue="";
        ArrayList<String> textList = new ArrayList<>();
        strURL=strURL.substring(strURL.indexOf('?')+1,strURL.length());
        if(strURL.contains("obj"))
            objValue=strURL.substring(strURL.indexOf("obj")+4,strURL.indexOf('&',strURL.indexOf("obj")+4));
        while(strURL.indexOf('&')>0){
            if(strURL.substring(0,strURL.indexOf('&')).indexOf('=')>0)
                textList.add(strURL.substring(0,strURL.indexOf('=')));
            else
                textList.add(strURL.substring(0,strURL.indexOf('&')));
            strURL=strURL.substring(strURL.indexOf('&')+1,strURL.length());
        }
        if(strURL.indexOf('=')>0)
            textList.add(strURL.substring(0,strURL.indexOf('=')));
        else
            textList.add(strURL);
        /*System.out.println(strURL);
        System.out.println(textList);
        System.out.println(objValue);*/

        for (String s: textList) {
            System.out.print(s+" ");
        }
        System.out.println();

        if(!objValue.equals(""))
            if(objValue.matches("((-|\\+)?[0-9]+(\\.[0-9]+)?)+"))
                alert(Double.parseDouble(objValue));
            else
                alert(objValue);
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
