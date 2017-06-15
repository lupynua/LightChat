package com.liubomyr.opanovych.lightchat.models;

public class User {
    public String uid;
    public String email;
    public String firebaseToken;
    public String name;

    public User(){

    }

    public User(String uid, String email, String firebaseToken, String name){
        this.uid = uid;
        this.email = email;
        this.firebaseToken = firebaseToken;
        this.name = name;
    }
}
