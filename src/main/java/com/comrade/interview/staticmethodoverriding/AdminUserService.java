package com.comrade.interview.staticmethodoverriding;

public class AdminUserService extends UserService{
   //@Override Not Allowed
    public static void userName(){
        System.out.println("Admin User Name Static");
    }
}
