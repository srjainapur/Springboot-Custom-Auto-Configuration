package com.java.customtest.bean;

import com.java.custom.service.HelloService;

public class CustomHelloService implements HelloService {
	
	@Override
    public void hello() {
        System.out.println("We are overriding our custom Hello Service");
    }
}
