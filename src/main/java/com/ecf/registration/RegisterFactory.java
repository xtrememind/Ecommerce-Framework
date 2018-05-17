package com.ecf.registration;


import com.ecf.registration.models.User;

public abstract class RegisterFactory {
    public final void Register(String type){
        if(validateFields())
            createUser(type);
    }
    public abstract User createUser(String type);

    public abstract boolean validateFields();
}
