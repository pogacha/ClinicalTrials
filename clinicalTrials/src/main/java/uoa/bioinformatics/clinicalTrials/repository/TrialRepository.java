package uoa.bioinformatics.clinicalTrials.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uoa.bioinformatics.clinicalTrials.model.Trial;

@Repository
public interface TrialRepository extends JpaRepository<Trial, String>{
}

