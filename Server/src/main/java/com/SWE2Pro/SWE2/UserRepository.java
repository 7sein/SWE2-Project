package com.SWE2Pro.SWE2;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long>{

    @Query("select u from User u where u.UserName = ?1")
    List<User> findByName(String UserName);

}
