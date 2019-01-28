package com.okta.developer.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.okta.developer.demo.entity.*;
import com.okta.developer.demo.repository.*;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import java.util.stream.Stream;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Bean
	ApplicationRunner init(LoginRepository loginRepository) {
		return args -> {

			Login login = new Login();
			login.setEmail("prewphayom@gmail.com");
			login.setPhone("0956399315");
			login.setPassword("123");

			loginRepository.save(login);
			loginRepository.findAll().forEach(System.out::println);
		};
	}
}

