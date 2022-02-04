package uoa.bioinformatics.clinicaltrials;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
public interface ImpRepository extends CrudRepository<Imp, String> {
    List<Imp> findImpById (String str);
}