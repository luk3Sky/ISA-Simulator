package com.foxploit;
import java.util.HashMap;

public class DataMemory {

    //data memory using HashMap
    private static HashMap<Integer,Integer> dataMemory = new HashMap<>();

    //write operation
    public static void setDataMemory(int address, int data){
        dataMemory.put(address, data);
    }

    //read operation
    public static int getDataMemory(int address){
        return dataMemory.get(address);
    }
    
}
