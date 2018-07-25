package com.gmail.malikchettih.rd.okta_sdk_samples.list_all_users.services;

import com.gmail.malikchettih.rd.okta_sdk_samples.list_all_users.OktaConfiguration;
import com.gmail.malikchettih.rd.okta_sdk_samples.list_all_users.model.User;
import com.okta.sdk.authc.credentials.TokenClientCredentials;
import com.okta.sdk.client.Client;
import com.okta.sdk.client.Clients;
import com.okta.sdk.resource.user.UserList;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private OktaConfiguration oktaConfiguration;

    @Autowired
    private ModelMapper modelMapper;
    
    protected Client getOktaClient (){
        return Clients.builder()
                .setOrgUrl(oktaConfiguration.getOktaDomaine())
                .setClientCredentials(new TokenClientCredentials(oktaConfiguration.getApiKey()))
                .build();
    }
    
    public List<User> findAllUsers(){
        Client oktaClient = getOktaClient();
        UserList userList = oktaClient.listUsers();
        return userList.stream().map(user -> convertUser(user)).collect(Collectors.toList());
    }

    private User convertUser(com.okta.sdk.resource.user.User oktaUser){
        User user = modelMapper.map(oktaUser, User.class);
        return user;
    }
    
}
