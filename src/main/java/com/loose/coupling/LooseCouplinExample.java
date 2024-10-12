package com.loose.coupling;

public class LooseCouplinExample {

    public static void main(String[] args) {
        DataProvider dataProvider = new UserDatabaseProvider();
        UserManager userManager = new UserManager(dataProvider);
        System.out.println(userManager.getUserInfo());

        DataProvider dataProvider1 = new UserWebserviceDataProvider();
        UserManager userManager1 = new UserManager(dataProvider1);
        System.out.println(userManager1.getUserInfo());
    }
}
