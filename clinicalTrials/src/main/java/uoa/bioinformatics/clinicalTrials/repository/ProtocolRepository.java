package uoa.bioinformatics.clinicalTrials.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uoa.bioinformatics.clinicalTrials.model.Protocol;

@Repository
public interface ProtocolRepository extends JpaRepository<Protocol, String>{
}
