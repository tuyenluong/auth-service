package vn.test.auth.business.repo;

import vn.test.auth.business.domain.Authority;

public interface AuthorityRepo {

    Authority findById(String id);
}
