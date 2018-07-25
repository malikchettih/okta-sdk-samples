package com.gmail.malikchettih.rd.okta_sdk_samples.list_all_users;

import static org.junit.Assert.assertNotNull;

import com.gmail.malikchettih.rd.okta_sdk_samples.list_all_users.model.User;
import com.gmail.malikchettih.rd.okta_sdk_samples.list_all_users.services.UserService;
import com.okta.sdk.resource.user.UserList;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OktaApplicationTestSuite {

    @Autowired
    private UserService userService;
    
    @Test
    public void contextLoads() {
        List<User> userList = userService.findAllUsers();
        assertNotNull(userList);
    }
}
