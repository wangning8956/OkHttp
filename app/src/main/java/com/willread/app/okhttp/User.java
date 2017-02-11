package com.willread.app.okhttp;

/**
 * Created by Administrator on 2017/2/8.
 */

public class User {
    public String username="1" ;
    public String password  ;

    public User() {
        // TODO Auto-generated constructor stub
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString()
    {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
