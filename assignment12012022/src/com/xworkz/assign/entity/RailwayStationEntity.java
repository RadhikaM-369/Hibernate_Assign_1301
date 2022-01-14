package com.xworkz.assign.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="railwayStation")

public class RailwayStationEntity{
	@Id
	@Column(name="Rs_Id")
	private int RSId;
	
	@Column(name="Rs_Name")
	private String RSName ;
	
	@Column(name="Rs_location")
	private String RSlocation;
	
	@Column(name="Rs_platforms")
	private int Platforms;
	
	@Column(name="RS_Contact")
	private long RSContact;
	
	@Column(name="RS_Website")
	private String website;
	
	@Column(name="Rs_staff")
	private int noOfStaff;
	
	public RailwayStationEntity() {
		super();
	}

	public RailwayStationEntity(int rSId, String rSName, String rSlocation, int platforms, long rSContact,
			String website, int noOfStaff) {
		super();
		RSId = rSId;
		RSName = rSName;
		RSlocation = rSlocation;
		Platforms = platforms;
		RSContact = rSContact;
		this.website = website;
		this.noOfStaff = noOfStaff;
	}

	public int getRSId() {
		return RSId;
	}

	public void setRSId(int rSId) {
		RSId = rSId;
	}

	public String getRSName() {
		return RSName;
	}

	public void setRSName(String rSName) {
		RSName = rSName;
	}

	public String getRSlocation() {
		return RSlocation;
	}
	public void setRSlocation(String rSlocation) {
		RSlocation = rSlocation;
	}
	public int getPlatforms() {
		return Platforms;
	}

	public void setPlatforms(int platforms) {
		Platforms = platforms;
	}

	public long getRSContact() {
		return RSContact;
	}
	public void setRSContact(long rSContact) {
		RSContact = rSContact;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public int getNoOfStaff() {
		return noOfStaff;
	}
	public void setNoOfStaff(int noOfStaff) {
		this.noOfStaff = noOfStaff;
	}
	@Override
	public String toString() {
		return "RailwayStationEntity [RSId=" + RSId + ", RSName=" + RSName + ", RSlocation=" + RSlocation
				+ ", Platforms=" + Platforms + ", RSContact=" + RSContact + ", website=" + website + ", noOfStaff="
				+ noOfStaff + "]";
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
