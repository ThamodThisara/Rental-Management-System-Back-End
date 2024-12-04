package com.icetteam.crm.repository;

import com.icetteam.crm.entity.RentalEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentalRepository extends JpaRepository<RentalEntity,Integer> {
}
