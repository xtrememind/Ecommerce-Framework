package com.ecf.Repository;

import com.ecf.domain.Address;
import com.ecf.domain.Client;
import com.ecf.registration.models.Admin;
import com.ecf.registration.models.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

     private static UserRepository userRepository;
     List<User> listUser;

     private UserRepository(){
         listUser=new ArrayList<>();
         listUser.add(new Admin("shamal","1234",true));

         listUser.add(new Client("fernando","1234",false,
                 new Address("main street","Fairfiled","Iowa"),
                 new Address("main street","Fairfiled","Iowa")));
     }

     public static UserRepository getInstance(){
         if(userRepository==null)
             userRepository=new UserRepository();
         return userRepository;
     }

     public void addUser(User user){
         listUser.add(user);
     }

     public User findUser(User user){
        try {
            User AuthUser = listUser.stream().filter(u -> u.getName().equals(user.getName())).findFirst().get();
            return AuthUser;
        }
        catch (Exception e){
            return null;
        }

     }





}
