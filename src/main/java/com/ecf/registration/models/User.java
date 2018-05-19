package com.ecf.registration.models;

public abstract class User {
    public Integer id;
    public String name;
    public String password;
    public boolean isAdmin;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setIsAdmin(boolean isAdmin){
        this.isAdmin=isAdmin;
    }
    public boolean getIsAdmin(){
        return this.isAdmin;
    }
}
