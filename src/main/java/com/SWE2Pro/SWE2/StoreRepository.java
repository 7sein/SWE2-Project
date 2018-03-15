package com.SWE2Pro.SWE2;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StoreRepository extends CrudRepository<Store, Long>{

    @Query("select u from Store u where u.Name = ?1")
    List<Store> findByName(String Name);





}



