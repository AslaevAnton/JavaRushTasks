package com.javarush.task.task19.task1903;

/* 
Адаптация нескольких интерфейсов
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<String, String> countries = new HashMap<String, String>();
    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }

    public static void main(String[] args) {

        String code, number, np1, np2,np3, np4, result;

        code= String.valueOf(38);
        number= String.valueOf(501234567);
        number=("000000000"+number).substring(number.length()-1,number.length()+9);
        System.out.println(number);
        np1=number.substring(0,3);
        System.out.println(np1);
        np2=number.substring(3,6);
        System.out.println(np2);
        np3=number.substring(6,8);
        System.out.println(np3);
        np4=number.substring(8,10);
        System.out.println(np4);
        number="("+np1+")"+np2+"-"+np3+"-"+np4;
        result="+"+code+number;

        System.out.println(result);

    }

    public static class IncomeDataAdapter implements Customer, Contact  {
        private IncomeData data;

        public IncomeDataAdapter(IncomeData data) {
            this.data = data;
        }

        @Override
        public String getCompanyName() {
            return this.data.getCompany();
        }

        @Override
        public String getCountryName() {
            return countries.get(this.data.getCountryCode());
        }

        @Override
        public String getName() {
            return this.data.getContactLastName()+", "+this.data.getContactFirstName();
        }

        @Override
        public String getPhoneNumber() {
            String code, number, result="";
            code= String.valueOf(this.data.getCountryPhoneCode());
            number= String.valueOf(this.data.getPhoneNumber());
            number=("000000000"+number).substring(number.length()-1,number.length()+9);
            number="("+number.substring(0,3)+")"+number.substring(3,6)+"-"+number.substring(6,8)+"-"+number.substring(8,10);
            return result="+"+code+number;
        }
    }


    public static interface IncomeData {
        String getCountryCode();        //example UA

        String getCompany();            //example JavaRush Ltd.

        String getContactFirstName();   //example Ivan

        String getContactLastName();    //example Ivanov

        int getCountryPhoneCode();      //example 38

        int getPhoneNumber();           //example 501234567
    }

    public static interface Customer {
        String getCompanyName();        //example JavaRush Ltd.

        String getCountryName();        //example Ukraine
    }

    public static interface Contact {
        String getName();               //example Ivanov, Ivan

        String getPhoneNumber();        //example +38(050)123-45-67
    }
}