package com.ugtworld.dependencyinjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.ugtworld")
public class DependencyinjectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(DependencyinjectionApplication.class, args);
	}

}
