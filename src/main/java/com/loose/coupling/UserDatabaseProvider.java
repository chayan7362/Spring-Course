package com.loose.coupling;

public class UserDatabaseProvider implements DataProvider {

    @Override
    public String getUserData() {
        return "This is a user database";
    }
}
