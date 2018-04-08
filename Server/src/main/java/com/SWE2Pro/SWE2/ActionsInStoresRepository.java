package com.SWE2Pro.SWE2;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ActionsInStoresRepository extends CrudRepository<ActionsInStores, Long>{

    @Query("select u from ActionsInStores u where u.storeId = ?1")
    List<ActionsInStores> getActions(Long storeId);

}
