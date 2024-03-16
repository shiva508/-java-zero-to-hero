package com.pool.final_flow.method;

public class FinalMethodClient {
    public static void main(String[] args) {
        FinalParent finalParent = new FinalParent();
        finalParent.connectionFactory();
        finalParent.databaseObject();
    }
}
