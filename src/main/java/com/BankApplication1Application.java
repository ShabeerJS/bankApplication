package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.annotations.SwaggerDefinition;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@SwaggerDefinition
public class BankApplication1Application {

	public static void main(String[] args) {
		SpringApplication.run(BankApplication1Application.class, args);
	}

}
