package com.niharika.CourseProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.niharika.CourseProject.model.User;
import com.niharika.CourseProject.service.UserRepository;

@Configuration
@EnableAutoConfiguration
@ComponentScan
@EnableJpaRepositories
@SpringBootApplication
public class SpringBootFirstWebApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFirstWebApplication.class, args);
	}
}
