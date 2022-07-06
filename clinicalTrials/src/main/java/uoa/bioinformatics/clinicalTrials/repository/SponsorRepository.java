package uoa.bioinformatics.clinicalTrials.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uoa.bioinformatics.clinicalTrials.model.Sponsor;

@Repository
public interface SponsorRepository extends JpaRepository<Sponsor, String>{
}

