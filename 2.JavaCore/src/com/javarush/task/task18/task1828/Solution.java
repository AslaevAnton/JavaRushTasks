package com.javarush.task.task18.task1828;

/* 
Прайсы 2
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

            String id="", productName="", price="", quantity="", spase="";
            spase=""; for (int i = 0; i < 9; i++) spase+=" ";
            if(args.length>1)id=(args[1]+spase).substring(0,8);
            spase=""; for (int i = 0; i < 31; i++) spase+=" ";
            if(args.length>2) productName=(args[2]+spase).substring(0,30);
            spase=""; for (int i = 0; i < 9; i++) spase+=" ";
            if(args.length>3) price=(args[3]+spase).substring(0,8);
            spase=""; for (int i = 0; i < 5; i++) spase+=" ";
            if(args.length>4) quantity=(args[4]+spase).substring(0,4);

            while((stTemp=inFile.readLine())!=null){
                if(stTemp.indexOf('\uFEFF')>=0)
                    stTemp=stTemp.substring(stTemp.indexOf('\uFEFF')+1,stTemp.length());
                if(args[0].equals("-d")&&stTemp.length()>7&&Integer.parseInt(stTemp.substring(0,8).trim())!=Integer.parseInt(args[1]))
                    file.add(stTemp);
                if(args[0].equals("-u")) {
                    if (stTemp.length() > 7 && Integer.parseInt(stTemp.substring(0, 8).trim()) == Integer.parseInt(args[1]))
                        file.add(id + productName + price + quantity);
                    else
                        file.add(stTemp);
                }
            }
            BufferedWriter outFile = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName)));
            for (String s: file) {
                outFile.write(s);
                outFile.newLine();
            }


            //System.out.println(id+productName+price+quantity);
            //outFile.write(id+productName+price+quantity);
            outFile.close();
        }

        inFile.close();
        reader.close();
    }
}
