package vn.test.auth.business.services.implement;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import vn.test.auth.business.domain.Users;
import vn.test.auth.business.repo.UserRepo;
import vn.test.auth.business.services.UsersService;
import vn.test.auth.common.dto.UsersDto;

import java.util.UUID;


@Slf4j
@Service
@RequiredArgsConstructor
public class UsersServiceImp implements UsersService {

    private UserRepo userRepo;

    @Override
    public Users create(Users user) {
        user.setId(UUID.randomUUID().toString());
        return userRepo.create(user);
    }


    @Override
    public ResponseEntity<UsersDto> login(UsersDto userDto) {
        return null;
    }
}
