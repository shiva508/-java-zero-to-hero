package com.comrade.garbage_collection;

public class GarbageCollectionSystemClient {
    public static void main(String[] args) {
        GarbageCollectionSystemClient garbageCollectionSystemClient = new GarbageCollectionSystemClient();
        String data = new String("DAKKKSKSKKSKUNUSUS");
        data = null; //(String finalize method is called)
        garbageCollectionSystemClient = null; //( this object finalize method is called)
        System.gc();
        System.out.println("Process completed");
    }
    public void  finalize(){
        System.out.println("finalize called");
    }
}
