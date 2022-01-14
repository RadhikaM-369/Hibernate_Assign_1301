package com.xworkz.assign.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="biscuit")

public class BiscuitEntity {
	@Id
	@Column(name="B_Id")
	private int Bid;
	
	@Column(name="B_brand")
	private String brand;
	
	@Column(name="B_name")
	private String name;
	
	@Column(name="B_baseIngrd")
	private String baseIngredient;
	
	@Column(name="B_manuf")
	private String manufDate;
	
	@Column(name="B_Expry")
	private String ExpiryDate;
	
	@Column(name="B_price")
	private int price;
	
	
	public BiscuitEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BiscuitEntity(int bid, String brand, String name, String baseIngredient, String manufDate, String expiryDate,
			int price) {
		super();
		Bid = bid;
		this.brand = brand;
		this.name = name;
		this.baseIngredient = baseIngredient;
		this.manufDate = manufDate;
		ExpiryDate = expiryDate;
		this.price = price;
	}
	public int getBid() {
		return Bid;
	}
	public void setBid(int bid) {
		Bid = bid;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBaseIngredient() {
		return baseIngredient;
	}
	public void setBaseIngredient(String baseIngredient) {
		this.baseIngredient = baseIngredient;
	}
	public String getManufDate() {
		return manufDate;
	}
	public void setManufDate(String manufDate) {
		this.manufDate = manufDate;
	}
	public String getExpiryDate() {
		return ExpiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		ExpiryDate = expiryDate;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "BiscuitEntity [Bid=" + Bid + ", brand=" + brand + ", name=" + name + ", baseIngredient="
				+ baseIngredient + ", manufDate=" + manufDate + ", ExpiryDate=" + ExpiryDate + ", price=" + price + "]";
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
