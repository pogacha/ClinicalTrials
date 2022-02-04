package uoa.bioinformatics.clinicaltrials;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
public interface ComparatorRepository extends CrudRepository<Comparator, String> {
    List<Comparator> findComparatorsById(String str);
}
