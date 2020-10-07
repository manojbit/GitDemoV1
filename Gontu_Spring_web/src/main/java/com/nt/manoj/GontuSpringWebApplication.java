package com.nt.manoj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication   //(scanBasePackages = "com.nt")
public class GontuSpringWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(GontuSpringWebApplication.class, args);

	}

}
/*  @SpringBootApplication
 * 
 *  Indicates a configuration class that declares one or more @Bean methods and also triggers
 *  auto-configuration and component scanning. This is a convenience annotation that is equivalent 
 *  to declaring @Configuration, @EnableAutoConfiguration and @ComponentScan.


 * */
