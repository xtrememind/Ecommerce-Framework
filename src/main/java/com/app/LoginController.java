package com.app;



import com.ecf.authentication.UserProxyAuthentication;
import com.ecf.domain.Client;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login( ) {
        return "login";
    }

    @PostMapping("/login")
    public String login( @ModelAttribute Client user, Model model) {
        UserProxyAuthentication userProxy =new UserProxyAuthentication();
        String page=userProxy.getUserAccesssPage(user);
        if(page.length()==0) {
            model.addAttribute("error", "User Name or Password is wrong");
            return "login";

        }
        else
            return "redirect:/"+page;

    }
}
