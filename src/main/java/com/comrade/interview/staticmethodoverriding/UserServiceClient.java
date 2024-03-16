package com.comrade.interview.staticmethodoverriding;

public class UserServiceClient {
    public static void main(String[] args) {
        UserService userService = new AdminUserService();
        userService.userName();
        AdminUserService adminUserService = new AdminUserService();
        adminUserService.userName();
    }
}
