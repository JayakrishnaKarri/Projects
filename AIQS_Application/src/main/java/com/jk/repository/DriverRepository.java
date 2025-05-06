package com.jk.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jk.entity.Driver;
import com.jk.entity.UserProfile;
import com.jk.entity.Vehicle;

public interface DriverRepository extends JpaRepository<Driver, Integer> {
	Optional<Driver> findByDriverName(UserProfile userName);

	Optional<Driver> findByVehicleId(Vehicle vehicle);

	List<Driver> findAllByVehicleId(Vehicle vehicle);
}