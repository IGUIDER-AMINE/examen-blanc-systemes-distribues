package com.enset.keynote_service;

import com.enset.keynote_service.entities.Keynote;
import com.enset.keynote_service.repository.KeynoteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class KeynoteServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(KeynoteServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(KeynoteRepository keynoteRepository, RepositoryRestConfiguration restConfiguration) {
		restConfiguration.exposeIdsFor(Keynote.class);
		return args -> {
			keynoteRepository.save(new Keynote(null,"Faroa", "Amine", "amine.faroa@example.com", "Developer"));
		};
	}
}
