package com.mytask.services;

import javax.transaction.Transactional;
import java.util.Optional;

import com.mytask.models.entities.VehicleData;
import com.mytask.models.repo.VehicleDataRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class VehicleDataService {

    @Autowired
    private VehicleDataRepository vehicleDataRepository;

    public VehicleData save(VehicleData vehicleData) {
        return vehicleDataRepository.save(vehicleData);
    }

    public VehicleData findOne(String registration_number) {
        Optional<VehicleData> vehicleData = vehicleDataRepository.findById(registration_number);
        if (!vehicleData.isPresent()) {
            return null;
        } else {
            return vehicleData.get();
        }
    }

    public Iterable<VehicleData> findAll() {
        return vehicleDataRepository.findAll();
    }

    public void removeOne(String registration_number) {
        vehicleDataRepository.deleteById(registration_number);
    }
}
