package com.app;

import com.ecf.authentication.UserProxyAuthentication;
import com.ecf.domain.Client;
import com.ecf.registration.models.User;
import com.ecf.validation.RangeValidator;
import com.ecf.validation.RequiredFieldValidator;
import com.ecf.validation.models.Request;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class RegisterController {
    @GetMapping("/register")
    public String register( ) {
        return "register";
    }

    @PostMapping("/register")
    public String login(@ModelAttribute Client user, Model model) {

        List<String> errList =new ArrayList<String>();

       //Validation change of responsibilities

        //Validation for UserName
        Request request = new Request();
        request.setControlName("UserName");
        request.setValue(user.name);

        RequiredFieldValidator requiredVali =new RequiredFieldValidator();
        requiredVali.validate(request);

        if(!request.isValid())
            errList.add(request.getError());

        //Validation for Password
        request.setControlName("Password");
        request.setValue(user.password);

        RangeValidator rangeVali =new RangeValidator(4);
        requiredVali.setNextValidator(rangeVali);
        requiredVali.validate(request);

        if(!request.isValid())
            errList.add(request.getError());

        if(errList.size()>0) {
            model.addAttribute("errors", errList);
            return "register";
        }
        else{
            return "redirect:/";
        }

    }
}
