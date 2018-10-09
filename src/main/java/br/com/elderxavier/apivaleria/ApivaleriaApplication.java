package br.com.elderxavier.apivaleria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ApivaleriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApivaleriaApplication.class, args);
	}
}
