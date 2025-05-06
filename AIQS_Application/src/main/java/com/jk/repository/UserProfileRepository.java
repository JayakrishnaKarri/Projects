package com.jk.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jk.entity.UserProfile;

public interface UserProfileRepository extends JpaRepository<UserProfile, Integer> {

	Optional<UserProfile> findByUserName(String userName);

	Optional<UserProfile> findByEmailId(String emailId);

	Optional<UserProfile> findByEmailIdAndUserName(String emailId, String userName);
}