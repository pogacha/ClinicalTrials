package uoa.bioinformatics.clinicalTrials.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uoa.bioinformatics.clinicalTrials.model.Imp;

@Repository
public interface ImpRepository extends JpaRepository<Imp, String>{
}

