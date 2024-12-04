package com.icetteam.crm.repository;

import com.icetteam.crm.entity.CustomerEntity;
import com.icetteam.crm.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<CustomerEntity,Integer> {
    List<CustomerEntity> findByCity(String city);
    List<CustomerEntity> findByName(String name);
}
