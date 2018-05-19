package com.ecf.registration.models;

public class Admin extends User {

    public Admin(String name,String pass,boolean isAdmin ) {
        this.password=pass;
        this.name=name;
        this.isAdmin=isAdmin;
        this.id=(int)(Math.random());
    }
}
