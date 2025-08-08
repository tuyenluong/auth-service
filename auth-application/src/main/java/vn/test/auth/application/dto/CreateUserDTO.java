package vn.test.auth.application.dto;


import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateUserDTO {
    @NotBlank(message = "name must not be null")
    private String name;
    @NotBlank(message = "password must not be null")
    private String password;
}

