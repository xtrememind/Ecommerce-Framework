package com.ecf.registration;

import com.ecf.domain.Address;
import com.ecf.domain.Client;
import com.ecf.registration.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserRegisterFactory implements RegisterFactory {



    public UserRegisterFactory(){
    }

    @Override
    public User createUser(String type) {
//        Client client =new Client();
//		client.setName("Test");
//
		Address add =new Address();
		add.setCity("City");
		add.setState("state");
		add.setStreetName("street");
//
//		client.setBillingAddress(add);
//		client.setShippingAddress(add);
//

        return null;
    }
}
