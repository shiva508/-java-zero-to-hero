package com.comrade.collection.list.copy_on_write_array;
public class ConcurrentClient {
    public static void main(String[] args) {
        ConcurrentArray concurrentArray=new ConcurrentArray();
        concurrentArray.stimullate();
    }
}
