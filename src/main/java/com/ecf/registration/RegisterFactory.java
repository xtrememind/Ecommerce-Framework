package com.ecf.registration;


import com.ecf.registration.models.User;

public interface RegisterFactory {

    public User createUser(String type);


}
