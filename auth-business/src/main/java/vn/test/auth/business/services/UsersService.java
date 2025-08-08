package vn.test.auth.business.services;

import org.springframework.http.ResponseEntity;
import vn.test.auth.common.dto.UsersDto;
import vn.test.auth.business.domain.Users;

public interface UsersService {

    Users create(Users users);

    ResponseEntity<UsersDto> login(UsersDto userDto);


}
