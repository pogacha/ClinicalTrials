package uoa.bioinformatics.clinicalTrials.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import uoa.bioinformatics.clinicalTrials.model.ActiveSubstance;

import java.util.List;

@Repository
public interface ActiveSubstanceRepository extends JpaRepository<ActiveSubstance, String>{


    @Query(value = "SELECT * FROM active_substance AS a INNER JOIN imp_substance_assoc ON imp_substance_assoc.imp_id=:impId AND imp_substance_assoc.cas_number = a.cas_number;" , nativeQuery = true)
    List<ActiveSubstance> findActiveSubstanceByImpId(@Param("impId") String impId);
}

