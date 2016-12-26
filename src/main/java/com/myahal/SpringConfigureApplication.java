package com.myahal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;

@SpringBootApplication
public class SpringConfigureApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringConfigureApplication.class, args);
	}
}
