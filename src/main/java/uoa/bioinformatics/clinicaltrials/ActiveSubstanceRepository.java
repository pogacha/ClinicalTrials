package uoa.bioinformatics.clinicaltrials;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
public interface ActiveSubstanceRepository extends CrudRepository<ActiveSubstance, String> {
    List<ActiveSubstance> findActiveSubstancesByCasNumber (String str);
}
