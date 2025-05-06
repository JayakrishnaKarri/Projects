package com.jk.entity;

import java.time.LocalDate;
import java.time.Year;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
public class Vehicle {

	@Id
	@GeneratedValue
	private Integer vehicleId;

	@NotNull
	private String vehicleName;
	private Integer vehicleNumber, seatingCapacity, vehicleCost, showroomPrice;
	private String vehicleMake, vehicleModel, stateOfRegistration, cityOfRegistration, fuelType;

	@DateTimeFormat(pattern = "yyyy")
	private Year yearOfPurchase, yearOfManufacture;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate dateOfRegistration;

	@JsonIgnore
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "quote_id", referencedColumnName = "quoteId")
	private Quote quote;

	public Integer getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(Integer vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public Integer getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(Integer vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public Integer getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setSeatingCapacity(Integer seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	public Integer getVehicleCost() {
		return vehicleCost;
	}

	public void setVehicleCost(Integer vehicleCost) {
		this.vehicleCost = vehicleCost;
	}

	public Integer getShowroomPrice() {
		return showroomPrice;
	}

	public void setShowroomPrice(Integer showroomPrice) {
		this.showroomPrice = showroomPrice;
	}

	public String getVehicleMake() {
		return vehicleMake;
	}

	public void setVehicleMake(String vehicleMake) {
		this.vehicleMake = vehicleMake;
	}

	public String getVehicleModel() {
		return vehicleModel;
	}

	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}

	public String getStateOfRegistration() {
		return stateOfRegistration;
	}

	public void setStateOfRegistration(String stateOfRegistration) {
		this.stateOfRegistration = stateOfRegistration;
	}

	public String getCityOfRegistration() {
		return cityOfRegistration;
	}

	public void setCityOfRegistration(String cityOfRegistration) {
		this.cityOfRegistration = cityOfRegistration;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public Year getYearOfPurchase() {
		return yearOfPurchase;
	}

	public void setYearOfPurchase(Year yearOfPurchase) {
		this.yearOfPurchase = yearOfPurchase;
	}

	public Year getYearOfManufacture() {
		return yearOfManufacture;
	}

	public void setYearOfManufacture(Year yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}

	public LocalDate getDateOfRegistration() {
		return dateOfRegistration;
	}

	public void setDateOfRegistration(LocalDate dateOfRegistration) {
		this.dateOfRegistration = dateOfRegistration;
	}

	public Quote getQuote() {
		return quote;
	}

	public void setQuote(Quote quote) {
		this.quote = quote;
	}
}