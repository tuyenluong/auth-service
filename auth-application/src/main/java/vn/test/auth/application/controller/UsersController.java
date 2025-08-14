package vn.test.auth.application.controller;


import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.test.auth.application.dto.CreateUserDTO;
import vn.test.auth.application.mapper.UserReqResMapper;
import vn.test.auth.business.domain.Users;
import vn.test.auth.business.services.UsersService;

@Slf4j
@RestController
@RequestMapping("/v1/auth")
public class UsersController {

    private final UsersService usersService;
    private final UserReqResMapper userReqResMapper;

    public UsersController(UsersService usersService, UserReqResMapper userReqResMapper){
        this.usersService = usersService;
        this.userReqResMapper = userReqResMapper;
    }

//    @PostMapping("/login")
//    public ResponseEntity<LoginUserDto> login(UsersDto userDto){
//
//        usersService.login(userDto);
//
//        HttpStatus status = HttpStatus.OK;
//
//        LoginUserDto loginDto = new LoginUserDto();
//
//        loginDto.setEmail("demo@email.com");
//        loginDto.setStatusCode(status.toString());
//        loginDto.setMessage("Sucessful");
//
//        return ResponseEntity.status(status).body(loginDto);
//    }


    @PostMapping("/create")
    public ResponseEntity<Users> create(@RequestBody @Valid CreateUserDTO createUserDTO) {
        Users user = userReqResMapper.from(createUserDTO);
        Users createdUser = usersService.create(user);
        return ResponseEntity.ok(createdUser);
    }

}
