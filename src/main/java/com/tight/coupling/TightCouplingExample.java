package com.tight.coupling;

public class TightCouplingExample {

    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        String user = userManager.getUserManager();
        System.out.println(user);
    }
}
