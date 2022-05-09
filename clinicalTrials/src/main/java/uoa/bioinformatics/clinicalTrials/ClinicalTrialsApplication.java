package uoa.bioinformatics.clinicalTrials;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class ClinicalTrialsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClinicalTrialsApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/clinical-trials-bio/api/v1").allowedOrigins("http://localhost:4200");
			}
		};
	}
}
