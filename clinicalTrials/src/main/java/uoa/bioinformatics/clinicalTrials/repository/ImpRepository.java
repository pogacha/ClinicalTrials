package uoa.bioinformatics.clinicalTrials.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import uoa.bioinformatics.clinicalTrials.model.Imp;



@Repository
public interface ImpRepository extends JpaRepository<Imp, String>{

    @Query(value = "SELECT * FROM imp i where i.eudraCTNumber =  :eudraCTNUmber" , nativeQuery = true)
    Imp findImpByEudraCTNumber(@Param("eudraCTNUmber") String eudraCTNUmber);
}

