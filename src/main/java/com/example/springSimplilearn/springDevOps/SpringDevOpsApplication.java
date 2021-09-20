package com.example.springSimplilearn.springDevOps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.example.springSimplilearn.springDevOps")
@EntityScan("com.example.springSimplilearn.springDevOps.Entity")
@EnableJpaRepositories("com.example.springSimplilearn.springDevOps.repository")
public class SpringDevOpsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDevOpsApplication.class, args);
	}

}
