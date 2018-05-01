package com.test.webapp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.web.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import com.test.webapp.service.EmployeeServiceInterface;

@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
@ComponentScan("com.test.webapp")
public class SpringBootDemoApplication {

	@Autowired
	EmployeeServiceInterface employeeServiceInterface;
	
    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoApplication.class, args);
    }
   
   
}

