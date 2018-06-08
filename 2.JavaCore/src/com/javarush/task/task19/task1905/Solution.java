package com.javarush.task.task19.task1905;

import java.util.HashMap;
import java.util.Map;

/* 
Закрепляем адаптер
*/

public class Solution {
    public static Map<String,String> countries = new HashMap<String,String>();
    static{
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }

    public static void main(String[] args) {
/*
        String getName="Ivanov, Ivan";

        System.out.println(getName.split(", ")[1]);
        System.out.println(getName.split(", ")[0]);
        */

    }

    public static class DataAdapter implements RowItem {
        private Customer customer;
        private Contact contact;
        public DataAdapter(Customer customer, Contact contact) {
            this.contact=contact;
            this.customer=customer;
        }

        @Override
        public String getCountryCode() {
            for (Map.Entry<String,String> pair: countries.entrySet()) {
                if(pair.getValue().equals(this.customer.getCountryName()))
                    return pair.getKey();
            }
            return null;
        }

        @Override
        public String getCompany() {
            return this.customer.getCompanyName();
        }

        @Override
        public String getContactFirstName() {
            return this.contact.getName().split(", ")[1];
        }

        @Override
        public String getContactLastName() {
            return this.contact.getName().split(", ")[0];
        }

        @Override
        public String getDialString() {
            String numer=this.contact.getPhoneNumber().replaceAll("-","");
            numer=numer.replaceAll("\\(","");
            numer=numer.replaceAll("\\)","");
            return "callto://"+numer;
        }
    }

    public static interface RowItem {
        String getCountryCode();        //example UA
        String getCompany();            //example JavaRush Ltd.
        String getContactFirstName();   //example Ivan
        String getContactLastName();    //example Ivanov
        String getDialString();         //example callto://+380501234567
    }

    public static interface Customer {
        String getCompanyName();        //example JavaRush Ltd.
        String getCountryName();        //example Ukraine
    }

    public static interface Contact {
        String getName();               //example Ivanov, Ivan
        String getPhoneNumber();        //example +38(050)123-45-67 or +3(805)0123-4567 or +380(50)123-4567 or ...
    }
}