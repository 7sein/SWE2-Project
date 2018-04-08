package com.SWE2Pro.SWE2;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface Stores_StoreOwners_Repository extends CrudRepository<Stores_StoreOwners, Long> {

    @Query("select u from Stores_StoreOwners u where u.StoreOwnerId = ?1")
    List<Stores_StoreOwners> getStores(Long StoreOwnerId);

    @Query("select u from Stores_StoreOwners u where u.StoreId = ?1")
    List<Stores_StoreOwners> getStoreOwners(Long StoreId);

}



