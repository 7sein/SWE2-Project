package com.SWE2Pro.SWE2;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Long>{

    @Query("select u from Product u where u.Name = ?1")
    List<Product> findByName(String Name);


}
