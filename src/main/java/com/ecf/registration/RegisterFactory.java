package com.ecf.registration;


import com.ecf.domain.Address;
import com.ecf.registration.models.User;

public interface RegisterFactory {

    public void createUser(String name, String pass, Address s,Address b, String type);


}
