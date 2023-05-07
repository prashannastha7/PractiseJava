package com.practise.Blog.service;

import com.practise.Blog.Data_Transferonj.RegisterRequest;
import com.practise.Blog.model.User;
import com.practise.Blog.respository.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AuthService {
    @Autowired
    private UserRespository userRespository;
    public void signup(RegisterRequest registerRequest){
        User user = new User();
        user.setUserName(registerRequest.getUsername());
        user.setPassword(registerRequest.getPassword());
        user.setEmail(registerRequest.getEmail());

        userRespository.save(user);
    }
}
