package vn.test.auth.infrastructure.mapper;

import org.mapstruct.Mapper;
import vn.test.auth.business.domain.Users;
import vn.test.auth.infrastructure.entity.UsersSql;

@Mapper(componentModel = "spring")
public interface UserSqlMapper {
    UsersSql from(Users user);

    Users to(UsersSql userSql);
}

