package com.gmail.malikchettih.rd.okta_sdk_samples.list_all_users;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("okta")
public class OktaConfiguration {
    
    private String oktaDomaine;
    private String apiKey;

    public OktaConfiguration() {
    
    }

    
    public OktaConfiguration(String oktaDomaine, String apiKey) {
        this.oktaDomaine = oktaDomaine;
        this.apiKey = apiKey;
    }

    public String getOktaDomaine() {
        return oktaDomaine;
    }

    public void setOktaDomaine(String oktaDomaine) {
        this.oktaDomaine = oktaDomaine;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }
}
