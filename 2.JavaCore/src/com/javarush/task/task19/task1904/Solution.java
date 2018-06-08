package com.javarush.task.task19.task1904;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) throws ParseException, IOException {
        /*
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(new FileReader(reader.readLine()));
        String[] stPerson=scanner.nextLine().split(" ");
        //System.out.println(stPerson[0]);
        System.out.println(new Person(stPerson[1], stPerson[2], stPerson[0], new SimpleDateFormat( "dd.MM.yyyy" ).parse( stPerson[3]+"."+stPerson[4]+"."+stPerson[5])));
*/
    }

    public static class PersonScannerAdapter implements PersonScanner {
        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException, ParseException {
            String[] stPerson = new String[6];
            stPerson=this.fileScanner.nextLine().split(" ");
            return new Person(stPerson[1], stPerson[2], stPerson[0], new SimpleDateFormat( "dd.MM.yyyy" ).parse( stPerson[3]+"."+stPerson[4]+"."+stPerson[5]));
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
