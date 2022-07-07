package uoa.bioinformatics.clinicalTrials.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uoa.bioinformatics.clinicalTrials.model.ActiveSubstance;

@Repository
public interface ActiveSubstanceRepository extends JpaRepository<ActiveSubstance, String>{
}

