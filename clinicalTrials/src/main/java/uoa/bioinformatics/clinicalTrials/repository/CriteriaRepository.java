package uoa.bioinformatics.clinicalTrials.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import uoa.bioinformatics.clinicalTrials.model.Criteria;


@Repository
public interface CriteriaRepository extends JpaRepository<Criteria, String>{

    @Query(value = "SELECT * FROM criteria c where c.eudraCTNumber =  :eudraCTNUmber" , nativeQuery = true)
    Criteria findCriteriaByEudraCTNumber(@Param("eudraCTNUmber") String eudraCTNUmber);
}
