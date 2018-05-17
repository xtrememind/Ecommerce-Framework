package com.ecf.registration;

import com.ecf.registration.models.User;

public class UserRegisterFactory extends RegisterFactory {
    @Override
    public User createUser(String type) {
        return null;
    }

    @Override
    public boolean validateFields() {
        return false;
    }
}
