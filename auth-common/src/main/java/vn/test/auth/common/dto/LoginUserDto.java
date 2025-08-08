package vn.test.auth.common.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginUserDto {

    private String email;
    private String statusCode;
    private String message;
}
