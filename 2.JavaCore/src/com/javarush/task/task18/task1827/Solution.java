package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName=reader.readLine();

        BufferedReader inFile = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));

        if(args.length>0){
            ArrayList<String> file = new ArrayList<>();
            int max=-1;
            String stTemp, idTemp;
            while((stTemp=inFile.readLine())!=null){
                file.add(stTemp);
                //idTemp=stTemp.substring(0,7);
                //System.out.println(stTemp.substring(0,5)+" "+stTemp.length());
                if(stTemp.length()>8&&Integer.parseInt(stTemp.substring(0,8).trim())>max)
                    max=Integer.parseInt(stTemp.substring(0,8).trim());
                //System.out.println(stTemp);
            }
            BufferedWriter outFile = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName)));
            for (String s: file) {
                outFile.write(s);
                outFile.newLine();
            }

            String id="", productName="", price="", quantity="", spase="";
                spase=""; for (int i = 0; i < 9; i++) spase+=" ";
            id=(String.valueOf(max+1)+spase).substring(0,8);
                spase=""; for (int i = 0; i < 31; i++) spase+=" ";
            productName=(args[1]+spase).substring(0,30);
                spase=""; for (int i = 0; i < 9; i++) spase+=" ";
            price=(args[2]+spase).substring(0,8);
                spase=""; for (int i = 0; i < 5; i++) spase+=" ";
            quantity=(args[3]+spase).substring(0,4);
            //System.out.println(id+productName+price+quantity);
            outFile.write(id+productName+price+quantity);
            outFile.close();
        }

        inFile.close();
        reader.close();
    }
}
