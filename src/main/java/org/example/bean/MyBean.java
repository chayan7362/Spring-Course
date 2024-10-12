package org.example.bean;

public class MyBean {
    private String massage;

    public void setMassage(String massage) {
        this.massage = massage;
    }

    public void showMassage(){
        System.out.println("Massage :"+massage);
    }

    @Override
    public String toString() {
        return "MyBean{" +
                "massage='" + massage + '\'' +
                '}';
    }
}
