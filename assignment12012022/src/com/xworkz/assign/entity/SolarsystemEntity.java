package com.xworkz.assign.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="solarS")
public class SolarsystemEntity {
	@Id
	@Column(name="solar_Id")
	private int SolarId;
	
	@Column(name="solar_brand")
	private String brand;
	
	@Column(name="tankmaterial")
	private String tankMaterial;
	
	@Column(name="tcapacity")
	private int tankCapacity;
	
	@Column(name="Warranty")
	private int warranty;
	
	@Column(name="heatAbsorption")
	private String heatAbsoptionMechanism;
	
	@Column(name="Price")
	private int price;
	
	public SolarsystemEntity() {
		super();
		
	}

	public SolarsystemEntity(int solarId, String brand, String tankMaterial, int tankCapacity, int warranty,
			String heatAbsoptionMechanism, int price) {
		super();
		SolarId = solarId;
		this.brand = brand;
		this.tankMaterial = tankMaterial;
		this.tankCapacity = tankCapacity;
		this.warranty = warranty;
		this.heatAbsoptionMechanism = heatAbsoptionMechanism;
		this.price = price;
	}

	public int getSolarId() {
		return SolarId;
	}

	public void setSolarId(int solarId) {
		SolarId = solarId;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getTankMaterial() {
		return tankMaterial;
	}

	public void setTankMaterial(String tankMaterial) {
		this.tankMaterial = tankMaterial;
	}

	public int getTankCapacity() {
		return tankCapacity;
	}

	public void setTankCapacity(int tankCapacity) {
		this.tankCapacity = tankCapacity;
	}

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}

	public String getHeatAbsoptionMechanism() {
		return heatAbsoptionMechanism;
	}

	public void setHeatAbsoptionMechanism(String heatAbsoptionMechanism) {
		this.heatAbsoptionMechanism = heatAbsoptionMechanism;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "SolarsystemEntity [SolarId=" + SolarId + ", brand=" + brand + ", tankMaterial=" + tankMaterial
				+ ", tankCapacity=" + tankCapacity + ", warranty=" + warranty + ", heatAbsoptionMechanism="
				+ heatAbsoptionMechanism + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	
	
	
	
}
