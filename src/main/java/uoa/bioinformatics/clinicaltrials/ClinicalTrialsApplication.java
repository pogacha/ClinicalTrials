package uoa.bioinformatics.clinicaltrials;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ClinicalTrialsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClinicalTrialsApplication.class, args);

    }
    private void insertTwoTrials(TrialRepository repository) {
        repository.save(new Trial("1", "completed", "gfdgfdfdgd", "gfdgfdfdgd", "gfdgfdfdgd", "gfdgfdfdgd", "link", "gfdgfdfdgd", "gfdgfdfdgd", "gfdgfdfdgd"));
//        repository.save(new Trial("gfdgfgd", "gfdg23f2gd", "gfdgfdfdgd", "gfdgfdfdgd", "gfdgfdfdfgfgd", "gfdgfdfdgd", "link", "gfdgfdfdgd", "gfdgfdfdgd", "gfdgfdfdgd"));
    }

    @Bean
    public CommandLineRunner run(TrialRepository repository) {
        return (args) -> {
            insertTwoTrials(repository);
            System.out.println(repository.findAll());
        };
    }
}
