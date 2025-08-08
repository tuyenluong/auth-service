package vn.test.auth.application.mapper;

import jakarta.validation.Valid;
import org.mapstruct.Mapper;
import vn.test.auth.application.dto.CreateUserDTO;
import vn.test.auth.business.domain.Users;

@Mapper(componentModel = "spring")
public interface UserReqResMapper {
    Users from(@Valid CreateUserDTO createUserDTO);
}

