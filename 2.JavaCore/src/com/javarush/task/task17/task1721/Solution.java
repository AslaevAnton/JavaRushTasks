package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        BufferedReader fileAllLines=new BufferedReader(new FileReader(reader.readLine()));
        BufferedReader fileForRemoveLines=new BufferedReader(new FileReader(reader.readLine()));

        String fileLine;
        while((fileLine=fileAllLines.readLine())!=null){
            allLines.add(fileLine);
        }
        while((fileLine=fileForRemoveLines.readLine())!=null){
            forRemoveLines.add(fileLine);
        }

        reader.close();
        fileAllLines.close();
        fileForRemoveLines.close();

        try {
            new Solution().joinData();
        }
        catch (CorruptedDataException e){
            return;
        }
        catch (Exception e){
        }
    }

    public void joinData () throws CorruptedDataException {

        if(allLines.containsAll(forRemoveLines)){
            //remove
            allLines.removeAll(forRemoveLines);
        }else{
            //clear
            allLines.clear();
            throw new CorruptedDataException();
        }

    }
}
