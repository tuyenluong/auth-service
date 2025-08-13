package vn.test.auth.infrastructure.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories("vn.test.auth.infrastructure.jpa.*")
@EntityScan("vn.test.auth.infrastructure.entity.*")
@Configuration
public class JpaConfig {
}
