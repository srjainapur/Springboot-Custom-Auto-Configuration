package com.java.custom.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.java.custom.service.HelloService;
import com.java.custom.service.HelloServiceImpl;



@Configuration
@ConditionalOnClass(HelloService.class)
public class HelloServiceAutoConfiguration {
	
	// conditional bean creation
	@Bean
	@ConditionalOnMissingBean
	public HelloService helloService() {
		return new HelloServiceImpl();
	}	
}
