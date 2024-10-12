package com.loose.coupling;

public class UserWebserviceDataProvider implements DataProvider{
    @Override
    public String getUserData() {
        return "Fetching Data From Web Service";
    }
}
