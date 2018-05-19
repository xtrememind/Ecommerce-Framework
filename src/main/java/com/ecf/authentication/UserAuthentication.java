package com.ecf.authentication;

import com.ecf.Repository.UserRepository;
import com.ecf.registration.models.User;

public class UserAuthentication implements IAuthentication {

    UserRepository userRepo =UserRepository.getInstance();

    @Override
    public User IsAuthenticated(User user){
        return userRepo.findUser(user);
    }
}
