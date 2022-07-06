package uoa.bioinformatics.clinicalTrials.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import uoa.bioinformatics.clinicalTrials.model.Comparator;

import java.util.List;


@Repository
public interface ComparatorRepository extends JpaRepository<Comparator, String>{

    @Query(value = "SELECT * FROM comparator c where c.eudraCTNumber =  :eudraCTNUmber" , nativeQuery = true)
    List<Comparator> findComparatorByEudraCTNumber(@Param("eudraCTNUmber") String eudraCTNUmber);
}
