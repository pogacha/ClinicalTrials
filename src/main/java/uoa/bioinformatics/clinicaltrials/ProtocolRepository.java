package uoa.bioinformatics.clinicaltrials;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
public interface ProtocolRepository extends CrudRepository<Protocol, String> {
    List<Protocol> findProtocolsById (String str);
}
