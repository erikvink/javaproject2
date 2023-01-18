package ee.bcs.javaproject.solution.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountEntityRepository extends JpaRepository<AccountEntity, String> {
    List<AccountEntity> findByLastNameContaining(String lastName);
    }
