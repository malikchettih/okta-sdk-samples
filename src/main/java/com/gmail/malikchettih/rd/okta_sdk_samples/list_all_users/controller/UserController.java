package com.gmail.malikchettih.rd.okta_sdk_samples.list_all_users.controller;

import com.gmail.malikchettih.rd.okta_sdk_samples.list_all_users.model.User;
import com.gmail.malikchettih.rd.okta_sdk_samples.list_all_users.services.UserService;
import com.okta.sdk.resource.user.UserList;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    
    @Autowired
    private UserService userService;

    @RequestMapping("/users")
    public List<User> users(){
        return userService.findAllUsers();
    }
    
}
