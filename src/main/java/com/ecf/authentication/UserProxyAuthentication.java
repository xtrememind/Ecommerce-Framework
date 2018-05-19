package com.ecf.authentication;

import com.ecf.registration.models.User;

public class UserProxyAuthentication implements IAuthentication {

    UserAuthentication auth =new UserAuthentication();

    @Override
    public User IsAuthenticated(User user){
        return auth.IsAuthenticated(user);
    }

    public String getUserAccesssPage(User user){

        User authenUser =IsAuthenticated(user);
        if(authenUser==null)
            return "";
        boolean isAdmin=authenUser.getIsAdmin();
        if(isAdmin)
            return "admin";
        else
            return "home";


    }
}
