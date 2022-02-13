package uoa.bioinformatics.clinicalTrials;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import uoa.bioinformatics.clinicalTrials.repository.TrialRepository;

@SpringBootApplication
public class ClinicalTrialsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClinicalTrialsApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner run(TrialRepository repository) {
//		return (args) -> {
//			System.out.println(repository.findAll());
//		};
//	}

}
