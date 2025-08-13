package vn.test.auth.infrastructure.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.test.auth.business.domain.Users;
import vn.test.auth.infrastructure.entity.UsersSql;

import java.util.Optional;

@Repository
public interface UserRepositorySql extends JpaRepository<UsersSql, Long> {

    Optional<Users> findById(String id);
}
