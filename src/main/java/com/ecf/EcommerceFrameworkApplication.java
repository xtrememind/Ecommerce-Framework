package com.ecf;

import com.ecf.domain.Address;
import com.ecf.domain.Client;
import com.ecf.registration.UserRepository;
import com.ecf.registration.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com")
public class EcommerceFrameworkApplication {

//	@Autowired
//	private static UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(EcommerceFrameworkApplication.class, args);
//		Client client =new Client();
//		client.setName("Test");
//
//		Address add =new Address();
//		add.setCity("City");
//		add.setState("state");
//		add.setStreetName("street");
//
//		client.setBillingAddress(add);
//		client.setShippingAddress(add);
//
//		userRepository.save(client);


	}



}
