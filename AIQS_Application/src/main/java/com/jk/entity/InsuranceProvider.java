package com.jk.entity;

import org.hibernate.annotations.ColumnDefault;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class InsuranceProvider {

	@Id
	private String insuranceProviderName;

	@ColumnDefault(value = "95")
	private Integer insuranceDeclaredValue;
	private Integer discount;

	public String getInsuranceProviderName() {
		return insuranceProviderName;
	}

	public void setInsuranceProviderName(String insuranceProviderName) {
		this.insuranceProviderName = insuranceProviderName;
	}

	public Integer getInsuranceDeclaredValue() {
		return insuranceDeclaredValue;
	}

	public void setInsuranceDeclaredValue(Integer insuranceDeclaredValue) {
		this.insuranceDeclaredValue = insuranceDeclaredValue;
	}

	public Integer getDiscount() {
		return discount;
	}

	public void setDiscount(Integer discount) {
		this.discount = discount;
	}
}