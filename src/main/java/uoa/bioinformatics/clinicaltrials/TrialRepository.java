package uoa.bioinformatics.clinicaltrials;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
public interface TrialRepository extends CrudRepository<Trial, String> {
    List<Trial> findTrialsByEudraCTNumber(String str);
}
