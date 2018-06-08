package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);

        System.setOut(stream);

        testString.printSomething();

        System.setOut(consoleStream);

        String result = outputStream.toString();//.replaceAll(" ","");
        Matcher m = Pattern.compile("(\\d+) ([\\+\\-\\*]) (\\d+)").matcher( result );
        if (m.find()) {
            if ("+".equals(m.group(2)))
            // складываем m.group(1) и m.group(3)
                result=m.group(1)+" + "+m.group(3)+" = "+ String.valueOf(Integer.parseInt(m.group(1))+Integer.parseInt(m.group(3)));
            else if ("-".equals(m.group(2)))
            // вычитаем из m.group(1) m.group(3)
                result=m.group(1)+" - "+m.group(3)+" = "+ String.valueOf(Integer.parseInt(m.group(1))-Integer.parseInt(m.group(3)));
            else
            // умножаем m.group(1) и m.group(3)
                result=m.group(1)+" * "+m.group(3)+" = "+ String.valueOf(Integer.parseInt(m.group(1))*Integer.parseInt(m.group(3)));
        }
        /*
        String result = outputStream.toString().replaceAll(" ","");
        result=result.replaceAll("=","");
        result=result.substring(0,result.length()-2);
        int sum=0;

        if(result.replaceAll("\\d","").contains("+")) {
            sum = Integer.parseInt(result.split("\\+")[0]) + Integer.parseInt(result.split("\\+")[1]);
        }else if(result.replaceAll("\\d","").contains("-")) {
            sum = Integer.parseInt(result.split("-")[0]) - Integer.parseInt(result.split("-")[1]);
        }else if(result.replaceAll("\\d","").contains("*")) {
            sum = Integer.parseInt(result.split("\\*")[0]) * Integer.parseInt(result.split("\\*")[1]);
        }

        System.setOut(consoleStream);
        result=result.replaceAll("\\+", " + ")+" = "+String.valueOf(sum);
        */

        System.out.println(result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

