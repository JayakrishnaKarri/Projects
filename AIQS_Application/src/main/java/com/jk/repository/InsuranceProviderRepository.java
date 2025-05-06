package com.jk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jk.entity.InsuranceProvider;

public interface InsuranceProviderRepository extends JpaRepository<InsuranceProvider, String> {

}