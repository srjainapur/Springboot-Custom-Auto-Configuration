package com.java.customtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.java.custom.service.HelloService;
import com.java.customtest.bean.CustomHelloService;

@SpringBootApplication
public class TestCustomAutoConfigurationApplication implements CommandLineRunner {
	
	@Autowired
	private HelloService defaultHelloService; 
	
	@Bean
    public  HelloService helloService(){
        return new CustomHelloService();
    }
	
	public static void main(String[] args) {
		SpringApplication.run(TestCustomAutoConfigurationApplication.class, args);
	}

	@Override
    public void run(String... strings) throws Exception {
		defaultHelloService.hello();
    }
}
