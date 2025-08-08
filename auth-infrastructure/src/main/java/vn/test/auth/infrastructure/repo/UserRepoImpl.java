package vn.test.auth.infrastructure.repo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import vn.test.auth.business.domain.Users;
import vn.test.auth.business.repo.UserRepo;
import vn.test.auth.infrastructure.entity.UsersSql;
import vn.test.auth.infrastructure.jpa.UserRepositorySql;
import vn.test.auth.infrastructure.mapper.UserSqlMapper;

@Slf4j
@Repository
@RequiredArgsConstructor

public class UserRepoImpl implements UserRepo {

    private final UserRepositorySql userRepositorySql;
    private final UserSqlMapper userSqlMapper;


    @Override
    public Users create(Users user) {
        UsersSql userSql = userSqlMapper.from(user);
        UsersSql createdUser = userRepositorySql.save(userSql);
        return userSqlMapper.to(createdUser);
    }

}
