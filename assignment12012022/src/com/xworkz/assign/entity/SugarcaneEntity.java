package com.xworkz.assign.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sugarcane")
public class SugarcaneEntity {
	@Id
	@Column(name="sugar_Id")
private int SCId;
	
	@Column(name="brand")
private String SCBrand;
	
	@Column(name="quality")
private String qlty;
	
	@Column(name="qtyOfSugarProduction")
private int qtyOfSugarProduced;
	
	@Column(name="qtyOfSugarCane")
private int qty;
	
	@Column(name="Price")
private int price;
	
	@Column(name="ProductionStart")
private int productionStartYear;



public SugarcaneEntity() {
	super();
	// TODO Auto-generated constructor stub
}

public SugarcaneEntity(int sCId, String sCBrand, String qlty, int qtyOfSugarProduced, int qty, int price,
		int productionStartYear) {
	super();
	SCId = sCId;
	SCBrand = sCBrand;
	this.qlty = qlty;
	this.qtyOfSugarProduced = qtyOfSugarProduced;
	this.qty = qty;
	this.price = price;
	this.productionStartYear = productionStartYear;
}

public int getSCId() {
	return SCId;
}

public void setSCId(int sCId) {
	SCId = sCId;
}

public String getSCBrand() {
	return SCBrand;
}

public void setSCBrand(String sCBrand) {
	SCBrand = sCBrand;
}

public String getQlty() {
	return qlty;
}

public void setQlty(String qlty) {
	this.qlty = qlty;
}

public int getQtyOfSugarProduced() {
	return qtyOfSugarProduced;
}

public void setQtyOfSugarProduced(int qtyOfSugarProduced) {
	this.qtyOfSugarProduced = qtyOfSugarProduced;
}

public int getQty() {
	return qty;
}

public void setQty(int qty) {
	this.qty = qty;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public int getProductionStartYear() {
	return productionStartYear;
}

public void setProductionStartYear(int productionStartYear) {
	this.productionStartYear = productionStartYear;
}

@Override
public String toString() {
	return "SugarcaneEntity [SCId=" + SCId + ", SCBrand=" + SCBrand + ", qlty=" + qlty + ", qtyOfSugarProduced="
			+ qtyOfSugarProduced + ", qty=" + qty + ", price=" + price + ", productionStartYear=" + productionStartYear
			+ "]";
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
