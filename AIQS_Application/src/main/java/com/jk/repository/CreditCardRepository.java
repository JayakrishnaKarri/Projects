package com.jk.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;

import com.jk.entity.CreditCard;
import com.jk.entity.UserProfile;

import jakarta.transaction.Transactional;

public interface CreditCardRepository extends JpaRepository<CreditCard, Long> {

	@Transactional
	@Modifying
	void deleteAllByUserId(UserProfile user);

	List<CreditCard> findAllByUserId(UserProfile user);
}