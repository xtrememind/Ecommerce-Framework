package com.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

//    @Autowired
//    private UserRepository userRepository;


    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        //UserRegisterFactory rec =new UserRegisterFactory();
//        rec.createUser("d");

//        Client client =new Client();
//        client.setName("Test");
//
//        Address add =new Address();
//        add.setCity("City");
//        add.setState("state");
//        add.setStreetName("street");
//
//        client.setBillingAddress(add);
//        client.setShippingAddress(add);
//
//        if(userRepository!=null)
//            userRepository.save(add);


        return "greeting";
    }
}
