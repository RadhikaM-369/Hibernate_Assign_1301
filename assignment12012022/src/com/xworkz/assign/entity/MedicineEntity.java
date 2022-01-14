package com.xworkz.assign.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="medicine")

public class MedicineEntity {
	@Id
	@Column(name="M_Id")
	private int Mid;
	
	@Column(name="M_brand")
	private String brand;
	
	@Column(name="M_name")
	private String name;
	
	@Column(name="M_usedfor")
	private String usedFor;
	
	@Column(name="M_manuf")
	private String manufDate;
	
	@Column(name="M_Expry")
	private String ExpiryDate;
	
	@Column(name="M_price")
	private int price;
	
	
	public MedicineEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MedicineEntity(int mid, String brand, String name, String usedFor, String manufDate, String expiryDate,
			int price) {
		super();
		this.Mid = mid;
		this.brand = brand;
		this.name = name;
		this.usedFor = usedFor;
		this.manufDate = manufDate;
		this.ExpiryDate = expiryDate;
		this.price = price;
	}

	public int getMid() {
		return Mid;
	}

	public void setMid(int mid) {
		this.Mid = mid;
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

	public String getUsedFor() {
		return usedFor;
	}

	public void setUsedFor(String usedFor) {
		this.usedFor = usedFor;
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
		this.ExpiryDate = expiryDate;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "MedicineEntity [Mid=" + Mid + ", brand=" + brand + ", name=" + name + ", usedFor=" + usedFor
				+ ", manufDate=" + manufDate + ", ExpiryDate=" + ExpiryDate + ", price=" + price + "]";
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
