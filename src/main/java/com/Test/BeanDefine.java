package com.Test;

import org.springframework.context.annotation.Bean;

public class BeanDefine {

    @Bean
    public CustomerService customerService(){
        return new CustomerService();
    }
}
