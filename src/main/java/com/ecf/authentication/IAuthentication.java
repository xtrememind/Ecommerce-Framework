package com.ecf.authentication;

import com.ecf.registration.models.User;

public interface IAuthentication {

     User IsAuthenticated(User user);
}
