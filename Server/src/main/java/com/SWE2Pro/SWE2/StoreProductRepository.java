package com.SWE2Pro.SWE2;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StoreProductRepository extends CrudRepository<StoreProduct, Long>{

    @Query("select u from StoreProduct u where u.Store = ?1")
    List<StoreProduct> findByStore(String Store);

}



