package uoa.bioinformatics.clinicaltrials;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, String> {
    List<User> findUserById (String str);
}
