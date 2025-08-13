package vn.test.auth.infrastructure.repo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;
import vn.test.auth.business.domain.Authority;
import vn.test.auth.business.repo.AuthorityRepo;
import vn.test.auth.infrastructure.jpa.AuthorityRepoSql;

@Slf4j
@Repository
@RequiredArgsConstructor
public class AuthorityRepoImp implements AuthorityRepo {

    private final AuthorityRepoSql authorityRepoSql;


    @Override
    public Authority findById(String id) {
        return authorityRepoSql.findById(id).get();
    }
}
