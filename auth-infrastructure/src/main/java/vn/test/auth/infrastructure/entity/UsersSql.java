package vn.test.auth.infrastructure.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "usersPre")
@Getter
@Setter
public class UsersSql {

    @Id
    private long id;

    @Column(name = "name")
    private String email;

    @Column(name = "password")
    private String password;
}
