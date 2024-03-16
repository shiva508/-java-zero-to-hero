package com.comrade.java_15.sealed.clazz;

public sealed class UserService permits AdminService{

    public void getPassword(){
        System.out.println("PASSWORD");
    }
}
