package com.auth.springse.repo;

import com.auth.springse.model.UserRec;
//import com.auth.springse.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserRec, Integer> {

    UserRec findByUsername(String username);
}
