package vn.test.auth.infrastructure.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "authorityPre")
@Getter
@Setter
public class AuthoritySql {

    @Id
    private Long id;
    private String name;
}
