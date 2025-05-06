package com.jk.entity;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
public class Quote {

	@Id
	@GeneratedValue
	private Integer quoteId;

	@JsonIgnore
	@OneToOne
	@JoinColumn(name = "vehicle_id", referencedColumnName = "vehicleId")
	private Vehicle vehicleId;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "insurance_provider", referencedColumnName = "insuranceProviderName")
	private InsuranceProvider insuranceProvider;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "credit_card", referencedColumnName = "creditCardNumber")
	private CreditCard creditCard;

	@NotNull
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate policyStartDate, previousPolicyExpiryDate, validityPeriod;

	private Integer insuranceCoverInMonths;
	private String validityStatus, policyType; // new //renewal

	public Integer getQuoteId() {
		return quoteId;
	}

	public void setQuoteId(Integer quoteId) {
		this.quoteId = quoteId;
	}

	public Vehicle getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(Vehicle vehicleId) {
		this.vehicleId = vehicleId;
	}

	public InsuranceProvider getInsuranceProvider() {
		return insuranceProvider;
	}

	public void setInsuranceProvider(InsuranceProvider insuranceProvider) {
		this.insuranceProvider = insuranceProvider;
	}

	public CreditCard getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}

	public LocalDate getPolicyStartDate() {
		return policyStartDate;
	}

	public void setPolicyStartDate(LocalDate policyStartDate) {
		this.policyStartDate = policyStartDate;
	}

	public LocalDate getPreviousPolicyExpiryDate() {
		return previousPolicyExpiryDate;
	}

	public void setPreviousPolicyExpiryDate(LocalDate previousPolicyExpiryDate) {
		this.previousPolicyExpiryDate = previousPolicyExpiryDate;
	}

	public LocalDate getValidityPeriod() {
		return validityPeriod;
	}

	public void setValidityPeriod(LocalDate validityPeriod) {
		this.validityPeriod = validityPeriod;
	}

	public Integer getInsuranceCoverInMonths() {
		return insuranceCoverInMonths;
	}

	public void setInsuranceCoverInMonths(Integer insuranceCoverInMonths) {
		this.insuranceCoverInMonths = insuranceCoverInMonths;
	}

	public String getValidityStatus() {
		return validityStatus;
	}

	public void setValidityStatus(String validityStatus) {
		this.validityStatus = validityStatus;
	}

	public String getPolicyType() {
		return policyType;
	}

	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}
}