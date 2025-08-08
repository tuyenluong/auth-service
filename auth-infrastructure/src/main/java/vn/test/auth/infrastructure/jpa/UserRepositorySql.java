package vn.test.auth.infrastructure.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.test.auth.infrastructure.entity.UsersSql;

public interface UserRepositorySql extends JpaRepository<UsersSql, Long> {
}
