package com.yinhe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HelloWordApplication {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  SpringApplication.run(HelloWordApplication.class, args);
	}

}
