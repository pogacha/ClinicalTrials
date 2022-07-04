package uoa.bioinformatics.clinicalTrials.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uoa.bioinformatics.clinicalTrials.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>{
}

