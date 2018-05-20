package com.ecf.registration;

import com.ecf.Repository.UserRepository;
import com.ecf.domain.Address;
import com.ecf.domain.Client;
import com.ecf.registration.models.Admin;
import com.ecf.registration.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserRegisterFactory implements RegisterFactory {
    User user;
    Address address;
    UserRepository userRepo;
    public UserRegisterFactory() {
        userRepo=UserRepository.getInstance();
    }

    @Override
    public void createUser(String name, String pass, Address s,Address b, String type){

        switch (type) {
            case "CLIENT": {
                user=new Client(name,pass,false,s,b);
                userRepo.addUser(user);
                break;
            }
            case "ADMIN": {
                user=  user=new Admin(name,pass,true);
                userRepo.addUser(user);
                break;
            }
        }

    }

}
