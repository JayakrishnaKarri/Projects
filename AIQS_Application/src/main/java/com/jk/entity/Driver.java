package com.jk.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Min;
import lombok.Data;

@Data
@Entity
public class Driver {

	@Id
	@Min(10000)
	private Integer licenseNumber;

	@OneToOne
	@JoinColumn(name = "user_id", referencedColumnName = "userId")
	private UserProfile userId;

	@JsonIgnore
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "driver_name", referencedColumnName = "userName")
	private UserProfile driverName;

	@ManyToOne
	@JoinColumn(name = "vehicle_id", referencedColumnName = "vehicleId")
	private Vehicle vehicleId;

	public Integer getLicenseNumber() {
		return licenseNumber;
	}

	public void setLicenseNumber(Integer licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	public UserProfile getUserId() {
		return userId;
	}

	public void setUserId(UserProfile userId) {
		this.userId = userId;
	}

	public UserProfile getDriverName() {
		return driverName;
	}

	public void setDriverName(UserProfile driverName) {
		this.driverName = driverName;
	}

	public Vehicle getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(Vehicle vehicleId) {
		this.vehicleId = vehicleId;
	}
}