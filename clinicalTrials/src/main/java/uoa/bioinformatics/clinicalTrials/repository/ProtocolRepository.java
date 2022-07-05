package uoa.bioinformatics.clinicalTrials.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import uoa.bioinformatics.clinicalTrials.model.Protocol;

import java.util.List;

@Repository
public interface ProtocolRepository extends JpaRepository<Protocol, String>{

    @Query(value = "SELECT * FROM protocol p where p.eudraCTNumber =  :eudraCTNUmber" , nativeQuery = true)
    Protocol findProtocolByEudraCTNumber(@Param("eudraCTNUmber") String eudraCTNUmber);
}
