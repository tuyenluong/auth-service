package vn.test.auth.business.repo;


import vn.test.auth.business.domain.Users;

public interface UserRepo {

    Users create(Users user);

    Users findById(String id);
}
