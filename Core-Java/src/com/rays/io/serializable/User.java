package com.rays.io.serializable;

import java.io.Serializable;

public class User implements Serializable{

    public String login;
    transient public String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "User [login=" + login + ", password=" + password + "]";
    }

    
    

}
