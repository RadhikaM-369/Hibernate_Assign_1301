package com.xworkz.assign.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="factory")
public class FactoryEntity {
	@Id
	@Column(name="f_Id")
private int fId;
	
	@Column(name="f_Name")	
private String fname;
	
	@Column(name="f_type")
private String fType;
	
	@Column(name="f_Location")
private String flocation;
	
	@Column(name="f_Contact")
private long fcontact;
	
	@Column(name="f_Website")
private String fWebsite;
	
	@Column(name="f_Turnover")
private String fYearlyTurnOver;

public FactoryEntity() {
	super();
}

public FactoryEntity(int fId, String fname, String fType, String flocation, long fcontact, String fWebsite,
		String fYearlyTurnOver) {
	super();
	this.fId = fId;
	this.fname = fname;
	this.fType = fType;
	this.flocation = flocation;
	this.fcontact = fcontact;
	this.fWebsite = fWebsite;
	this.fYearlyTurnOver = fYearlyTurnOver;
}

public int getfId() {
	return fId;
}

public void setfId(int fId) {
	this.fId = fId;
}

public String getFname() {
	return fname;
}

public void setFname(String fname) {
	this.fname = fname;
}

public String getfType() {
	return fType;
}

public void setfType(String fType) {
	this.fType = fType;
}

public String getFlocation() {
	return flocation;
}

public void setFlocation(String flocation) {
	this.flocation = flocation;
}

public long getFcontact() {
	return fcontact;
}

public void setFcontact(long fcontact) {
	this.fcontact = fcontact;
}

public String getfWebsite() {
	return fWebsite;
}

public void setfWebsite(String fWebsite) {
	this.fWebsite = fWebsite;
}

public String getfYearlyTurnOver() {
	return fYearlyTurnOver;
}

public void setfYearlyTurnOver(String fYearlyTurnOver) {
	this.fYearlyTurnOver = fYearlyTurnOver;
}

@Override
public String toString() {
	return "FactoryEntity [fId=" + fId + ", fname=" + fname + ", fType=" + fType + ", flocation=" + flocation
			+ ", fcontact=" + fcontact + ", fWebsite=" + fWebsite + ", fYearlyTurnOver=" + fYearlyTurnOver + "]";
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
