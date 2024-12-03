package com.packtpub.restapp.movie_managementf24;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Configuration
@EnableAutoConfiguration
@ComponentScan("com.packtpub")
@EnableJpaRepositories("com.packtpub.model.repository")
@EntityScan("com.packtpub.model.entity")
@Controller
@SpringBootApplication

public class MovieManagement {
	public static void main(String[] args) {
		SpringApplication.run(MovieManagement.class, args);
	}

}
