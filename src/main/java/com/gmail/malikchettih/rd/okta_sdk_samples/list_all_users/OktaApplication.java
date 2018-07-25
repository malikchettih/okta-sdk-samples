package com.gmail.malikchettih.rd.okta_sdk_samples.list_all_users;

import com.gmail.malikchettih.rd.okta_sdk_samples.list_all_users.model.User;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OktaApplication {

    public static void main(String[] args) {
        SpringApplication.run(OktaApplication.class, args);
    }

    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.addMappings(new PropertyMap<com.okta.sdk.resource.user.User, User>() {
            @Override
            protected void configure() {
                map().setFirstName(source.getProfile().getFirstName());
                map().setLastName(source.getProfile().getLastName());
                map().setEmail(source.getProfile().getFirstName());
            }
        });
        return modelMapper;
    }
}
