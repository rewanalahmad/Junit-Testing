package com.example.junittesting;

public class BasicExample {
    public String massage;
    public BasicExample(String massage){
        this.massage=massage;
    }
    public String printMassage(){
        System.out.println(massage);
        return massage;
    }
}
