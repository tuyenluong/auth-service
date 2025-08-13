package vn.test.auth.infrastructure.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.test.auth.business.domain.Authority;

import java.util.Optional;

@Repository
public interface AuthorityRepoSql extends JpaRepository<Authority, Long> {

    Optional<Authority> findById(String id);
}
