package com.jk.entity;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
public class CreditCard {

	@Id
	@NotNull
	@Min(1000000000)
	@Column(unique = true)
	private Long creditCardNumber;

	@ManyToOne
	@JoinColumn(name = "user_id", referencedColumnName = "userId")
	private UserProfile userId;

	@Min(10000)
	private Long balance;

	@NotNull
	private String cardName;

	@DateTimeFormat(pattern = "MM-yyyy")
	private LocalDate validFrom, validTo;

	public Long getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(Long creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public UserProfile getUserId() {
		return userId;
	}

	public void setUserId(UserProfile userId) {
		this.userId = userId;
	}

	public Long getBalance() {
		return balance;
	}

	public void setBalance(Long balance) {
		this.balance = balance;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public LocalDate getValidFrom() {
		return validFrom;
	}

	public void setValidFrom(LocalDate validFrom) {
		this.validFrom = validFrom;
	}

	public LocalDate getValidTo() {
		return validTo;
	}

	public void setValidTo(LocalDate validTo) {
		this.validTo = validTo;
	}
}