package com.eg.app.model;

public class User {
    String name;

    public User (String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

}