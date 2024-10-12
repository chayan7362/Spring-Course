package com.loose.coupling;

public class UserManager {
    private DataProvider databaseProvider;

    public UserManager(DataProvider databaseProvider) {
        this.databaseProvider = databaseProvider;
    }

    public String getUserInfo(){
        return databaseProvider.getUserData();
    }
}

