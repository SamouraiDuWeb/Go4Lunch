package com.example.go4lunch.model;

import javax.annotation.Nullable;

public class Users {

    //Model for the Users
    public String uid;
    public String username;

    public Users() {
    }

    public Users(String uid, String username) {
        this.uid = uid;
        this.username = username;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Users{" +
                "uid='" + uid + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
