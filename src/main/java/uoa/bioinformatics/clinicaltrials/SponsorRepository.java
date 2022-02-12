package uoa.bioinformatics.clinicaltrials;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
public interface SponsorRepository extends CrudRepository<Sponsor, String> {
    List<Sponsor> findSponsorBySponsorName(String str);
}
