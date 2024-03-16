package com.comrade.dsa.dsa_list.arraylist;

public class ArrayListClient {
    public static void main(String[] args) {
        DsArrayList dsArrayList=new DsArrayList();
        dsArrayList.addAtFront(1);
        dsArrayList.addAtFront(2);
        dsArrayList.printData();
        dsArrayList.addAtFront(3);
        dsArrayList.printData();
        dsArrayList.addAtIndex(1,5);
        dsArrayList.printData();
        dsArrayList.addAtBack(8);
        dsArrayList.printData();
        dsArrayList.removeFromFront();
        dsArrayList.printData();
        dsArrayList.removeFromBack();
        dsArrayList.printData();
        dsArrayList.addAtFront(6);
        dsArrayList.printData();
        dsArrayList.removeFromIndex(2);
        dsArrayList.printData();
    }
}