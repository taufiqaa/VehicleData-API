package com.mytask.models.repo;

import com.mytask.models.entities.VehicleData;

import org.springframework.data.repository.CrudRepository;

public interface VehicleDataRepository extends CrudRepository<VehicleData, String> {

}
