package uoa.bioinformatics.clinicaltrials;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
public interface CriteriaRepository extends CrudRepository<Criteria, String> {
    List<Criteria> findCriteriaById(String str);
}