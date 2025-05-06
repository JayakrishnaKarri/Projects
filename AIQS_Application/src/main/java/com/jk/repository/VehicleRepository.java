package com.jk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jk.entity.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {

}