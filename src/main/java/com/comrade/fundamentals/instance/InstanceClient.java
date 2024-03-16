package com.pool.instance;

public class InstanceClient {
    String userName;

    {
        System.out.println("INSTANCE BLOCK");
    }
    public InstanceClient() {
        System.out.println("CONSTRUCTOR ");
    }

    public static void main(String[] args) {
        InstanceClient instanceClient=new InstanceClient();
        System.out.println(instanceClient.userName);
    }
}
